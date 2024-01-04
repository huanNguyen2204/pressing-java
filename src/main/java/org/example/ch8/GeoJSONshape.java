package org.example.ch8;


record GeoJSONpoint(Coordinate coordinate) implements GeoJSONshape { }

record GeoJSONline(Coordinate... coordinates) implements GeoJSONshape { }

sealed interface GeoJSONshape permits GeoJSONpoint, GeoJSONline {
    record Coordinate(int x, int y) {
        @Override
        public String toString() {
            return '[' + x + "," + y + ']';
        }
    }
}
