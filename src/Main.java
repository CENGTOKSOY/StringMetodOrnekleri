class MetodOrnekleri {
    public static void main(String[] args) {
        String ornekMetin = "Merhaba Dünya!";

        // charAt() metodu
        char harf = ornekMetin.charAt(0); // 'M' karakterini döndürür.

        // compareTo() metodu
        int karsilastirmaSonucu = ornekMetin.compareTo("Merhaba Ay!"); // 0'dan farklı bir değer döndürür.

        // concat() metodu
        String birlestirilmisMetin = ornekMetin.concat(" Hoşça kal!"); // "Merhaba Dünya! Hoşça kal!" döndürür.

        // contains() metodu
        boolean iceriyorMu = ornekMetin.contains("Dünya"); // true döndürür.

        // endsWith() metodu
        boolean ileMiBitiyor = ornekMetin.endsWith("!"); // true döndürür.

        // equals() metodu
        boolean esitMi = ornekMetin.equals("Merhaba Dünya!"); // true döndürür.

        // indexOf() metodu
        int ilkIndeks = ornekMetin.indexOf("Dünya"); // 8 döndürür.

        // isEmpty() metodu
        boolean bosMu = ornekMetin.isEmpty(); // false döndürür.

        // lastIndexOf() metodu
        int sonIndeks = ornekMetin.lastIndexOf("a"); // 12 döndürür.

        // length() metodu
        int uzunluk = ornekMetin.length(); // 14 döndürür.

        // replace() metodu
        String degistirilmisMetin = ornekMetin.replace("Dünya", "Java"); // "Merhaba Java!" döndürür.

        // split() metodu
        String[] kelimeler = ornekMetin.split(" "); // ["Merhaba", "Dünya!"] döndürür.

        // startsWith() metodu
        boolean ileMiBasliyor = ornekMetin.startsWith("Merhaba"); // true döndürür.

        // substring() metodu
        String altMetin = ornekMetin.substring(8, 13); // "Dünya" döndürür.

        // toLowerCase() metodu
        String kucukHarfliMetin = ornekMetin.toLowerCase(); // "merhaba dünya!" döndürür.

        // toUpperCase() metodu
        String buyukHarfliMetin = ornekMetin.toUpperCase(); // "MERHABA DÜNYA!" döndürür.

        // trim() metodu
        String bosluksuzMetin = ("   Merhaba Dünya!   ").trim(); // "Merhaba Dünya!" döndürür.
    }
}
