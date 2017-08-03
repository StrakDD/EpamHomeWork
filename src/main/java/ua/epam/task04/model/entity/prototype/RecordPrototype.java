package ua.epam.task04.model.entity.prototype;

import ua.epam.task04.model.entity.Record;

/**
 * Created by Denis Starovoitenko on 03.08.2017.
 */
public class RecordPrototype {
    private Record record;

    public RecordPrototype(Record record) {
        this.record = record;
    }

    public void setRecord(Record record) {
        this.record = record;
    }

    Record cloneRecord() {
        return (Record) record.copy();
    }
}
