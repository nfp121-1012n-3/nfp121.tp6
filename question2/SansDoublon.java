package question2;
import question1.*;
import java.util.Set;
import java.util.TreeSet;

public class SansDoublon implements Visiteur<Boolean>{

  private Set<String> LesCont = new TreeSet<String>();
  private Set<String> LesGrp = new TreeSet<String>();


  public Boolean visite(Contributeur c){
    return visiteR(c);
  }
  
  public Boolean visite(GroupeDeContributeurs g){

    boolean res = visiteR(g);

        for (Cotisant c : g) {
if (c instanceof Contributeur) {
 res &= visiteR((Contributeur)c);
 break;
} else {
res &= visite((GroupeDeContributeurs)g);
  }
        }
        return res;
  }

  private Boolean visiteR(Contributeur c) {

    boolean res = LesCont.contains(c.nom());

    if (!res) {
LesCont.contains(c.nom());
 }
    return res;
}

private Boolean visiteR(GroupeDeContributeurs g) {

    boolean res = LesGrp.contains(g.nom());

    if (!res) {

        LesGrp.contains(g.nom());

    }
    return res;
}










  
}