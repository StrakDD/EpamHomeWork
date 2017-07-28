package ua.epam.task04.model;

import ua.epam.task04.model.entity.NoteBook;
import ua.epam.task04.model.entity.Record;

/**
 * Created by Denis Starovoitenko on 27.07.2017.
 */
public class Model {
    private NoteBook noteBook;

    public Model(){
        this.noteBook = new NoteBook();
    }

    /**
     *
     * @param record
     */
    public void addRecord(Record record){
        noteBook.addRecord(record);
    }

}
