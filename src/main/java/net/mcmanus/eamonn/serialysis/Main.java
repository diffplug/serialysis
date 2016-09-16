package net.mcmanus.eamonn.serialysis;

public class Main {

  public static void main(String[] args) throws Exception {
    final SerialScan serialScan = new SerialScan(System.in);
    while (true) {
      final SEntity entity = serialScan.readObject();
      System.out.println(entity.toString());
    }
  }

}
