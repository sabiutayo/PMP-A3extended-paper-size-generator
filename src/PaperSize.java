import java.util.Locale;

import static java.lang.Boolean.TRUE;

public class PaperSize {
    private int id;

    private int caps_type;

    private String name;

    private String localized_name;

    private String media_description_name;

    private int media_group;

    private boolean landscape_mode = TRUE;
    private CustomPaperSize customPaperSize;


    public PaperSize(CustomPaperSize customPaperSize) {
        this.id = customPaperSize.getId();
        this.customPaperSize = customPaperSize;
        setCaps_type(2);
        setName();
        setLocalized_name();
        setMedia_description_name();
        setMedia_group(15);
        setLandscape_mode(true);
    }

    public int getId() {
        return id;
    }

    public PaperSize setId(int id) {
        this.id = id;
        return this;
    }

    public int getCaps_type() {
        return caps_type;
    }

    public PaperSize setCaps_type(int caps_type) {
        this.caps_type = caps_type;
        return this;
    }

    public String getName() {
        return name;
    }

    public PaperSize setName() {
        this.name = "UserDefinedMetric (" + String.format(Locale.US,"%.2f",customPaperSize.getWidth()) + " x " + String.format(Locale.US,"%.2f",customPaperSize.getHeight()) + "MM)";
        return this;
    }

    public String getLocalized_name() {
        return localized_name;
    }

    public PaperSize setLocalized_name() {
        this.localized_name = "A3extended (" + String.format(Locale.US,"%.2f",customPaperSize.getWidth()) + " x " + String.format(Locale.US,"%.2f",customPaperSize.getHeight()) + " mm)";
        return this;
    }

    public String getMedia_description_name() {
        return media_description_name;
    }

    public PaperSize setMedia_description_name() {
        this.media_description_name = customPaperSize.getPaperSizeDescription().getName();
        return this;
    }

    public int getMedia_group() {
        return media_group;
    }

    public PaperSize setMedia_group(int media_group) {
        this.media_group = media_group;
        return this;
    }

    public boolean isLandscape_mode() {
        return landscape_mode;
    }

    public PaperSize setLandscape_mode(boolean landscape_mode) {
        this.landscape_mode = landscape_mode;
        return this;
    }

    @Override
    public String toString() {
        return  "   " + id +"{" +
                "\n    caps_type=" + caps_type +
                "\n    name=\"" + name + '\"' +
                "\n    localized_name=\"" + localized_name +
                "\n    media_description_name=\"" + media_description_name + '\"' +
                "\n    media_group=" + media_group +
                "\n    landscape_mode=" + Boolean.toString(landscape_mode).toUpperCase() +
                "\n   }";
    }
}
