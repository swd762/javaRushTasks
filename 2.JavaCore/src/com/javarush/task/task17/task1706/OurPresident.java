package com.javarush.task.task17.task1706;

public class OurPresident {
    private static OurPresident president;

    private OurPresident() {
    }

    static {
        try {
            synchronized (OurPresident.class) {
                if (president == null) {
                    president = new OurPresident();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static OurPresident getOurPresident() {
        return president;
    }
}
