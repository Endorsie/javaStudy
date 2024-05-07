package Practice1ObjectOriented;

public class Practice1ObjectOriented {
    public static void main(String[] args) {
        String[][] array = new String[3][4];
        //快捷键control+p看形参
        ResourcePractice1ObjectOriented good1 = new ResourcePractice1ObjectOriented("1","food","20","30");
        ResourcePractice1ObjectOriented good2 = new ResourcePractice1ObjectOriented("2","water","20","20");
        ResourcePractice1ObjectOriented good3 = new ResourcePractice1ObjectOriented("3","coffee","30","30");

        //Random rand = new Random();
        //int randomIndex = rand.nextInt(array.length);

        array[0][0] =  good1.getId();
        array[0][1] =  good1.getName();
        array[0][2] =  good1.getPrice();
        array[0][3] =  good1.getInventory();

        array[1][0] =  good2.getId();
        array[1][1] =  good2.getName();
        array[1][2] =  good2.getPrice();
        array[1][3] =  good2.getInventory();

        array[2][0] =  good3.getId();
        array[2][1] =  good3.getName();
        array[2][2] =  good3.getPrice();
        array[2][3] =  good3.getInventory();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println(array[i][j] + "\t");
            }
        }
    }
}
