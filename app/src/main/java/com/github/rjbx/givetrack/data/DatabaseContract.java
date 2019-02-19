package com.github.rjbx.givetrack.data;

import android.net.Uri;
import android.provider.BaseColumns;

/**
 * Defines attributes for tables and entries of database initialized in {@link DatabaseOpener}.
 */
public final class DatabaseContract {

    static final String AUTHORITY = "com.github.rjbx.givetrack";
    static final String PATH_SEARCH_TABLE = "search.table";
    static final String PATH_GIVING_TABLE = "giving.table";
    static final String PATH_RECORD_TABLE = "record.table";
    static final String PATH_USER_TABLE = "user.table";

    private static final String SCHEME = "content";
    private static final Uri BASE_URI = Uri.parse(SCHEME + "://" + AUTHORITY);

    public static final int LOADER_ID_SEARCH = 1;
    public static final int LOADER_ID_GIVING = 2;
    public static final int LOADER_ID_RECORD = 3;
    public static final int LOADER_ID_USER = 4;

    public static final class CompanyEntry implements BaseColumns {

        static final String TABLE_NAME_SEARCH = "search";
        static final String TABLE_NAME_GIVING = "giving";
        static final String TABLE_NAME_RECORD = "record";
        
        public static final Uri CONTENT_URI_SEARCH =
                BASE_URI.buildUpon().appendPath(PATH_SEARCH_TABLE).build();
        public static final Uri CONTENT_URI_GIVING =
                BASE_URI.buildUpon().appendPath(PATH_GIVING_TABLE).build();
        public static final Uri CONTENT_URI_RECORD =
                BASE_URI.buildUpon().appendPath(PATH_RECORD_TABLE).build();

        public static final String COLUMN_EIN = "ein";
        public static final String COLUMN_CHARITY_NAME = "charityName";
        public static final String COLUMN_LOCATION_STREET = "locationStreet";
        public static final String COLUMN_LOCATION_DETAIL = "locationDetail";
        public static final String COLUMN_LOCATION_CITY = "locationCity";
        public static final String COLUMN_LOCATION_STATE = "locationState";
        public static final String COLUMN_LOCATION_ZIP = "locationZip";
        public static final String COLUMN_HOMEPAGE_URL = "homepageUrl";
        public static final String COLUMN_NAVIGATOR_URL = "navigatorUrl";
        public static final String COLUMN_PHONE_NUMBER = "phoneNumber";
        public static final String COLUMN_EMAIL_ADDRESS = "emailAddress";
        public static final String COLUMN_DONATION_IMPACT = "donationTotal";
        public static final String COLUMN_DONATION_TYPE = "donationType";
        public static final String COLUMN_DONATION_PERCENTAGE = "donationPercentage";
        public static final String COLUMN_DONATION_FREQUENCY = "donationFrequency";
        public static final String COLUMN_DONATION_MEMO = "donationNotes";
        public static final String COLUMN_DONATION_TIME = "donationTime";

        public static final int INDEX_EIN = 0;
        public static final int INDEX_CHARITY_NAME = 1;
        public static final int INDEX_LOCATION_STREET = 2;
        public static final int INDEX_LOCATION_DETAIL = 3;
        public static final int INDEX_LOCATION_CITY = 4;
        public static final int INDEX_LOCATION_STATE = 5;
        public static final int INDEX_LOCATION_ZIP = 6;
        public static final int INDEX_HOMEPAGE_URL = 7;
        public static final int INDEX_NAVIGATOR_URL = 8;
        public static final int INDEX_PHONE_NUMBER = 9;
        public static final int INDEX_EMAIL_ADDRESS = 10;
        public static final int INDEX_DONATION_IMPACT = 11;
        public static final int INDEX_DONATION_TYPE = 12;
        public static final int INDEX_DONATION_PERCENTAGE = 13;
        public static final int INDEX_DONATION_NOTES = 13;
        public static final int INDEX_DONATION_FREQUENCY = 14;
        public static final int INDEX_DONATION_TIME = 15;
    }

    public static final class UserEntry implements BaseColumns {
        static final String TABLE_NAME_USER = "user";

        public static final Uri CONTENT_URI_USER =
                BASE_URI.buildUpon().appendPath(PATH_USER_TABLE).build();

        public static final String COLUMN_UID = "uid";
        public static final String COLUMN_EMAIL = "email";
        public static final String COLUMN_BIRTHDATE = "birthdate";
        public static final String COLUMN_GENDER = "gender";
        public static final String COLUMN_THEME = "theme";
        public static final String COLUMN_MAGNITUDE = "magnitude";
        public static final String COLUMN_DONATION = "donation";
        public static final String COLUMN_TERM = "term";
        public static final String COLUMN_CITY = "city";
        public static final String COLUMN_STATE = "state";
        public static final String COLUMN_ZIP = "zip";
        public static final String COLUMN_MINRATING = "minrating";
        public static final String COLUMN_FILTER = "filter";
        public static final String COLUMN_RECORDSORT = "sortRecord";
        public static final String COLUMN_SEARCHSORT = "sortSearch";
        public static final String COLUMN_RECORDORDER = "orderRecord";
        public static final String COLUMN_SEARCHORDER = "orderSearch";
        public static final String COLUMN_PAGES = "pages";
        public static final String COLUMN_ROWS = "rows";
        public static final String COLUMN_FOCUS = "focus";
        public static final String COLUMN_COMPANY = "company";
        public static final String COLUMN_VIEWTRACK = "viewtrack";
        public static final String COLUMN_SEARCHGUIDE = "searchguide";
        public static final String COLUMN_HISTORICAL = "historical";
        public static final String COLUMN_ANCHOR = "anchor";
        public static final String COLUMN_TIMETRACK = "timetrack";
    }
}