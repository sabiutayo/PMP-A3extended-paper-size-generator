import java.util.Locale;

import static java.lang.Boolean.TRUE;

public class PaperSizeDescription {
    private int id;
    private int caps_type;

    private String name;

    private double media_bounds_urx;

    private double media_bounds_ury;

    private double printable_bounds_llx;

    private double printable_bounds_lly;

    private double printable_bounds_urx;

    private double printable_bounds_ury;

    private double printable_area;

    private boolean dimensional = TRUE;
    private CustomPaperSize customPaperSize;

    public PaperSizeDescription(CustomPaperSize customPaperSize) {

        this.customPaperSize = customPaperSize;
        this.id = customPaperSize.getId();
        setCaps_type(2);
        setMedia_bounds_urx();
        setMedia_bounds_ury();
        setPrintable_bounds_llx();
        setPrintable_bounds_lly();
        setPrintable_bounds_urx();
        setPrintable_bounds_ury();
        setPrintable_area();
        setName();
        setDimensional(true);
    }

    public int getId() {
        return id;
    }

    public PaperSizeDescription setId(int id) {
        this.id = id;
        return this;
    }

    public int getCaps_type() {
        return caps_type;
    }

    public PaperSizeDescription setCaps_type(int caps_type) {
        this.caps_type = caps_type;
        return this;
    }

    public String getName() {
        return name;
    }

    public PaperSizeDescription setName() {
        this.name = "UserDefinedMetric Landscape "
                + String.format(Locale.US, "%.2f", customPaperSize.getWidth())
                + "W x "
                + String.format(Locale.US, "%.2f", customPaperSize.getHeight())
                + "H - ("
                + String.format(Locale.US, "%.0f", getPrintable_bounds_llx())
                + ", "
                + String.format(Locale.US, "%.0f", getPrintable_bounds_lly())
                + ") x ("
                + String.format(Locale.US, "%.0f", getPrintable_bounds_urx())
                + ", "
                + String.format(Locale.US, "%.0f", getPrintable_bounds_ury())
                + ") ="
                + String.format(Locale.US, "%.0f", getPrintable_area())
                + " MM"
        ;
        return this;
    }

    public double getMedia_bounds_urx() {
        return media_bounds_urx;
    }

    public PaperSizeDescription setMedia_bounds_urx() {
        this.media_bounds_urx = customPaperSize.getWidth();
        return this;
    }

    public double getMedia_bounds_ury() {
        return media_bounds_ury;
    }

    public PaperSizeDescription setMedia_bounds_ury() {
        this.media_bounds_ury = customPaperSize.getHeight();
        return this;
    }

    public double getPrintable_bounds_llx() {
        return printable_bounds_llx;
    }

    public PaperSizeDescription setPrintable_bounds_llx() {
        this.printable_bounds_llx = customPaperSize.getLeft_broder();
        return this;
    }

    public double getPrintable_bounds_lly() {
        return printable_bounds_lly;
    }

    public PaperSizeDescription setPrintable_bounds_lly() {
        this.printable_bounds_lly = customPaperSize.getBottom_broder();
        return this;
    }

    public double getPrintable_bounds_urx() {
        return printable_bounds_urx;
    }

    public PaperSizeDescription setPrintable_bounds_urx() {
        this.printable_bounds_urx = customPaperSize.getWidth() -
                (customPaperSize.getLeft_broder() +
                        customPaperSize.getRight_broder());
        return this;
    }

    public double getPrintable_bounds_ury() {
        return printable_bounds_ury;
    }

    public PaperSizeDescription setPrintable_bounds_ury() {
        this.printable_bounds_ury = customPaperSize.getHeight() -
                customPaperSize.getTop_border();
        return this;
    }

    public double getPrintable_area() {
        return printable_area;
    }

    public PaperSizeDescription setPrintable_area() {
        this.printable_area = getPrintable_bounds_urx() * getPrintable_bounds_ury();
        return this;
    }

    public boolean isDimensional() {
        return dimensional;
    }

    public PaperSizeDescription setDimensional(boolean dimensional) {
        this.dimensional = dimensional;
        return this;
    }

    @Override
    public String toString() {
        return
                "   " + id + "{" +
                        "\n    caps_type=" + caps_type +
                        "\n    name=\"" + name + "\"" +
                        "\n    media_bounds_urx=" + media_bounds_urx +
                        "\n    media_bounds_ury=" + media_bounds_ury +
                        "\n    printable_bounds_llx=" + printable_bounds_llx +
                        "\n    printable_bounds_lly=" + printable_bounds_lly +
                        "\n    printable_bounds_urx=" + printable_bounds_urx +
                        "\n    printable_bounds_ury=" + printable_bounds_ury +
                        "\n    printable_area=" + String.format(Locale.US, "%.5f",printable_area) +
                        "\n    dimensional=" + Boolean.toString(dimensional).toUpperCase() +
                        "\n   }";
    }
}
