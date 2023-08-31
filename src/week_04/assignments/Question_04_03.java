package week_04.assignments;

public class Question_04_03 {

    public static void main(String[] args) {
        final double EARTH_RADIUS = 6371.01; // Earth's average radius in kilometers

        // GPS coordinates for the cities
        double atlantaX = Math.toRadians(33.7489954);
        double atlantaY = Math.toRadians(-84.3879824);

        double orlandoX = Math.toRadians(28.5383355);
        double orlandoY = Math.toRadians(-81.3792364999);

        double savannahX = Math.toRadians(32.0835407);
        double savannahY = Math.toRadians(-81.09983419999998);

        double charlotteX = Math.toRadians(35.2270869);
        double charlotteY = Math.toRadians(-80.84312669999997);

        // Calculate the great circle distances
        double d1 = EARTH_RADIUS * Math.acos(Math.sin(atlantaX) * Math.sin(orlandoX) +
                Math.cos(atlantaX) * Math.cos(orlandoX) * Math.cos(atlantaY - orlandoY));

        double d2 = EARTH_RADIUS * Math.acos(Math.sin(orlandoX) * Math.sin(savannahX) +
                Math.cos(orlandoX) * Math.cos(savannahX) * Math.cos(orlandoY - savannahY));

        double d3 = EARTH_RADIUS * Math.acos(Math.sin(savannahX) * Math.sin(charlotteX) +
                Math.cos(savannahX) * Math.cos(charlotteX) * Math.cos(savannahY - charlotteY));

        double d4 = EARTH_RADIUS * Math.acos(Math.sin(charlotteX) * Math.sin(atlantaX) +
                Math.cos(charlotteX) * Math.cos(atlantaX) * Math.cos(charlotteY - atlantaY));

        // Calculate the semi-perimeters of the triangles
        double s1 = (d1 + d2 + d3) / 2;
        double s2 = (d3 + d4 + d1) / 2;

        // Calculate the areas of the triangles
        double area1 = Math.sqrt(s1 * (s1 - d1) * (s1 - d2) * (s1 - d3));
        double area2 = Math.sqrt(s2 * (s2 - d3) * (s2 - d4) * (s2 - d1));

        // Calculate the total estimated area
        double totalArea = area1 + area2;

        System.out.println("Estimated area enclosed by the four cities: " + totalArea + " square kilometers");
    }
}
