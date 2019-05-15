package com.jct.bd.patientapp.model.backend;


import com.jct.bd.patientapp.model.datasource.FireBase_DB_manager;

public class FactoryBackend {
    private static FireBase_DB_manager INSTANCE;

    //return new backend if he not exist
    public static FireBase_DB_manager getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new FireBase_DB_manager();
        }
        return INSTANCE;
    }
}