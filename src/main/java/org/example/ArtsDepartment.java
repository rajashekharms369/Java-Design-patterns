package org.example;

public class ArtsDepartment implements Department{
    private String[] subjects;

    public ArtsDepartment() {
        subjects = new String[]{
                "1 Arts",
                "2 History",
                "3 Geography",
                "4 Psyschology",
        };
    }

    @Override
    public Iterator createIterator() {
        return new ArtsIterator(subjects);
    }
}
