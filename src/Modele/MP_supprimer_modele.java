/*    */ package Modele;
/*    */ 
/*    */ import bd.BDD;
/*    */ import java.io.PrintStream;
/*    */ import java.sql.ResultSet;
/*    */ import java.sql.SQLException;
/*    */ import java.util.Observable;
/*    */ import javax.swing.JOptionPane;
/*    */ 
/*    */ public class MP_supprimer_modele extends Observable
/*    */ {
/* 12 */   BDD bd = null;
/*    */   private String Code;
/*    */   private String Des;
/*    */   private String unite;
/*    */   private String pu;
/*    */ 
/*    */   public MP_supprimer_modele(BDD bdd)
/*    */   {
/* 19 */     this.bd = bdd;
/*    */   }
/*    */ 
/*    */   public void select_mp(String code) {
/*    */     try {
/* 24 */       ResultSet rs = this.bd.select_mp(code);
/* 25 */       rs.next();
/* 26 */       this.Code = rs.getString("code");
/* 27 */       this.Des = rs.getString("designation");
/* 28 */       this.unite = rs.getString("unite");
/* 29 */       this.pu = rs.getString("prixunitaire");
/* 30 */       setChanged();
/* 31 */       System.out.println("notif");
/* 32 */       notifyObservers();
/*    */     } catch (SQLException e) {
/* 34 */       JOptionPane.showMessageDialog(null, e.getMessage(), "erreur", 0);
/*    */     }
/*    */   }
/*    */ 
/*    */   public int supp_mp(String code) {
/* 39 */     int res = this.bd.supp_mp(code);
/* 40 */     if (res == 1) {
/* 41 */       return 1;
/*    */     }
/*    */ 
/* 44 */     return 0;
/*    */   }
/*    */ 
/*    */   public String getCode()
/*    */   {
/* 49 */     return this.Code;
/*    */   }
/*    */   public String getDes() {
/* 52 */     return this.Des;
/*    */   }
/*    */   public String getUnite() {
/* 55 */     return this.unite;
/*    */   }
/*    */   public String getPu() {
/* 58 */     return this.pu;
/*    */   }
/*    */ }

/* Location:           C:\Users\Bastien\Desktop\prix_revient.jar
 * Qualified Name:     Modele.MP_supprimer_modele
 * JD-Core Version:    0.6.2
 */