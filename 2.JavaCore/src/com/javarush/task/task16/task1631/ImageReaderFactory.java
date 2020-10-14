package com.javarush.task.task16.task1631;

import com.javarush.task.task16.task1631.common.*;

public class ImageReaderFactory {
    public static ImageReader getImageReader(ImageTypes img) {
        if (img == null) throw new IllegalArgumentException("Неизвестный тип картинки");
        if (img.equals(ImageTypes.BMP)) return new BmpReader();
        if (img.equals(ImageTypes.JPG)) return new JpgReader();
        if (img.equals(ImageTypes.PNG)) return new PngReader();
        else throw new IllegalArgumentException("Неизвестный тип картинки");
    }
}
