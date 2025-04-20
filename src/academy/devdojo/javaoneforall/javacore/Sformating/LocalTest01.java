package academy.devdojo.javaoneforall.javacore.Sformating;


import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocalTest01 {
    public static void main(String[] args) {
        // ISO 639, language ISO 3166
        // pt-BR, pt-PT
        Locale localeItaly = new Locale("it", "IT");
        Locale localeCH = new Locale("it", "CH");
        Locale localeIndia = new Locale("hi", "IN");
        Locale localeJapanese = new Locale("ja", "JP");
        Locale localeNetherlands = new Locale("nl", "NL");

        Calendar c = Calendar.getInstance();
        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, localeItaly);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localeCH);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL, localeIndia);
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL, localeJapanese);
        DateFormat df5 = DateFormat.getDateInstance(DateFormat.FULL, localeNetherlands);

        System.out.println(df1.format(c.getTime()));
        System.out.println(df2.format(c.getTime()));
        System.out.println(df3.format(c.getTime()));
        System.out.println(df4.format(c.getTime()));
        System.out.println(df5.format(c.getTime()));

        System.out.println(localeItaly.getDisplayCountry(localeJapanese));
        System.out.println(localeItaly.getDisplayLanguage(localeJapanese));


    }
}
