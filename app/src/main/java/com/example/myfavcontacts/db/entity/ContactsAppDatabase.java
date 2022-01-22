package com.example.myfavcontacts.db.entity;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Contact.class},version = 1)
public abstract class ContactsAppDatabase extends RoomDatabase {

    // Linking the DAO with our Database
    public abstract ContactDAO getContactDAO();



}