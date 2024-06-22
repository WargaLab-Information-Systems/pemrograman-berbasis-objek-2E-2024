public class ClassJurusan {
    private static final String[][] JURUSAN = {
        {"41", "TEKNIK INFORMATIKA"},
        {"42", "TEKNIK INDUSTRI"},
        {"43", "TEKNIK ELEKTRO"},
        {"44", "SISTEM INFORMASI"},
        {"48", "TEKNIK MESIN"},
        {"49", "TEKNIK MEKATRONIKA"}
    };

    public static String getJurusan(String kodeJurusan) {
        for (String[] pair : JURUSAN) {
            if (pair[0].equals(kodeJurusan)) {
                return pair[1];
            }
        }
        return null;
    }
}