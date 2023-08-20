package comp.src.datastructures;

import java.util.ArrayList;
import java.util.HashMap;

public class GramaticaSymbolTable {
    private HashMap<String, GramaticaSymbol> symbols;

    public GramaticaSymbolTable() {
        symbols = new HashMap<String, GramaticaSymbol>();
    }

    public void add(GramaticaSymbol symbol) {
        symbols.put(symbol.getName(), symbol);
    }

    public GramaticaSymbol get(String name) {
        return symbols.get(name);
    }

    public boolean exists(String name) {
        return symbols.containsKey(name);
    }

    public ArrayList<GramaticaSymbol> getAll() {
        return new ArrayList<>(symbols.values());
    }
}
