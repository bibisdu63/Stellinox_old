/*    */ package Modele;
/*    */ 
/*    */ import bd.BDD;
/*    */ import java.sql.ResultSet;
/*    */ import java.sql.SQLException;
/*    */ 
/*    */ public class Menu_Modele
/*    */ {
/* 10 */   BDD bd = null;
/*    */   private String taux;
/*    */ 
/*    */   public Menu_Modele(BDD bdd)
/*    */   {
/* 13 */     this.bd = bdd;
/*    */   }
/*    */   public int maj_essuyage(String taux) {
/* 16 */     int res = this.bd.maj_tx_essuyage(taux);
/* 17 */     if (res == 1) {
/* 18 */       return 1;
/*    */     }
/*    */ 
/* 21 */     return 0;
/*    */   }
/*    */ 
/*    */   public void select_tx_essuyage()
/*    */   {
/*    */     try {
/* 27 */       ResultSet rs = this.bd.select_tx_essuyage();
/* 28 */       rs.next();
/* 29 */       this.taux = rs.getString("essuyage");
/*    */     } catch (SQLException e) {
/* 31 */       e.printStackTrace();
/*    */     }
/*    */   }
/*    */ 
/*    */   public int maj_appro(String taux) {
/* 36 */     int res = this.bd.maj_appro(taux);
/* 37 */     if (res == 1) {
/* 38 */       return 1;
/*    */     }
/*    */ 
/* 41 */     return 0;
/*    */   }
/*    */ 
/*    */   public void select_appro()
/*    */   {
/*    */     try {
/* 47 */       ResultSet rs = this.bd.select_appro();
/* 48 */       rs.next();
/* 49 */       this.taux = rs.getString("appro");
/*    */     } catch (SQLException e) {
/* 51 */       e.printStackTrace();
/*    */     }
/*    */   }
/*    */ 
/*    */   public int maj_coeff(String coeff) {
/* 56 */     int res = this.bd.maj_coeff(coeff);
/* 57 */     if (res == 1) {
/* 58 */       return 1;
/*    */     }
/*    */ 
/* 61 */     return 0;
/*    */   }
/*    */ 
/*    */   public void select_coeff()
/*    */   {
/*    */     try {
/* 67 */       ResultSet rs = this.bd.select_coeff();
/* 68 */       rs.next();
/* 69 */       this.taux = rs.getString("coutcomplet");
/*    */     } catch (SQLException e) {
/* 71 */       e.printStackTrace();
/*    */     }
/*    */   }
/*    */ 
/* 75 */   public int creer_user(String nom, int num) { int ret = this.bd.creer_user(nom, num);
/* 76 */     return ret; }
/*    */ 
/*    */   public String getTaux() {
/* 79 */     return this.taux;
/*    */   }
/*    */ }

/* Location:           C:\Users\Bastien\Desktop\prix_revient.jar
 * Qualified Name:     Modele.Menu_Modele
 * JD-Core Version:    0.6.2
 */