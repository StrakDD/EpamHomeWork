package ua.epam.task04.model.entity;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Denis Starovoitenko on 27.07.2017.
 */
public class NoteBook {
    private ArrayList<Record> records;

    public NoteBook(){
        records = new ArrayList<>();
    }

    public NoteBook(ArrayList<Record> records){
        this.records = records;
    }

    public ArrayList<Record> getRecords() {
        return records;
    }

    public void setRecords(ArrayList<Record> records) {
        this.records = records;
    }

    public boolean addRecord(Record record){
        record.setRecord(new Date());
        return records.add(record);
    }

}
