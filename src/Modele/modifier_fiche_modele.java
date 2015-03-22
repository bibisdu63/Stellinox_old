/*     */ package Modele;
/*     */ 
/*     */ import bd.BDD;
/*     */ import java.io.PrintStream;
/*     */ import java.sql.ResultSet;
/*     */ import java.sql.SQLException;
/*     */ import java.util.Observable;
/*     */ 
/*     */ public class modifier_fiche_modele extends Observable
/*     */ {
/*     */   BDD bdd;
/*     */   private String Code;
/*     */   private String Des;
/*     */ 
/*     */   public modifier_fiche_modele(BDD bd)
/*     */   {
/*  16 */     this.bdd = bd;
/*     */   }
/*     */ 
/*     */   public ResultSet selectmp(String reference) {
/*  20 */     ResultSet rs = this.bdd.selectTtMp(reference);
/*  21 */     return rs;
/*     */   }
/*     */ 
/*     */   public int update_quantite(String reference, String code, Float quantite) {
/*  25 */     int ret = this.bdd.maj_quantite(reference, code, quantite);
/*  26 */     return ret;
/*     */   }
/*     */ 
/*     */   public String select_entete(String ref) {
/*     */     try {
/*  31 */       System.out.println("good");
/*  32 */       ResultSet rs = this.bdd.selectentete(ref);
/*  33 */       rs.next();
/*  34 */       this.Code = rs.getString("reference");
/*  35 */       this.Des = rs.getString("designation");
/*  36 */       System.out.println(this.Code + "       " + this.Des);
/*  37 */       setChanged();
/*  38 */       notifyObservers();
/*     */     } catch (SQLException e) {
/*  40 */       e.printStackTrace();
/*     */     }
/*  42 */     return this.Des;
/*     */   }
/*     */ 
/*     */   public int add_mp(String reference, String code, Float quantite)
/*     */   {
/*  47 */     ResultSet rs = this.bdd.select_mp(code);
/*     */     try {
/*  49 */       if (rs.next()) {
/*  50 */         return this.bdd.add_mp(reference, code, quantite);
/*     */       }
/*     */ 
/*  53 */       return 0;
/*     */     } catch (SQLException e) {
/*  55 */       e.printStackTrace();
/*  56 */     }return 0;
/*     */   }
/*     */ 
/*     */   public int remove_mp(String reference, String code, Float quantite)
/*     */   {
/*  62 */     int ret = this.bdd.remove_mp(reference, code, quantite);
/*  63 */     return ret;
/*     */   }
/*     */ 
/*     */   public ResultSet selectuo(String reference)
/*     */   {
/*  69 */     ResultSet rs = this.bdd.selectTtuo(reference);
/*  70 */     return rs;
/*     */   }
/*     */ 
/*     */   public int update_gamme_tps(String reference, String num, Integer tps, Integer Qu) {
/*  74 */     int ret = this.bdd.maj_gamme_tps(reference, num, tps, Qu);
/*  75 */     return ret;
/*     */   }
/*     */ 
/*     */   public int update_gamme_qu(String reference, String num, Integer tps, Integer Qu) {
/*  79 */     int ret = this.bdd.maj_gamme_qu(reference, num, tps, Qu);
/*  80 */     return ret;
/*     */   }
/*     */ 
/*     */   public int add_uo(String reference, String num, Integer tps, Integer Qu)
/*     */   {
/*  85 */     ResultSet rs = this.bdd.select_uo(num);
/*     */     try {
/*  87 */       if (rs.next()) {
/*  88 */         return this.bdd.add_uo(reference, num, tps, Qu);
/*     */       }
/*     */ 
/*  91 */       return 0;
/*     */     } catch (SQLException e) {
/*  93 */       e.printStackTrace();
/*  94 */     }return 0;
/*     */   }
/*     */ 
/*     */   public int remove_uo(String reference, String num, Integer tps, Integer Qu, String ordre)
/*     */   {
/*  99 */     int ret = this.bdd.remove_uo(reference, num, tps, Qu, ordre);
/* 100 */     return ret;
/*     */   }
/*     */ 
/*     */   public int maj_entete(String code, String des) {
/* 104 */     int ret = this.bdd.maj_entete(code, des);
/* 105 */     return ret;
/*     */   }
/*     */ 
/*     */   public String getCode() {
/* 109 */     return this.Code;
/*     */   }
/*     */ 
/*     */   public String getDes() {
/* 113 */     return this.Des;
/*     */   }
/*     */ }

/* Location:           C:\Users\Bastien\Desktop\prix_revient.jar
 * Qualified Name:     Modele.modifier_fiche_modele
 * JD-Core Version:    0.6.2
 */