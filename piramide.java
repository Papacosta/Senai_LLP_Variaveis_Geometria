public class CalculadoraDeAreas {
   public static double areaPiramide(double base, double alturaLateral) {
        double areaBase = base * base;
        double areaLaterais = 4 * (base * alturaLateral) / 2;
        return areaBase + areaLaterais;
   }
