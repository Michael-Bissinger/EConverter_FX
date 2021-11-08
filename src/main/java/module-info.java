module Converter {
//  TODO: Konverter später noch durch sauberes Maven ersetzen
//  https://openjfx.io/openjfx-docs/#maven

    requires javafx.graphics;
    requires javafx.controls;

//    requires javafx.controls;
//    requires javafx.graphics;

    opens ecommerce.converter;
}