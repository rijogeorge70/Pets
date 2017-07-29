package com.example.user.pets.data;

import android.provider.BaseColumns;

/**
 * Created by User on 29/Jul/2017.
 */

public final class PetsContract
{
    public static abstract class PetEntry implements BaseColumns
    {
        public static final String TABLE_NAME = "Pets";


        public static final String _ID = BaseColumns._ID;
        public static final String COLUMN_PET_NAME = "name";
        public static final String COLUMN_PET_BREED = "breed";
        public static final String COLUMN_PET_GENGER ="gender";
        public static final String COLUMN_PET_WEIGHT = "weight";


        public static final int GENDER_UNKNOWN = 0;
        public static final int GENDER_MALE = 1;
        public static final int GENDER_FEMALE = 2;
    }
}
