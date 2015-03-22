/*    */ package Modele;
/*    */ 
/*    */ import bd.BDD;
/*    */ import java.sql.ResultSet;
/*    */ import java.sql.SQLException;
/*    */ import java.util.Observable;
/*    */ import javax.swing.JOptionPane;
/*    */ 
/*    */ public class MP_modifier_modele extends Observable
/*    */ {
/* 13 */   BDD bd = null;
/*    */   private String Code;
/*    */   private String Des;
/*    */   private String unite;
/*    */   private String pu;
/*    */ 
/*    */   public MP_modifier_modele(BDD bdd)
/*    */   {
/* 20 */     this.bd = bdd;
/*    */   }
/*    */ 
/*    */   public void select_mp(String code) {
/*    */     try {
/* 25 */       ResultSet rs = this.bd.select_mp(code);
/* 26 */       rs.next();
/* 27 */       this.Code = rs.getString("code");
/* 28 */       this.Des = rs.getString("designation");
/* 29 */       this.unite = rs.getString("unite");
/* 30 */       this.pu = rs.getString("prixunitaire");
/* 31 */       setChanged();
/* 32 */       notifyObservers();
/*    */     } catch (SQLException e) {
/* 34 */       JOptionPane.showMessageDialog(null, e.getMessage(), "erreur", 0);
/*    */     }
/*    */   }
/*    */ 
/* 38 */   public int maj_mp(String code, String unite, String prix_unitaire) { int res = this.bd.maj_mp(code, unite, prix_unitaire);
/* 39 */     if (res == 1) {
/* 40 */       return 1;
/*    */     }
/*    */ 
/* 43 */     return 0;
/*    */   }
/*    */ 
/*    */   public String getCode()
/*    */   {
/* 48 */     return this.Code;
/*    */   }
/*    */   public String getDes() {
/* 51 */     return this.Des;
/*    */   }
/*    */   public String getUnite() {
/* 54 */     return this.unite;
/*    */   }
/*    */   public String getPu() {
/* 57 */     return this.pu;
/*    */   }
/*    */ }

/* Location:           C:\Users\Bastien\Desktop\prix_revient.jar
 * Qualified Name:     Modele.MP_modifier_modele
 * JD-Core Version:    0.6.2
 */