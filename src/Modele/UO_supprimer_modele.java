/*    */ package Modele;
/*    */ 
/*    */ import bd.BDD;
/*    */ import java.sql.ResultSet;
/*    */ import java.sql.SQLException;
/*    */ import java.util.Observable;
/*    */ 
/*    */ public class UO_supprimer_modele extends Observable
/*    */ {
/* 11 */   BDD bd = null;
/*    */   private String Code;
/*    */   private String Des;
/*    */   private String CC;
/*    */   private String unite;
/*    */   private String Type;
/*    */ 
/*    */   public UO_supprimer_modele(BDD bdd)
/*    */   {
/* 19 */     this.bd = bdd;
/*    */   }
/*    */ 
/*    */   public void select_uo(String code) {
/*    */     try {
/* 24 */       ResultSet rs = this.bd.select_uo(code);
/* 25 */       rs.next();
/* 26 */       this.Code = rs.getString("numcentre");
/* 27 */       this.Des = rs.getString("description");
/* 28 */       this.unite = rs.getString("unitedoeuvre");
/* 29 */       this.CC = rs.getString("coutcomplet");
/* 30 */       this.Type = rs.getString("type");
/* 31 */       setChanged();
/* 32 */       notifyObservers();
/*    */     } catch (SQLException e) {
/* 34 */       e.printStackTrace();
/*    */     }
/*    */   }
/*    */ 
/* 38 */   public int suppr_uo(String code) { int res = this.bd.supp_uo(code);
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
/*    */ 
/*    */   public String getDes() {
/* 52 */     return this.Des;
/*    */   }
/*    */ 
/*    */   public String getCC() {
/* 56 */     return this.CC;
/*    */   }
/*    */ 
/*    */   public String getUnite() {
/* 60 */     return this.unite;
/*    */   }
/*    */ 
/*    */   public String getType() {
/* 64 */     return this.Type;
/*    */   }
/*    */ }

/* Location:           C:\Users\Bastien\Desktop\prix_revient.jar
 * Qualified Name:     Modele.UO_supprimer_modele
 * JD-Core Version:    0.6.2
 */