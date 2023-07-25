public class Main {
    public static void main(String[] args) {
        double pas = 5;
        double width = 2000;
        final double height = 297;
        final double leftBorder = 6;
        final double rightBorder = 6;
        final double topBorder = 6;
        final double bottomBorder = 6;
        StringBuilder size = new StringBuilder("  size{\n");
        StringBuilder description = new StringBuilder("  description{\n");

        while (width >= 420) {
            CustomPaperSize newPaper = new CustomPaperSize(width, height,
                    topBorder, bottomBorder, leftBorder, rightBorder);

            size.append(newPaper.getPaperSize().toString());
            size.append("\n");
            description.append(newPaper.getPaperSizeDescription().toString());
            description.append("\n");
            width -= pas;
        }
        size.append("  }");
        description.append("  }");

        System.out.println(size.toString());
        System.out.println(description.toString());

    }
}