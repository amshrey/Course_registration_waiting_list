package com.example.m5_hw.database;

/*************************************************************************************************
 * The class Student contains the Table and columns to be created in SQLite database.
 *************************************************************************************************/
public class Student {

    public static final String TABLE_NAME = "WaitingList";
    public static final String COLUMN_ID = "id";
    public static final String COLUMN_STUDENT_NAME = "name";
    public static final String COLUMN_PRIORITY = "priority";

    private int id;
    private String name;
    private String priority;

    // Create table SQL query
    public static final String CREATE_TABLE =
            "CREATE TABLE " + TABLE_NAME + "("
                    + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                    + COLUMN_STUDENT_NAME + " TEXT,"
                    + COLUMN_PRIORITY + " TEXT"
                    + ")";

    public Student() {
        //Empty constructor
    }

    /**********************************************************************************************
     * Constructor that creates a new instance takes ID, Name and Priority
     * @param id: ID of entry to be created
     * @param name: Student name
     * @param priority: Priority of the student
     **********************************************************************************************/
    public Student(int id, String name, String priority) {
        this.id = id;
        this.name = name;
        this.priority = priority;
    }


    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public String getPriority() {
        return priority;
    }

    /******** Set methods for private class members ********/


    public void setId(int id) {
        this.id = id;
    }


    public void setName(String name) {
        this.name = name;
    }


    public void setPriority(String priority) {
        this.priority = priority;
    }
}

