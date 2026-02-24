//é util para percorrer grandes volumes por ir direto no valor, sem percorrer toda a lista
import java.util.Map;
import java.util.HashMap;

public class Welcome {
  private static final Map<String, String> linguas = new HashMap<>();
  static {
    linguas.put("english", "Welcome");
    linguas.put("czech", "Vitejte");
    linguas.put("danish", "Velkomst");
    linguas.put("dutch", "Welkom");
    linguas.put("estonian", "Tere tulemast");
    linguas.put("finnish", "Tervetuloa");
    linguas.put("flemish", "Welgekomen");
    linguas.put("french", "Bienvenue");
    linguas.put("german", "Willkommen");
    linguas.put("irish", "Failte");
    linguas.put("italian", "Benvenuto");
    linguas.put("latvian", "Gaidits");
    linguas.put("lithuanian", "Laukiamas");
    linguas.put("polish", "Witamy");
    linguas.put("spanish", "Bienvenido");
    linguas.put("swedish", "Valkommen");
    linguas.put("welsh", "Croeso");
  }

  public static String greet(String language){
    return linguas.getOrDefault(language, "Welcome");
  }
}

/*
mas dá para resolver com matriz, o problema é que em Se a lista crescer muito, a busca continua sendo linear
public static String greet(String language){
    String retorno = "Welcome";
    
    String [][] linguas = {
      {"english", "Welcome"},
      {"czech", "Vitejte"},
      {"danish", "Velkomst"},
      {"dutch", "Welkom"},
      {"estonian", "Tere tulemast"},
      {"finnish", "Tervetuloa"},
      {"flemish", "Welgekomen"},
      {"french", "Bienvenue"},
      {"german", "Willkommen"},
      {"irish", "Failte"},
      {"italian", "Benvenuto"},
      {"latvian", "Gaidits"},
      {"lithuanian", "Laukiamas"},
      {"polish", "Witamy"},
      {"spanish", "Bienvenido"},
      {"swedish", "Valkommen"},
      {"welsh", "Croeso"}
    };
    
    for (int i = 0; i < linguas.length; i++) {
      if (language.equals(linguas[i][0])) {
        retorno = linguas[i][1];
        break;
      }
    }
    
    return retorno;
}
*/
