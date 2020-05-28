class Main {
  public static int rnd(int min, int max)
{
	max -= min;
	return (int) (Math.random() * ++max) + min;
}

 static void Sort(int[][] m)
    { int[][] b = new int[10][10];
      for(int i=0; i<10; ++i)
      for(int j=0; j<10; ++j)
      b[j][i] = m[i][j];
      m=b;
      
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                for (int k = 0; k < m[i].length - j - 1; k++) {
                    if (m[i][k] > m[i][k + 1]) {
                        int t = m[i][k];
                        m[i][k] = m[i][k + 1];
                        m[i][k + 1] = t;
                    }
                }
            }
        }
        b = new int[10][10];
        for(int i=0; i<10; ++i)
        for(int j=0; j<10; ++j)
        b[j][i] = m[i][j];
        m=b;
        for (int i = 0; i < m.length; i++) {

            for (int j = 0; j < m[i].length; j++)

                System.out.print(m[i][j] + " | ");

            System.out.println();
        }
    }

  public static void main(String[] args) {
    
    int[][] mas = new int[10][10];
    final int minr = -50;
  	final int maxr = 50; 

    for (int i = 0; i<10; i++)
    {
      for (int j = 0; j<10; j++)
      {
        mas[i][j] = rnd(minr, maxr);
        System.out.print(mas[i][j] + " | ");
      }
      System.out.println("");
    }
System.out.println("Отсортированный:");
Sort(mas);
  }
}