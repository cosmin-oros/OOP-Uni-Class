package Assignment6;

interface Item {
    String getContent();
}

class File implements Item {
    private String information;

    public File(String info) {
        this.information = info;
    }

    @Override
    public String getContent() {
        return this.information;
    }
}

class Folder implements Item {
    private Item[] entries = new Item[100];
    private static int entryNr = 0;
    private String s = "";

    @Override
    public String getContent() {
        for (int i = 0; i < entries.length; i++) {
            try {
                s += entries[i].getContent();
            } catch (NullPointerException e) {

            }
        }

        return s;
    }

    public void addItem(Item o) {
        entries[entryNr] = o;
        entryNr++;
    }

}

class ModellingFiles {
    public static void main(String[] args) {
        File f1 = new File("Jad");
        File f2 = new File("Liviu");
        File f3 = new File("Nicolcea Bogdan-Florin(Bobo st)");
        Folder folder1 = new Folder();
        Folder folder2 = new Folder();
        folder1.addItem(f1);
        folder1.addItem(f2);
        folder2.addItem(f1);
        folder2.addItem(f2);
        folder2.addItem(f3);
        folder2.addItem(folder1);

        System.out.println(folder2.getContent());

    }
}