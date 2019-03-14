package com.github.rjbx.givetrack;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.preference.PreferenceActivity;

import com.github.rjbx.givetrack.view.ConfigActivity;
import com.github.rjbx.givetrack.view.JournalActivity;
import com.github.rjbx.givetrack.view.HomeActivity;
import com.github.rjbx.givetrack.view.IndexActivity;

import java.lang.reflect.Array;
import java.text.DateFormat;
import java.text.NumberFormat;

public final class AppUtilities {

    public static final NumberFormat CURRENCY_FORMATTER = NumberFormat.getCurrencyInstance();
    public static final NumberFormat PERCENT_FORMATTER = NumberFormat.getPercentInstance();
    public static final DateFormat DATE_FORMATTER = DateFormat.getDateInstance(DateFormat.SHORT);

    public static <T extends Parcelable> T[] getTypedArrayFromParcelables(Parcelable[] parcelables, Class<T> arrayType) {
        T[] typedArray = (T[]) Array.newInstance(arrayType, parcelables.length);
        System.arraycopy(parcelables, 0, typedArray, 0, parcelables.length);
        return typedArray;
    }

    /**
     * Defines and launches Intent for displaying a {@link android.preference.PreferenceFragment}.
     */
    public static void launchPreferenceFragment(Context context, String action) {
        Intent filterIntent = new Intent(context, ConfigActivity.class);
        filterIntent.putExtra(PreferenceActivity.EXTRA_SHOW_FRAGMENT, getPreferenceFragmentName(action));
        filterIntent.putExtra(PreferenceActivity.EXTRA_NO_HEADERS, true);
        filterIntent.setAction(action);
        context.startActivity(filterIntent);
    }

    public static String getPreferenceFragmentName(String action) {
        switch (action) {
            case HomeActivity.ACTION_MAIN_INTENT:
                return ConfigActivity.HomePreferenceFragment.class.getName();
            case IndexActivity.ACTION_SPAWN_INTENT:
                return ConfigActivity.IndexPreferenceFragment.class.getName();
            case JournalActivity.ACTION_RECORD_INTENT:
                return ConfigActivity.JournalPreferenceFragment.class.getName();
            default: throw new IllegalArgumentException(
                    String.format("Action must derive from %s, %s or %s",
                            HomeActivity.ACTION_MAIN_INTENT,
                            IndexActivity.ACTION_SPAWN_INTENT,
                            JournalActivity.ACTION_RECORD_INTENT
                    ));
        }
    }

    public static String[] getArgs(String... strings) {
        int arrayLength = strings.length;
        String[] stringArray = new String[arrayLength];
        for (int i = 0; i < arrayLength; i++) stringArray[i] = strings[i];
        return stringArray;
    }
}
