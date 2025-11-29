package com.example.assessment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class BookAdapter extends RecyclerView.Adapter<BookAdapter.BookViewHolder> {

    private List<BookItem> bookList;

    public BookAdapter(List<BookItem> bookList) {
        this.bookList = bookList;
    }

    @NonNull
    @Override
    public BookViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_book, parent, false);
        return new BookViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BookViewHolder holder, int position) {
        BookItem bookItem = bookList.get(position);
        holder.bookName.setText(bookItem.getName());
        holder.bookText.setText(bookItem.getText());
        holder.bookPerson.setText(bookItem.getPerson());


    }

    @Override
    public int getItemCount() {
        return bookList.size();
    }

    static class BookViewHolder extends RecyclerView.ViewHolder {
        TextView bookName;
        TextView bookText;
        TextView bookPerson;
        Button btnedit;
        Button btndel;

        public BookViewHolder(@NonNull View itemView) {
            super(itemView);
            bookName = itemView.findViewById(R.id.book_name);
            bookText = itemView.findViewById(R.id.book_text);
            bookPerson = itemView.findViewById(R.id.book_person);
            btnedit = itemView.findViewById(R.id.btn_edit);
            btndel = itemView.findViewById(R.id.btn_del);
        }
    }
}