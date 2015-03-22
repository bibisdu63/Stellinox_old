/*     */ package bd;
/*     */ 
/*     */ import java.io.PrintStream;
/*     */ import java.sql.Connection;
/*     */ import java.sql.DriverManager;
/*     */ import java.sql.PreparedStatement;
/*     */ import java.sql.ResultSet;
/*     */ import java.sql.SQLException;
/*     */ import java.sql.Statement;
/*     */ import javax.swing.JOptionPane;
/*     */ 
/*     */ public class BDD
/*     */ {
/*  21 */   Statement stmt = null;
/*  22 */   Connection conn = null;
/*  23 */   public Integer indice = Integer.valueOf(0);
/*  24 */   private String name = null;
/*  25 */   private String address = null;
/*  26 */   private String port = null;
/*     */ 
/*     */   public int connexion(String adresse, String port, String pseudo, String mdp)
/*     */   {
/*  37 */     this.address = adresse;
/*  38 */     this.port = port;
/*     */     try {
/*  40 */       Class.forName("org.postgresql.Driver");
/*  41 */       this.conn = DriverManager.getConnection("jdbc:postgresql://" + adresse + ":" + port + "/Stellinox", pseudo, mdp);
/*  42 */       if (pseudo.equals("postgres")) {
/*  43 */         this.name = new String("postgres");
/*  44 */         return 1;
/*     */       }
/*  46 */       this.stmt = this.conn.createStatement();
/*  47 */       PreparedStatement ps = this.conn.prepareStatement("SELECT num FROM utilisateurs WHERE pseudo=?");
/*  48 */       ps.setString(1, pseudo);
/*  49 */       ResultSet rs = ps.executeQuery();
/*  50 */       rs.next();
/*  51 */       this.indice = Integer.valueOf(rs.getInt("num"));
/*  52 */       if (this.indice.intValue() == 1)
/*  53 */         this.name = new String("Production");
/*  54 */       else if (this.indice.intValue() == 2) {
/*  55 */         this.name = new String("Direction");
/*     */       }
/*  57 */       System.out.println("connexion etablie");
/*  58 */       return 1;
/*     */     } catch (Exception e) {
/*  60 */       JOptionPane.showMessageDialog(null, e.getMessage(), "erreur connexion", 0);
/*  61 */     }return 0;
/*     */   }
/*     */ 
/*     */   public int maj_mp(String code, String unite, String prix_unitaire)
/*     */   {
/*  73 */     int test = 0;
/*     */     try {
/*  75 */       Float coutT = Float.valueOf(Float.parseFloat(prix_unitaire));
/*  76 */       PreparedStatement ps = this.conn.prepareStatement("UPDATE matiere SET unite=?,prixunitaire=? WHERE code=?");
/*  77 */       ps.setString(1, unite);
/*  78 */       ps.setFloat(2, coutT.floatValue());
/*  79 */       ps.setString(3, code);
/*  80 */       return ps.executeUpdate();
/*     */     }
/*     */     catch (SQLException e) {
/*  83 */       JOptionPane.showMessageDialog(null, e.getMessage(), "erreur", 0);
/*     */     }
/*  85 */     return test;
/*     */   }
/*     */ 
/*     */   public ResultSet select_mp(String code)
/*     */   {
/*  94 */     ResultSet rs = null;
/*     */     try {
/*  96 */       PreparedStatement ps = this.conn.prepareStatement("SELECT * FROM matiere WHERE code=?");
/*  97 */       ps.setString(1, code);
/*  98 */       rs = ps.executeQuery();
/*     */     } catch (SQLException e) {
/* 100 */       JOptionPane.showMessageDialog(null, e.getMessage(), "erreur", 0);
/*     */     }
/* 102 */     return rs;
/*     */   }
/*     */ 
/*     */   public int supp_mp(String code)
/*     */   {
/* 111 */     int rs = 0;
/*     */     try {
/* 113 */       PreparedStatement ps = this.conn.prepareStatement("DELETE FROM matiere WHERE code=?");
/* 114 */       ps.setString(1, code);
/* 115 */       rs = ps.executeUpdate();
/*     */     } catch (SQLException e) {
/* 117 */       JOptionPane.showMessageDialog(null, e.getMessage(), "erreur", 0);
/*     */     }
/* 119 */     return rs;
/*     */   }
/*     */ 
/*     */   public int ajout_mp(String code, String des, String unit, String pu)
/*     */   {
/* 131 */     int rs = 0;
/*     */     try {
/* 133 */       Float coutT = Float.valueOf(Float.parseFloat(pu));
/* 134 */       PreparedStatement ps = this.conn.prepareStatement("INSERT INTO matiere(code,designation,unite,prixunitaire) VALUES (?,?,?,?)");
/* 135 */       ps.setString(1, code);
/* 136 */       ps.setString(2, des);
/* 137 */       ps.setString(3, unit);
/* 138 */       ps.setFloat(4, coutT.floatValue());
/* 139 */       rs = ps.executeUpdate();
/*     */     } catch (SQLException e) {
/* 141 */       JOptionPane.showMessageDialog(null, e.getMessage(), "erreur", 0);
/*     */     }
/* 143 */     return rs;
/*     */   }
/*     */ 
/*     */   public int ajout_uo(String num, String des, String cout, String unit, String type)
/*     */   {
/* 156 */     int rs = 0;
/*     */     try {
/* 158 */       Float coutT = Float.valueOf(Float.parseFloat(cout));
/* 159 */       PreparedStatement ps = this.conn.prepareStatement("INSERT INTO uniteoeuvre(numcentre,description,coutcomplet,unitedoeuvre,type) VALUES (?,?,?,?,?)");
/* 160 */       ps.setString(1, num);
/* 161 */       ps.setString(2, des);
/* 162 */       ps.setFloat(3, coutT.floatValue());
/* 163 */       ps.setString(4, unit);
/* 164 */       ps.setString(5, type);
/* 165 */       rs = ps.executeUpdate();
/*     */     } catch (SQLException e) {
/* 167 */       JOptionPane.showMessageDialog(null, e.getMessage(), "erreur", 0);
/*     */     }
/* 169 */     return rs;
/*     */   }
/*     */ 
/*     */   public int maj_uo(String code, String des, String cout, String unite, String type)
/*     */   {
/* 182 */     int test = 0;
/*     */     try {
/* 184 */       Float coutT = Float.valueOf(Float.parseFloat(cout));
/* 185 */       PreparedStatement ps = this.conn.prepareStatement("UPDATE uniteoeuvre SET description=?,coutcomplet=?, unitedoeuvre=?, type=? WHERE numcentre=?");
/* 186 */       ps.setString(1, des);
/* 187 */       ps.setFloat(2, coutT.floatValue());
/* 188 */       ps.setString(3, unite);
/* 189 */       ps.setString(4, type);
/* 190 */       ps.setString(5, code);
/* 191 */       return ps.executeUpdate();
/*     */     }
/*     */     catch (SQLException e) {
/* 194 */       JOptionPane.showMessageDialog(null, e.getMessage(), "erreur", 0);
/*     */     }
/* 196 */     return test;
/*     */   }
/*     */ 
/*     */   public ResultSet select_uo(String code)
/*     */   {
/* 205 */     ResultSet rs = null;
/*     */     try {
/* 207 */       PreparedStatement ps = this.conn.prepareStatement("SELECT * FROM uniteoeuvre WHERE numcentre=?");
/* 208 */       ps.setString(1, code);
/* 209 */       rs = ps.executeQuery();
/*     */     } catch (SQLException e) {
/* 211 */       JOptionPane.showMessageDialog(null, e.getMessage(), "erreur", 0);
/*     */     }
/* 213 */     return rs;
/*     */   }
/*     */ 
/*     */   public int supp_uo(String code)
/*     */   {
/* 222 */     int rs = 0;
/*     */     try {
/* 224 */       PreparedStatement ps = this.conn.prepareStatement("DELETE FROM uniteoeuvre WHERE numcentre=?");
/* 225 */       ps.setString(1, code);
/* 226 */       rs = ps.executeUpdate();
/*     */     } catch (SQLException e) {
/* 228 */       JOptionPane.showMessageDialog(null, e.getMessage(), "erreur", 0);
/*     */     }
/* 230 */     return rs;
/*     */   }
/*     */ 
/*     */   public int maj_tx_essuyage(String taux)
/*     */   {
/* 239 */     int ret = 0;
/*     */     try {
/* 241 */       Float res = Float.valueOf(Float.parseFloat(taux));
/* 242 */       PreparedStatement ps = this.conn.prepareStatement("UPDATE taux SET essuyage=?");
/* 243 */       ps.setFloat(1, res.floatValue());
/* 244 */       ret = ps.executeUpdate();
/* 245 */       PreparedStatement ps1 = this.conn.prepareStatement("UPDATE uniteoeuvre SET coutcomplet=? WHERE numcentre='22'");
/* 246 */       ps1.setFloat(1, res.floatValue());
/* 247 */       return ps1.executeUpdate();
/*     */     }
/*     */     catch (SQLException e) {
/* 250 */       JOptionPane.showMessageDialog(null, e.getMessage(), "erreur", 0);
/*     */     }
/* 252 */     return ret;
/*     */   }
/*     */ 
/*     */   public ResultSet select_tx_essuyage()
/*     */   {
/* 260 */     ResultSet rs = null;
/*     */     try {
/* 262 */       PreparedStatement ps = this.conn.prepareStatement("SELECT * FROM taux");
/* 263 */       rs = ps.executeQuery();
/*     */     } catch (SQLException e) {
/* 265 */       JOptionPane.showMessageDialog(null, e.getMessage(), "erreur", 0);
/*     */     }
/* 267 */     return rs;
/*     */   }
/*     */ 
/*     */   public int maj_appro(String taux)
/*     */   {
/* 277 */     int ret = 0;
/*     */     try {
/* 279 */       Float res = Float.valueOf(Float.parseFloat(taux));
/* 280 */       PreparedStatement ps = this.conn.prepareStatement("UPDATE taux SET appro=?");
/* 281 */       ps.setFloat(1, res.floatValue());
/* 282 */       ret = ps.executeUpdate();
/* 283 */       ps = this.conn.prepareStatement("UPDATE uniteoeuvre SET coutcomplet=? WHERE numcentre='23'");
/* 284 */       ps.setFloat(1, res.floatValue());
/* 285 */       return ps.executeUpdate();
/*     */     }
/*     */     catch (SQLException e) {
/* 288 */       JOptionPane.showMessageDialog(null, e.getMessage(), "erreur essai", 0);
/*     */     }
/* 290 */     return ret;
/*     */   }
/*     */ 
/*     */   public ResultSet select_appro()
/*     */   {
/* 298 */     ResultSet rs = null;
/*     */     try {
/* 300 */       PreparedStatement ps = this.conn.prepareStatement("SELECT * FROM taux");
/* 301 */       rs = ps.executeQuery();
/*     */     } catch (SQLException e) {
/* 303 */       JOptionPane.showMessageDialog(null, e.getMessage(), "erreur", 0);
/*     */     }
/* 305 */     return rs;
/*     */   }
/*     */ 
/*     */   public int maj_coeff(String coeff)
/*     */   {
/* 314 */     int ret = 0;
/*     */     try {
/* 316 */       Float res = Float.valueOf(Float.parseFloat(coeff));
/* 317 */       PreparedStatement ps = this.conn.prepareStatement("UPDATE structure SET coutcomplet=?");
/* 318 */       ps.setFloat(1, res.floatValue());
/* 319 */       ret = ps.executeUpdate();
/* 320 */       PreparedStatement ps1 = this.conn.prepareStatement("UPDATE uniteoeuvre SET coutcomplet=? WHERE numcentre='21'");
/* 321 */       ps1.setFloat(1, res.floatValue());
/* 322 */       return ps1.executeUpdate();
/*     */     }
/*     */     catch (SQLException e) {
/* 325 */       JOptionPane.showMessageDialog(null, e.getMessage(), "erreur--essai", 0);
/*     */     }
/* 327 */     return ret;
/*     */   }
/*     */ 
/*     */   public ResultSet select_coeff()
/*     */   {
/* 335 */     ResultSet rs = null;
/*     */     try {
/* 337 */       PreparedStatement ps = this.conn.prepareStatement("SELECT * FROM structure");
/* 338 */       rs = ps.executeQuery();
/*     */     } catch (SQLException e) {
/* 340 */       JOptionPane.showMessageDialog(null, e.getMessage(), "erreur", 0);
/*     */     }
/* 342 */     return rs;
/*     */   }
/*     */ 
/*     */   public int creer_fiche(String code, String des)
/*     */   {
/* 352 */     int test = 0;
/*     */     try {
/* 354 */       PreparedStatement ps = this.conn.prepareStatement("INSERT INTO entete VALUES (?,?)");
/* 355 */       ps.setString(1, code);
/* 356 */       ps.setString(2, des);
/* 357 */       return ps.executeUpdate();
/*     */     }
/*     */     catch (SQLException e) {
/* 360 */       JOptionPane.showMessageDialog(null, e.getMessage(), "erreur", 0);
/*     */     }
/* 362 */     return test;
/*     */   }
/*     */ 
/*     */   public ResultSet selectTtMp(String ref)
/*     */   {
/* 371 */     ResultSet test = null;
/*     */     try {
/* 373 */       PreparedStatement ps = this.conn.prepareStatement("SELECT code,quantite FROM nomenclature WHERE reference = ?");
/* 374 */       ps.setString(1, ref);
/* 375 */       return ps.executeQuery();
/*     */     }
/*     */     catch (SQLException e) {
/* 378 */       JOptionPane.showMessageDialog(null, e.getMessage(), "erreur", 0);
/*     */     }
/* 380 */     return test;
/*     */   }
/*     */ 
/*     */   public int maj_quantite(String reference, String code, Float quantite)
/*     */   {
/* 391 */     int ret = 0;
/*     */     try {
/* 393 */       System.out.println("bdd");
/* 394 */       PreparedStatement ps = this.conn.prepareStatement("UPDATE nomenclature SET quantite=? WHERE reference=? AND code=?");
/* 395 */       ps.setFloat(1, quantite.floatValue());
/* 396 */       ps.setString(2, reference);
/* 397 */       ps.setString(3, code);
/* 398 */       ret = ps.executeUpdate();
/* 399 */       System.out.println(ret);
/* 400 */       return ret;
/*     */     } catch (SQLException e) {
/* 402 */       JOptionPane.showMessageDialog(null, e.getMessage(), "erreur", 0);
/*     */     }
/* 404 */     return ret;
/*     */   }
/*     */ 
/*     */   public ResultSet selectentete(String ref)
/*     */   {
/* 413 */     ResultSet test = null;
/*     */     try {
/* 415 */       PreparedStatement ps = this.conn.prepareStatement("SELECT * FROM entete WHERE reference = ?");
/* 416 */       ps.setString(1, ref);
/* 417 */       return ps.executeQuery();
/*     */     }
/*     */     catch (SQLException e) {
/* 420 */       JOptionPane.showMessageDialog(null, e.getMessage(), "erreur", 0);
/*     */     }
/* 422 */     return test;
/*     */   }
/*     */ 
/*     */   public int add_mp(String ref, String code, Float quantite)
/*     */   {
/* 433 */     int rs = 0;
/*     */     try {
/* 435 */       PreparedStatement ps = this.conn.prepareStatement("INSERT INTO nomenclature(reference,code,quantite) VALUES (?,?,?)");
/* 436 */       ps.setString(1, ref);
/* 437 */       ps.setString(2, code);
/* 438 */       ps.setFloat(3, quantite.floatValue());
/* 439 */       rs = ps.executeUpdate();
/*     */     } catch (SQLException e) {
/* 441 */       JOptionPane.showMessageDialog(null, e.getMessage(), "erreur", 0);
/*     */     }
/* 443 */     return rs;
/*     */   }
/*     */ 
/*     */   public int remove_mp(String reference, String code, Float quantite)
/*     */   {
/* 454 */     int rs = 0;
/*     */     try {
/* 456 */       PreparedStatement ps = this.conn.prepareStatement("DELETE FROM nomenclature WHERE reference=? AND code=? AND quantite=?");
/* 457 */       ps.setString(1, reference);
/* 458 */       ps.setString(2, code);
/* 459 */       ps.setFloat(3, quantite.floatValue());
/* 460 */       rs = ps.executeUpdate();
/*     */     } catch (SQLException e) {
/* 462 */       JOptionPane.showMessageDialog(null, e.getMessage(), "erreur", 0);
/*     */     }
/* 464 */     return rs;
/*     */   }
/*     */ 
/*     */   public ResultSet selectTtuo(String ref)
/*     */   {
/* 473 */     ResultSet test = null;
/*     */     try {
/* 475 */       PreparedStatement ps = this.conn.prepareStatement("SELECT numerocentre,serietps, seriequ,ordre FROM gammeop WHERE reference = ?");
/* 476 */       ps.setString(1, ref);
/* 477 */       return ps.executeQuery();
/*     */     }
/*     */     catch (SQLException e) {
/* 480 */       JOptionPane.showMessageDialog(null, e.getMessage(), "erreur", 0);
/*     */     }
/* 482 */     return test;
/*     */   }
/*     */ 
/*     */   public int maj_gamme_tps(String reference, String num, Integer tps, Integer Qu)
/*     */   {
/* 494 */     int ret = 0;
/*     */     try {
/* 496 */       System.out.println("bdd");
/* 497 */       PreparedStatement ps = this.conn.prepareStatement("UPDATE gammeop SET serietps=? WHERE reference=? AND numerocentre=? AND seriequ=?");
/* 498 */       ps.setInt(1, tps.intValue());
/* 499 */       ps.setString(2, reference);
/* 500 */       ps.setString(3, num);
/* 501 */       ps.setInt(1, Qu.intValue());
/* 502 */       return ps.executeUpdate();
/*     */     }
/*     */     catch (SQLException e) {
/* 505 */       JOptionPane.showMessageDialog(null, e.getMessage(), "erreur", 0);
/*     */     }
/* 507 */     return ret;
/*     */   }
/*     */ 
/*     */   public int maj_gamme_qu(String reference, String num, Integer tps, Integer Qu)
/*     */   {
/* 519 */     int ret = 0;
/*     */     try {
/* 521 */       System.out.println("bdd");
/* 522 */       PreparedStatement ps = this.conn.prepareStatement("UPDATE gammeop SET seriequ=? WHERE reference=? AND numerocentre=? AND serietps=?");
/* 523 */       ps.setInt(1, Qu.intValue());
/* 524 */       ps.setString(2, reference);
/* 525 */       ps.setString(3, num);
/* 526 */       ps.setInt(1, tps.intValue());
/* 527 */       return ps.executeUpdate();
/*     */     }
/*     */     catch (SQLException e) {
/* 530 */       JOptionPane.showMessageDialog(null, e.getMessage(), "erreur", 0);
/*     */     }
/* 532 */     return ret;
/*     */   }
/*     */ 
/*     */   public int add_uo(String reference, String num, Integer tps, Integer Qu)
/*     */   {
/* 544 */     int rs = 0;
/*     */     try {
/* 546 */       PreparedStatement ps = this.conn.prepareStatement("INSERT INTO gammeop(numerocentre,reference,serietps,seriequ) VALUES (?,?,?,?)");
/* 547 */       ps.setString(1, num);
/* 548 */       ps.setString(2, reference);
/* 549 */       ps.setInt(3, tps.intValue());
/* 550 */       ps.setInt(4, Qu.intValue());
/* 551 */       rs = ps.executeUpdate();
/*     */     } catch (SQLException e) {
/* 553 */       JOptionPane.showMessageDialog(null, e.getMessage(), "erreur", 0);
/*     */     }
/* 555 */     return rs;
/*     */   }
/*     */ 
/*     */   public int remove_uo(String reference, String num, Integer tps, Integer Qu, String ordre)
/*     */   {
/* 568 */     int rs = 0;
/*     */     try {
/* 570 */       PreparedStatement ps = this.conn.prepareStatement("DELETE FROM gammeop WHERE reference=? AND numerocentre=? AND serietps=? AND seriequ=? AND ordre=?");
/* 571 */       ps.setString(1, reference);
/* 572 */       ps.setString(2, num);
/* 573 */       ps.setInt(3, tps.intValue());
/* 574 */       ps.setInt(4, Qu.intValue());
/* 575 */       ps.setString(5, ordre);
/* 576 */       rs = ps.executeUpdate();
/*     */     } catch (SQLException e) {
/* 578 */       JOptionPane.showMessageDialog(null, e.getMessage(), "erreur", 0);
/*     */     }
/* 580 */     return rs;
/*     */   }
/*     */ 
/*     */   public int maj_entete(String code, String des)
/*     */   {
/* 590 */     int test = 0;
/*     */     try {
/* 592 */       PreparedStatement ps = this.conn.prepareStatement("UPDATE entete SET designation=? WHERE reference=?");
/* 593 */       ps.setString(1, des);
/* 594 */       ps.setString(2, code);
/* 595 */       return ps.executeUpdate();
/*     */     }
/*     */     catch (SQLException e) {
/* 598 */       JOptionPane.showMessageDialog(null, e.getMessage(), "erreur", 0);
/*     */     }
/* 600 */     return test;
/*     */   }
/*     */ 
/*     */   public int creer_user(String nom, int num) {
/* 604 */     int res = 0;
/*     */     try {
/* 606 */       PreparedStatement ps = this.conn.prepareStatement("INSERT INTO utilisateurs(pseudo,num)VALUES(?,?)");
/* 607 */       ps.setString(1, nom);
/* 608 */       ps.setInt(2, num);
/* 609 */       return ps.executeUpdate();
/*     */     }
/*     */     catch (SQLException e) {
/* 612 */       JOptionPane.showMessageDialog(null, e.getMessage(), "erreur", 0);
/* 613 */       e.printStackTrace();
/*     */     }
/* 615 */     return res;
/*     */   }
/*     */ 
/*     */   public Connection getConn()
/*     */   {
/* 622 */     return this.conn;
/*     */   }
/*     */ 
/*     */   public String getName()
/*     */   {
/* 630 */     return this.name;
/*     */   }
/*     */ 
/*     */   public String getAddress()
/*     */   {
/* 638 */     return this.address;
/*     */   }
/*     */ 
/*     */   public String getPort()
/*     */   {
/* 646 */     return this.port;
/*     */   }
/*     */ }

/* Location:           C:\Users\Bastien\Desktop\prix_revient.jar
 * Qualified Name:     bd.BDD
 * JD-Core Version:    0.6.2
 */