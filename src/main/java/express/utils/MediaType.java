package express.utils;

/**
 * Enum with common MediaTypes.
 *
 * @author Simon Reinisch
 */
public enum MediaType {
  _aw("aw", "application/applixware"),
  _atom("atom", "application/atom+xml "),
  _atomcat("atomcat", "application/atomcat+xml"),
  _atomsvc("atomsvc", "application/atomsvc+xml"),
  _ccxml("ccxml", "application/ccxml+xml"),
  _cdmia("cdmia", "application/cdmi-capability"),
  _cdmic("cdmic", "application/cdmi-container"),
  _cdmid("cdmid", "application/cdmi-domain"),
  _cdmio("cdmio", "application/cdmi-object"),
  _cdmiq("cdmiq", "application/cdmi-queue"),
  _cu("cu", "application/cu-seeme"),
  _davmount("davmount", "application/davmount+xml"),
  _dssc("dssc", "application/dssc+der"),
  _xdssc("xdssc", "application/dssc+xml"),
  _es("es", "application/ecmascript"),
  _emma("emma", "application/emma+xml"),
  _epub("epub", "application/epub+zip"),
  _exi("exi", "application/exi"),
  _pfr("pfr", "application/font-tdpfr"),
  _stk("stk", "application/hyperstudio"),
  _ipfix("ipfix", "application/ipfix"),
  _jar("jar", "application/java-archive"),
  _ser("ser", "application/java-serialized-object"),
  _class("class", "application/java-vm"),
  _js("js", "application/javascript"),
  _json("json", "application/json"),
  _hqx("hqx", "application/mac-binhex40"),
  _cpt("cpt", "application/mac-compactpro"),
  _mads("mads", "application/mads+xml"),
  _mrc("mrc", "application/marc"),
  _mrcx("mrcx", "application/marcxml+xml"),
  _ma("ma", "application/mathematica"),
  _mathml("mathml", "application/mathml+xml"),
  _mbox("mbox", "application/mbox"),
  _mscml("mscml", "application/mediaservercontrol+xml"),
  _meta4("meta4", "application/metalink4+xml"),
  _mets("mets", "application/mets+xml"),
  _mods("mods", "application/mods+xml"),
  _m21("m21", "application/mp21"),
  _doc("doc", "application/msword"),
  _mxf("mxf", "application/mxf"),
  _bin("bin", "application/octet-stream"),
  _oda("oda", "application/oda"),
  _opf("opf", "application/oebps-package+xml"),
  _ogx("ogx", "application/ogg"),
  _onetoc("onetoc", "application/onenote"),
  _xer("xer", "application/patch-ops-error+xml"),
  _pdf("pdf", "application/pdf"),
  _prf("prf", "application/pics-rules"),
  _p10("p10", "application/pkcs10"),
  _p7m("p7m", "application/pkcs7-mime"),
  _p7s("p7s", "application/pkcs7-signature"),
  _p8("p8", "application/pkcs8"),
  _ac("ac", "application/pkix-attr-cert"),
  _cer("cer", "application/pkix-cert"),
  _crl("crl", "application/pkix-crl"),
  _pkipath("pkipath", "application/pkix-pkipath"),
  _pki("pki", "application/pkixcmp"),
  _pls("pls", "application/pls+xml"),
  _ai("ai", "application/postscript"),
  _cww("cww", "application/prs.cww"),
  _pskcxml("pskcxml", "application/pskc+xml"),
  _rdf("rdf", "application/rdf+xml"),
  _rif("rif", "application/reginfo+xml"),
  _rnc("rnc", "application/relax-ng-compact-syntax"),
  _rl("rl", "application/resource-lists+xml"),
  _rld("rld", "application/resource-lists-diff+xml"),
  _rs("rs", "application/rls-services+xml"),
  _rsd("rsd", "application/rsd+xml"),
  _rss("rss", "application/rss+xml"),
  _rtf("rtf", "application/rtf"),
  _sbml("sbml", "application/sbml+xml"),
  _scq("scq", "application/scvp-cv-request"),
  _scs("scs", "application/scvp-cv-response"),
  _spq("spq", "application/scvp-vp-request"),
  _spp("spp", "application/scvp-vp-response"),
  _sdp("sdp", "application/sdp"),
  _setpay("setpay", "application/set-payment-initiation"),
  _setreg("setreg", "application/set-registration-initiation"),
  _shf("shf", "application/shf+xml"),
  _smi("smi", "application/smil+xml"),
  _rq("rq", "application/sparql-query"),
  _srx("srx", "application/sparql-results+xml"),
  _gram("gram", "application/srgs"),
  _grxml("grxml", "application/srgs+xml"),
  _sru("sru", "application/sru+xml"),
  _ssml("ssml", "application/ssml+xml"),
  _tei("tei", "application/tei+xml"),
  _tfi("tfi", "application/thraud+xml"),
  _tsd("tsd", "application/timestamped-data"),
  _plb("plb", "application/vnd.3gpp.pic-bw-large"),
  _psb("psb", "application/vnd.3gpp.pic-bw-small"),
  _pvb("pvb", "application/vnd.3gpp.pic-bw-var"),
  _tcap("tcap", "application/vnd.3gpp2.tcap"),
  _pwn("pwn", "application/vnd.3m.post-it-notes"),
  _aso("aso", "application/vnd.accpac.simply.aso"),
  _imp("imp", "application/vnd.accpac.simply.imp"),
  _acu("acu", "application/vnd.acucobol"),
  _atc("atc", "application/vnd.acucorp"),
  _air("air", "application/vnd.adobe.air-application-installer-package+zip"),
  _fxp("fxp", "application/vnd.adobe.fxp"),
  _xdp("xdp", "application/vnd.adobe.xdp+xml"),
  _xfdf("xfdf", "application/vnd.adobe.xfdf"),
  _ahead("ahead", "application/vnd.ahead.space"),
  _azf("azf", "application/vnd.airzip.filesecure.azf"),
  _azs("azs", "application/vnd.airzip.filesecure.azs"),
  _azw("azw", "application/vnd.amazon.ebook"),
  _acc("acc", "application/vnd.americandynamics.acc"),
  _ami("ami", "application/vnd.amiga.ami"),
  _apk("apk", "application/vnd.android.package-archive"),
  _cii("cii", "application/vnd.anser-web-certificate-issue-initiation"),
  _fti("fti", "application/vnd.anser-web-funds-transfer-initiation"),
  _atx("atx", "application/vnd.antix.game-component"),
  _mpkg("mpkg", "application/vnd.apple.installer+xml"),
  _m3u8("m3u8", "application/vnd.apple.mpegurl"),
  _swi("swi", "application/vnd.aristanetworks.swi"),
  _aep("aep", "application/vnd.audiograph"),
  _mpm("mpm", "application/vnd.blueice.multipass"),
  _bmi("bmi", "application/vnd.bmi"),
  _rep("rep", "application/vnd.businessobjects"),
  _cdxml("cdxml", "application/vnd.chemdraw+xml"),
  _mmd("mmd", "application/vnd.chipnuts.karaoke-mmd"),
  _cdy("cdy", "application/vnd.cinderella"),
  _cla("cla", "application/vnd.claymore"),
  _rp9("rp9", "application/vnd.cloanto.rp9"),
  _c4g("c4g", "application/vnd.clonk.c4group"),
  _c11amc("c11amc", "application/vnd.cluetrust.cartomobile-config"),
  _c11amz("c11amz", "application/vnd.cluetrust.cartomobile-config-pkg"),
  _csp("csp", "application/vnd.commonspace"),
  _cdbcmsg("cdbcmsg", "application/vnd.contact.cmsg"),
  _cmc("cmc", "application/vnd.cosmocaller"),
  _clkx("clkx", "application/vnd.crick.clicker"),
  _clkk("clkk", "application/vnd.crick.clicker.keyboard"),
  _clkp("clkp", "application/vnd.crick.clicker.palette"),
  _clkt("clkt", "application/vnd.crick.clicker.template"),
  _clkw("clkw", "application/vnd.crick.clicker.wordbank"),
  _wbs("wbs", "application/vnd.criticaltools.wbs+xml"),
  _pml("pml", "application/vnd.ctc-posml"),
  _ppd("ppd", "application/vnd.cups-ppd"),
  _car("car", "application/vnd.curl.car"),
  _pcurl("pcurl", "application/vnd.curl.pcurl"),
  _rdz("rdz", "application/vnd.data-vision.rdz"),
  _fe_launch("fe_launch", "application/vnd.denovo.fcselayout-link"),
  _dna("dna", "application/vnd.dna"),
  _mlp("mlp", "application/vnd.dolby.mlp"),
  _dpg("dpg", "application/vnd.dpgraph"),
  _dfac("dfac", "application/vnd.dreamfactory"),
  _ait("ait", "application/vnd.dvb.ait"),
  _svc("svc", "application/vnd.dvb.service"),
  _geo("geo", "application/vnd.dynageo"),
  _mag("mag", "application/vnd.ecowin.chart"),
  _nml("nml", "application/vnd.enliven"),
  _esf("esf", "application/vnd.epson.esf"),
  _msf("msf", "application/vnd.epson.msf"),
  _qam("qam", "application/vnd.epson.quickanime"),
  _slt("slt", "application/vnd.epson.salt"),
  _ssf("ssf", "application/vnd.epson.ssf"),
  _es3("es3", "application/vnd.eszigno3+xml"),
  _ez2("ez2", "application/vnd.ezpix-album"),
  _ez3("ez3", "application/vnd.ezpix-package"),
  _fdf("fdf", "application/vnd.fdf"),
  _seed("seed", "application/vnd.fdsn.seed"),
  _gph("gph", "application/vnd.flographit"),
  _ftc("ftc", "application/vnd.fluxtime.clip"),
  _fm("fm", "application/vnd.framemaker"),
  _fnc("fnc", "application/vnd.frogans.fnc"),
  _ltf("ltf", "application/vnd.frogans.ltf"),
  _fsc("fsc", "application/vnd.fsc.weblaunch"),
  _oas("oas", "application/vnd.fujitsu.oasys"),
  _oa2("oa2", "application/vnd.fujitsu.oasys2"),
  _oa3("oa3", "application/vnd.fujitsu.oasys3"),
  _fg5("fg5", "application/vnd.fujitsu.oasysgp"),
  _bh2("bh2", "application/vnd.fujitsu.oasysprs"),
  _ddd("ddd", "application/vnd.fujixerox.ddd"),
  _xdw("xdw", "application/vnd.fujixerox.docuworks"),
  _xbd("xbd", "application/vnd.fujixerox.docuworks.binder"),
  _fzs("fzs", "application/vnd.fuzzysheet"),
  _txd("txd", "application/vnd.genomatix.tuxedo"),
  _ggb("ggb", "application/vnd.geogebra.file"),
  _ggt("ggt", "application/vnd.geogebra.tool"),
  _gex("gex", "application/vnd.geometry-explorer"),
  _gxt("gxt", "application/vnd.geonext"),
  _g2w("g2w", "application/vnd.geoplan"),
  _g3w("g3w", "application/vnd.geospace"),
  _gmx("gmx", "application/vnd.gmx"),
  _kml("kml", "application/vnd.google-earth.kml+xml"),
  _kmz("kmz", "application/vnd.google-earth.kmz"),
  _gqf("gqf", "application/vnd.grafeq"),
  _gac("gac", "application/vnd.groove-account"),
  _ghf("ghf", "application/vnd.groove-help"),
  _gim("gim", "application/vnd.groove-identity-message"),
  _grv("grv", "application/vnd.groove-injector"),
  _gtm("gtm", "application/vnd.groove-tool-message"),
  _tpl("tpl", "application/vnd.groove-tool-template"),
  _vcg("vcg", "application/vnd.groove-vcard"),
  _hal("hal", "application/vnd.hal+xml"),
  _zmm("zmm", "application/vnd.handheld-entertainment+xml"),
  _hbci("hbci", "application/vnd.hbci"),
  _les("les", "application/vnd.hhe.lesson-player"),
  _hpgl("hpgl", "application/vnd.hp-hpgl"),
  _hpid("hpid", "application/vnd.hp-hpid"),
  _hps("hps", "application/vnd.hp-hps"),
  _jlt("jlt", "application/vnd.hp-jlyt"),
  _pcl("pcl", "application/vnd.hp-pcl"),
  _pclxl("pclxl", "application/vnd.hp-pclxl"),
  _sfd_hdstx("sfd-hdstx", "application/vnd.hydrostatix.sof-data"),
  _x3d("x3d", "application/vnd.hzn-3d-crossword"),
  _mpy("mpy", "application/vnd.ibm.minipay"),
  _afp("afp", "application/vnd.ibm.modcap"),
  _irm("irm", "application/vnd.ibm.rights-management"),
  _sc("sc", "application/vnd.ibm.secure-container"),
  _icc("icc", "application/vnd.iccprofile"),
  _igl("igl", "application/vnd.igloader"),
  _ivp("ivp", "application/vnd.immervision-ivp"),
  _ivu("ivu", "application/vnd.immervision-ivu"),
  _igm("igm", "application/vnd.insors.igm"),
  _xpw("xpw", "application/vnd.intercon.formnet"),
  _i2g("i2g", "application/vnd.intergeo"),
  _qbo("qbo", "application/vnd.intu.qbo"),
  _qfx("qfx", "application/vnd.intu.qfx"),
  _rcprofile("rcprofile", "application/vnd.ipunplugged.rcprofile"),
  _irp("irp", "application/vnd.irepository.package+xml"),
  _xpr("xpr", "application/vnd.is-xpr"),
  _fcs("fcs", "application/vnd.isac.fcs"),
  _jam("jam", "application/vnd.jam"),
  _rms("rms", "application/vnd.jcp.javame.midlet-rms"),
  _jisp("jisp", "application/vnd.jisp"),
  _joda("joda", "application/vnd.joost.joda-archive"),
  _ktz("ktz", "application/vnd.kahootz"),
  _karbon("karbon", "application/vnd.kde.karbon"),
  _chrt("chrt", "application/vnd.kde.kchart"),
  _kfo("kfo", "application/vnd.kde.kformula"),
  _flw("flw", "application/vnd.kde.kivio"),
  _kon("kon", "application/vnd.kde.kontour"),
  _kpr("kpr", "application/vnd.kde.kpresenter"),
  _ksp("ksp", "application/vnd.kde.kspread"),
  _kwd("kwd", "application/vnd.kde.kword"),
  _htke("htke", "application/vnd.kenameaapp"),
  _kia("kia", "application/vnd.kidspiration"),
  _kne("kne", "application/vnd.kinar"),
  _skp("skp", "application/vnd.koan"),
  _sse("sse", "application/vnd.kodak-descriptor"),
  _lasxml("lasxml", "application/vnd.las.las+xml"),
  _lbd("lbd", "application/vnd.llamagraphics.life-balance.desktop"),
  _lbe("lbe", "application/vnd.llamagraphics.life-balance.exchange+xml"),
  _123("123", "application/vnd.lotus-1-2-3"),
  _apr("apr", "application/vnd.lotus-approach"),
  _pre("pre", "application/vnd.lotus-freelance"),
  _nsf("nsf", "application/vnd.lotus-notes"),
  _org("org", "application/vnd.lotus-organizer"),
  _scm("scm", "application/vnd.lotus-screencam"),
  _lwp("lwp", "application/vnd.lotus-wordpro"),
  _portpkg("portpkg", "application/vnd.macports.portpkg"),
  _mcd("mcd", "application/vnd.mcd"),
  _mc1("mc1", "application/vnd.medcalcdata"),
  _cdkey("cdkey", "application/vnd.mediastation.cdkey"),
  _mwf("mwf", "application/vnd.mfer"),
  _mfm("mfm", "application/vnd.mfmp"),
  _flo("flo", "application/vnd.micrografx.flo"),
  _igx("igx", "application/vnd.micrografx.igx"),
  _mif("mif", "application/vnd.mif"),
  _daf("daf", "application/vnd.mobius.daf"),
  _dis("dis", "application/vnd.mobius.dis"),
  _mbk("mbk", "application/vnd.mobius.mbk"),
  _mqy("mqy", "application/vnd.mobius.mqy"),
  _msl("msl", "application/vnd.mobius.msl"),
  _plc("plc", "application/vnd.mobius.plc"),
  _txf("txf", "application/vnd.mobius.txf"),
  _mpn("mpn", "application/vnd.mophun.application"),
  _mpc("mpc", "application/vnd.mophun.certificate"),
  _xul("xul", "application/vnd.mozilla.xul+xml"),
  _cil("cil", "application/vnd.ms-artgalry"),
  _cab("cab", "application/vnd.ms-cab-compressed"),
  _xls("xls", "application/vnd.ms-excel"),
  _xlam("xlam", "application/vnd.ms-excel.addin.macroenabled.12"),
  _xlsb("xlsb", "application/vnd.ms-excel.sheet.binary.macroenabled.12"),
  _xlsm("xlsm", "application/vnd.ms-excel.sheet.macroenabled.12"),
  _xltm("xltm", "application/vnd.ms-excel.template.macroenabled.12"),
  _eot("eot", "application/vnd.ms-fontobject"),
  _chm("chm", "application/vnd.ms-htmlhelp"),
  _ims("ims", "application/vnd.ms-ims"),
  _lrm("lrm", "application/vnd.ms-lrm"),
  _thmx("thmx", "application/vnd.ms-officetheme"),
  _cat("cat", "application/vnd.ms-pki.seccat"),
  _stl("stl", "application/vnd.ms-pki.stl"),
  _ppt("ppt", "application/vnd.ms-powerpoint"),
  _ppam("ppam", "application/vnd.ms-powerpoint.addin.macroenabled.12"),
  _pptm("pptm", "application/vnd.ms-powerpoint.presentation.macroenabled.12"),
  _sldm("sldm", "application/vnd.ms-powerpoint.slide.macroenabled.12"),
  _ppsm("ppsm", "application/vnd.ms-powerpoint.slideshow.macroenabled.12"),
  _potm("potm", "application/vnd.ms-powerpoint.template.macroenabled.12"),
  _mpp("mpp", "application/vnd.ms-project"),
  _docm("docm", "application/vnd.ms-word.document.macroenabled.12"),
  _dotm("dotm", "application/vnd.ms-word.template.macroenabled.12"),
  _wps("wps", "application/vnd.ms-works"),
  _wpl("wpl", "application/vnd.ms-wpl"),
  _xps("xps", "application/vnd.ms-xpsdocument"),
  _mseq("mseq", "application/vnd.mseq"),
  _mus("mus", "application/vnd.musician"),
  _msty("msty", "application/vnd.muvee.style"),
  _nlu("nlu", "application/vnd.neurolanguage.nlu"),
  _nnd("nnd", "application/vnd.noblenet-directory"),
  _nns("nns", "application/vnd.noblenet-sealer"),
  _nnw("nnw", "application/vnd.noblenet-web"),
  _ngdat("ngdat", "application/vnd.nokia.n-gage.data"),
  _n_gage("n-gage", "application/vnd.nokia.n-gage.symbian.install"),
  _rpst("rpst", "application/vnd.nokia.radio-preset"),
  _rpss("rpss", "application/vnd.nokia.radio-presets"),
  _edm("edm", "application/vnd.novadigm.edm"),
  _edx("edx", "application/vnd.novadigm.edx"),
  _ext("ext", "application/vnd.novadigm.ext"),
  _odc("odc", "application/vnd.oasis.opendocument.chart"),
  _otc("otc", "application/vnd.oasis.opendocument.chart-template"),
  _odb("odb", "application/vnd.oasis.opendocument.database"),
  _odf("odf", "application/vnd.oasis.opendocument.formula"),
  _odft("odft", "application/vnd.oasis.opendocument.formula-template"),
  _odg("odg", "application/vnd.oasis.opendocument.graphics"),
  _otg("otg", "application/vnd.oasis.opendocument.graphics-template"),
  _odi("odi", "application/vnd.oasis.opendocument.image"),
  _oti("oti", "application/vnd.oasis.opendocument.image-template"),
  _odp("odp", "application/vnd.oasis.opendocument.presentation"),
  _otp("otp", "application/vnd.oasis.opendocument.presentation-template"),
  _ods("ods", "application/vnd.oasis.opendocument.spreadsheet"),
  _ots("ots", "application/vnd.oasis.opendocument.spreadsheet-template"),
  _odt("odt", "application/vnd.oasis.opendocument.text"),
  _odm("odm", "application/vnd.oasis.opendocument.text-master"),
  _ott("ott", "application/vnd.oasis.opendocument.text-template"),
  _oth("oth", "application/vnd.oasis.opendocument.text-web"),
  _xo("xo", "application/vnd.olpc-sugar"),
  _dd2("dd2", "application/vnd.oma.dd2+xml"),
  _oxt("oxt", "application/vnd.openofficeorg.extension"),
  _pptx("pptx", "application/vnd.openxmlformats-officedocument.presentationml.presentation"),
  _sldx("sldx", "application/vnd.openxmlformats-officedocument.presentationml.slide"),
  _ppsx("ppsx", "application/vnd.openxmlformats-officedocument.presentationml.slideshow"),
  _potx("potx", "application/vnd.openxmlformats-officedocument.presentationml.template"),
  _xlsx("xlsx", "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet"),
  _xltx("xltx", "application/vnd.openxmlformats-officedocument.spreadsheetml.template"),
  _docx("docx", "application/vnd.openxmlformats-officedocument.wordprocessingml.document"),
  _dotx("dotx", "application/vnd.openxmlformats-officedocument.wordprocessingml.template"),
  _mgp("mgp", "application/vnd.osgeo.mapguide.package"),
  _dp("dp", "application/vnd.osgi.dp"),
  _pdb("pdb", "application/vnd.palm"),
  _paw("paw", "application/vnd.pawaafile"),
  _str("str", "application/vnd.pg.format"),
  _ei6("ei6", "application/vnd.pg.osasli"),
  _efif("efif", "application/vnd.picsel"),
  _wg("wg", "application/vnd.pmi.widget"),
  _plf("plf", "application/vnd.pocketlearn"),
  _pbd("pbd", "application/vnd.powerbuilder6"),
  _box("box", "application/vnd.previewsystems.box"),
  _mgz("mgz", "application/vnd.proteus.magazine"),
  _qps("qps", "application/vnd.publishare-delta-tree"),
  _ptid("ptid", "application/vnd.pvi.ptid1"),
  _qxd("qxd", "application/vnd.quark.quarkxpress"),
  _bed("bed", "application/vnd.realvnc.bed"),
  _mxl("mxl", "application/vnd.recordare.musicxml"),
  _musicxml("musicxml", "application/vnd.recordare.musicxml+xml"),
  _cryptonote("cryptonote", "application/vnd.rig.cryptonote"),
  _cod("cod", "application/vnd.rim.cod"),
  _rm("rm", "application/vnd.rn-realmedia"),
  _link66("link66", "application/vnd.route66.link66+xml"),
  _st("st", "application/vnd.sailingtracker.track"),
  _see("see", "application/vnd.seemail"),
  _sema("sema", "application/vnd.sema"),
  _semd("semd", "application/vnd.semd"),
  _semf("semf", "application/vnd.semf"),
  _ifm("ifm", "application/vnd.shana.informed.formdata"),
  _itp("itp", "application/vnd.shana.informed.formtemplate"),
  _iif("iif", "application/vnd.shana.informed.interchange"),
  _ipk("ipk", "application/vnd.shana.informed.package"),
  _twd("twd", "application/vnd.simtech-mindmapper"),
  _mmf("mmf", "application/vnd.smaf"),
  _teacher("teacher", "application/vnd.smart.teacher"),
  _sdkm("sdkm", "application/vnd.solent.sdkm+xml"),
  _dxp("dxp", "application/vnd.spotfire.dxp"),
  _sfs("sfs", "application/vnd.spotfire.sfs"),
  _sdc("sdc", "application/vnd.stardivision.calc"),
  _sda("sda", "application/vnd.stardivision.draw"),
  _sdd("sdd", "application/vnd.stardivision.impress"),
  _smf("smf", "application/vnd.stardivision.math"),
  _sdw("sdw", "application/vnd.stardivision.writer"),
  _sgl("sgl", "application/vnd.stardivision.writer-global"),
  _sm("sm", "application/vnd.stepmania.stepchart"),
  _sxc("sxc", "application/vnd.sun.xml.calc"),
  _stc("stc", "application/vnd.sun.xml.calc.template"),
  _sxd("sxd", "application/vnd.sun.xml.draw"),
  _std("std", "application/vnd.sun.xml.draw.template"),
  _sxi("sxi", "application/vnd.sun.xml.impress"),
  _sti("sti", "application/vnd.sun.xml.impress.template"),
  _sxm("sxm", "application/vnd.sun.xml.math"),
  _sxw("sxw", "application/vnd.sun.xml.writer"),
  _sxg("sxg", "application/vnd.sun.xml.writer.global"),
  _stw("stw", "application/vnd.sun.xml.writer.template"),
  _sus("sus", "application/vnd.sus-calendar"),
  _svd("svd", "application/vnd.svd"),
  _sis("sis", "application/vnd.symbian.install"),
  _xsm("xsm", "application/vnd.syncml+xml"),
  _bdm("bdm", "application/vnd.syncml.dm+wbxml"),
  _xdm("xdm", "application/vnd.syncml.dm+xml"),
  _tao("tao", "application/vnd.tao.intent-module-archive"),
  _tmo("tmo", "application/vnd.tmobile-livetv"),
  _tpt("tpt", "application/vnd.trid.tpt"),
  _mxs("mxs", "application/vnd.triscape.mxs"),
  _tra("tra", "application/vnd.trueapp"),
  _ufd("ufd", "application/vnd.ufdl"),
  _utz("utz", "application/vnd.uiq.theme"),
  _umj("umj", "application/vnd.umajin"),
  _unityweb("unityweb", "application/vnd.unity"),
  _uoml("uoml", "application/vnd.uoml+xml"),
  _vcx("vcx", "application/vnd.vcx"),
  _vsd("vsd", "application/vnd.visio"),
  _vsdx("vsdx", "application/vnd.visio2013"),
  _vis("vis", "application/vnd.visionary"),
  _vsf("vsf", "application/vnd.vsf"),
  _wbxml("wbxml", "application/vnd.wap.wbxml"),
  _wmlc("wmlc", "application/vnd.wap.wmlc"),
  _wmlsc("wmlsc", "application/vnd.wap.wmlscriptc"),
  _wtb("wtb", "application/vnd.webturbo"),
  _nbp("nbp", "application/vnd.wolfram.player"),
  _wpd("wpd", "application/vnd.wordperfect"),
  _wqd("wqd", "application/vnd.wqd"),
  _stf("stf", "application/vnd.wt.stf"),
  _xar("xar", "application/vnd.xara"),
  _xfdl("xfdl", "application/vnd.xfdl"),
  _hvd("hvd", "application/vnd.yamaha.hv-dic"),
  _hvs("hvs", "application/vnd.yamaha.hv-script"),
  _hvp("hvp", "application/vnd.yamaha.hv-voice"),
  _osf("osf", "application/vnd.yamaha.openscoreformat"),
  _osfpvg("osfpvg", "application/vnd.yamaha.openscoreformat.osfpvg+xml"),
  _saf("saf", "application/vnd.yamaha.smaf-audio"),
  _spf("spf", "application/vnd.yamaha.smaf-phrase"),
  _cmp("cmp", "application/vnd.yellowriver-custom-menu"),
  _zir("zir", "application/vnd.zul"),
  _zaz("zaz", "application/vnd.zzazz.deck+xml"),
  _vxml("vxml", "application/voicexml+xml"),
  _wgt("wgt", "application/widget"),
  _hlp("hlp", "application/winhlp"),
  _wsdl("wsdl", "application/wsdl+xml"),
  _wspolicy("wspolicy", "application/wspolicy+xml"),
  _7z("7z", "application/x-7z-compressed"),
  _abw("abw", "application/x-abiword"),
  _ace("ace", "application/x-ace-compressed"),
  _aab("aab", "application/x-authorware-bin"),
  _aam("aam", "application/x-authorware-map"),
  _aas("aas", "application/x-authorware-seg"),
  _bcpio("bcpio", "application/x-bcpio"),
  _torrent("torrent", "application/x-bittorrent"),
  _bz("bz", "application/x-bzip"),
  _bz2("bz2", "application/x-bzip2"),
  _vcd("vcd", "application/x-cdlink"),
  _chat("chat", "application/x-chat"),
  _pgn("pgn", "application/x-chess-pgn"),
  _cpio("cpio", "application/x-cpio"),
  _csh("csh", "application/x-csh"),
  _deb("deb", "application/x-debian-package"),
  _dir("dir", "application/x-director"),
  _wad("wad", "application/x-doom"),
  _ncx("ncx", "application/x-dtbncx+xml"),
  _dtb("dtb", "application/x-dtbook+xml"),
  _res("res", "application/x-dtbresource+xml"),
  _dvi("dvi", "application/x-dvi"),
  _bdf("bdf", "application/x-font-bdf"),
  _gsf("gsf", "application/x-font-ghostscript"),
  _psf("psf", "application/x-font-linux-psf"),
  _otf("otf", "application/x-font-otf"),
  _pcf("pcf", "application/x-font-pcf"),
  _snf("snf", "application/x-font-snf"),
  _ttf("ttf", "application/x-font-ttf"),
  _pfa("pfa", "application/x-font-type1"),
  _woff("woff", "application/x-font-woff"),
  _spl("spl", "application/x-futuresplash"),
  _gnumeric("gnumeric", "application/x-gnumeric"),
  _gtar("gtar", "application/x-gtar"),
  _hdf("hdf", "application/x-hdf"),
  _jnlp("jnlp", "application/x-java-jnlp-file"),
  _latex("latex", "application/x-latex"),
  _prc("prc", "application/x-mobipocket-ebook"),
  _application("application", "application/x-ms-application"),
  _wmd("wmd", "application/x-ms-wmd"),
  _wmz("wmz", "application/x-ms-wmz"),
  _xbap("xbap", "application/x-ms-xbap"),
  _mdb("mdb", "application/x-msaccess"),
  _obd("obd", "application/x-msbinder"),
  _crd("crd", "application/x-mscardfile"),
  _clp("clp", "application/x-msclip"),
  _exe("exe", "application/x-msdownload"),
  _mvb("mvb", "application/x-msmediaview"),
  _wmf("wmf", "application/x-msmetafile"),
  _mny("mny", "application/x-msmoney"),
  _pub("pub", "application/x-mspublisher"),
  _scd("scd", "application/x-msschedule"),
  _trm("trm", "application/x-msterminal"),
  _wri("wri", "application/x-mswrite"),
  _nc("nc", "application/x-netcdf"),
  _p12("p12", "application/x-pkcs12"),
  _p7b("p7b", "application/x-pkcs7-certificates"),
  _p7r("p7r", "application/x-pkcs7-certreqresp"),
  _rar("rar", "application/x-rar-compressed"),
  _sh("sh", "application/x-sh"),
  _shar("shar", "application/x-shar"),
  _swf("swf", "application/x-shockwave-flash"),
  _xap("xap", "application/x-silverlight-app"),
  _sit("sit", "application/x-stuffit"),
  _sitx("sitx", "application/x-stuffitx"),
  _sv4cpio("sv4cpio", "application/x-sv4cpio"),
  _sv4crc("sv4crc", "application/x-sv4crc"),
  _tar("tar", "application/x-tar"),
  _tcl("tcl", "application/x-tcl"),
  _tex("tex", "application/x-tex"),
  _tfm("tfm", "application/x-tex-tfm"),
  _texinfo("texinfo", "application/x-texinfo"),
  _ustar("ustar", "application/x-ustar"),
  _src("src", "application/x-wais-source"),
  _der("der", "application/x-x509-ca-cert"),
  _fig("fig", "application/x-xfig"),
  _xpi("xpi", "application/x-xpinstall"),
  _xdf("xdf", "application/xcap-diff+xml"),
  _xenc("xenc", "application/xenc+xml"),
  _xhtml("xhtml", "application/xhtml+xml"),
  _xml("xml", "application/xml"),
  _dtd("dtd", "application/xml-dtd"),
  _xop("xop", "application/xop+xml"),
  _xslt("xslt", "application/xslt+xml"),
  _xspf("xspf", "application/xspf+xml"),
  _mxml("mxml", "application/xv+xml"),
  _yang("yang", "application/yang"),
  _yin("yin", "application/yin+xml"),
  _zip("zip", "application/zip"),
  _adp("adp", "audio/adpcm"),
  _au("au", "audio/basic"),
  _mid("mid", "audio/midi"),
  _mp4a("mp4a", "audio/mp4"),
  _mpga("mpga", "audio/mpeg"),
  _oga("oga", "audio/ogg"),
  _uva("uva", "audio/vnd.dece.audio"),
  _eol("eol", "audio/vnd.digital-winds"),
  _dra("dra", "audio/vnd.dra"),
  _dts("dts", "audio/vnd.dts"),
  _dtshd("dtshd", "audio/vnd.dts.hd"),
  _lvp("lvp", "audio/vnd.lucent.voice"),
  _pya("pya", "audio/vnd.ms-playready.media.pya"),
  _ecelp4800("ecelp4800", "audio/vnd.nuera.ecelp4800"),
  _ecelp7470("ecelp7470", "audio/vnd.nuera.ecelp7470"),
  _ecelp9600("ecelp9600", "audio/vnd.nuera.ecelp9600"),
  _rip("rip", "audio/vnd.rip"),
  _weba("weba", "audio/webm"),
  _aac("aac", "audio/x-aac"),
  _aif("aif", "audio/x-aiff"),
  _m3u("m3u", "audio/x-mpegurl"),
  _wax("wax", "audio/x-ms-wax"),
  _wma("wma", "audio/x-ms-wma"),
  _ram("ram", "audio/x-pn-realaudio"),
  _rmp("rmp", "audio/x-pn-realaudio-plugin"),
  _wav("wav", "audio/x-wav"),
  _cdx("cdx", "chemical/x-cdx"),
  _cif("cif", "chemical/x-cif"),
  _cmdf("cmdf", "chemical/x-cmdf"),
  _cml("cml", "chemical/x-cml"),
  _csml("csml", "chemical/x-csml"),
  _xyz("xyz", "chemical/x-xyz"),
  _bmp("bmp", "image/bmp"),
  _cgm("cgm", "image/cgm"),
  _g3("g3", "image/g3fax"),
  _gif("gif", "image/gif"),
  _ief("ief", "image/ief"),
  _jpeg("jpeg", "image/jpeg"),
  _jpg("jpg", "image/jpeg"),
  _pjpeg("pjpeg", "image/pjpeg"),
  _ktx("ktx", "image/ktx"),
  _png("png", "image/x-citrix-png"),
  _btif("btif", "image/prs.btif"),
  _svg("svg", "image/svg+xml"),
  _tiff("tiff", "image/tiff"),
  _psd("psd", "image/vnd.adobe.photoshop"),
  _uvi("uvi", "image/vnd.dece.graphic"),
  _sub("sub", "image/vnd.dvb.subtitle"),
  _djvu("djvu", "image/vnd.djvu"),
  _dwg("dwg", "image/vnd.dwg"),
  _dxf("dxf", "image/vnd.dxf"),
  _fbs("fbs", "image/vnd.fastbidsheet"),
  _fpx("fpx", "image/vnd.fpx"),
  _fst("fst", "image/vnd.fst"),
  _mmr("mmr", "image/vnd.fujixerox.edmics-mmr"),
  _rlc("rlc", "image/vnd.fujixerox.edmics-rlc"),
  _mdi("mdi", "image/vnd.ms-modi"),
  _npx("npx", "image/vnd.net-fpx"),
  _wbmp("wbmp", "image/vnd.wap.wbmp"),
  _xif("xif", "image/vnd.xiff"),
  _webp("webp", "image/webp"),
  _ras("ras", "image/x-cmu-raster"),
  _cmx("cmx", "image/x-cmx"),
  _fh("fh", "image/x-freehand"),
  _ico("ico", "image/x-icon"),
  _pcx("pcx", "image/x-pcx"),
  _pic("pic", "image/x-pict"),
  _pnm("pnm", "image/x-portable-anymap"),
  _pbm("pbm", "image/x-portable-bitmap"),
  _pgm("pgm", "image/x-portable-graymap"),
  _ppm("ppm", "image/x-portable-pixmap"),
  _rgb("rgb", "image/x-rgb"),
  _xbm("xbm", "image/x-xbitmap"),
  _xpm("xpm", "image/x-xpixmap"),
  _xwd("xwd", "image/x-xwindowdump"),
  _eml("eml", "message/rfc822"),
  _igs("igs", "model/iges"),
  _msh("msh", "model/mesh"),
  _dae("dae", "model/vnd.collada+xml"),
  _dwf("dwf", "model/vnd.dwf"),
  _gdl("gdl", "model/vnd.gdl"),
  _gtw("gtw", "model/vnd.gtw"),
  _mts("mts", "model/vnd.mts"),
  _vtu("vtu", "model/vnd.vtu"),
  _wrl("wrl", "model/vrml"),
  _ics("ics", "text/calendar"),
  _css("css", "text/css"),
  _csv("csv", "text/csv"),
  _html("html", "text/html"),
  _n3("n3", "text/n3"),
  _txt("txt", "text/plain"),
  _dsc("dsc", "text/prs.lines.tag"),
  _rtx("rtx", "text/richtext"),
  _sgml("sgml", "text/sgml"),
  _tsv("tsv", "text/tab-separated-values"),
  _t("t", "text/troff"),
  _ttl("ttl", "text/turtle"),
  _uri("uri", "text/uri-list"),
  _curl("curl", "text/vnd.curl"),
  _dcurl("dcurl", "text/vnd.curl.dcurl"),
  _scurl("scurl", "text/vnd.curl.scurl"),
  _mcurl("mcurl", "text/vnd.curl.mcurl"),
  _fly("fly", "text/vnd.fly"),
  _flx("flx", "text/vnd.fmi.flexstor"),
  _gv("gv", "text/vnd.graphviz"),
  _3dml("3dml", "text/vnd.in3d.3dml"),
  _spot("spot", "text/vnd.in3d.spot"),
  _jad("jad", "text/vnd.sun.j2me.app-descriptor"),
  _wml("wml", "text/vnd.wap.wml"),
  _wmls("wmls", "text/vnd.wap.wmlscript"),
  _s("s", "text/x-asm"),
  _c("c", "text/x-c"),
  _f("f", "text/x-fortran"),
  _p("p", "text/x-pascal"),
  _java("java", "text/x-java-source"),
  _etx("etx", "text/x-setext"),
  _uu("uu", "text/x-uuencode"),
  _vcs("vcs", "text/x-vcalendar"),
  _vcf("vcf", "text/x-vcard"),
  _3gp("3gp", "video/3gpp"),
  _3g2("3g2", "video/3gpp2"),
  _h261("h261", "video/h261"),
  _h263("h263", "video/h263"),
  _h264("h264", "video/h264"),
  _jpgv("jpgv", "video/jpeg"),
  _jpm("jpm", "video/jpm"),
  _mj2("mj2", "video/mj2"),
  _mp4("mp4", "video/mp4"),
  _mpeg("mpeg", "video/mpeg"),
  _ogv("ogv", "video/ogg"),
  _qt("qt", "video/quicktime"),
  _uvh("uvh", "video/vnd.dece.hd"),
  _uvm("uvm", "video/vnd.dece.mobile"),
  _uvp("uvp", "video/vnd.dece.pd"),
  _uvs("uvs", "video/vnd.dece.sd"),
  _uvv("uvv", "video/vnd.dece.video"),
  _fvt("fvt", "video/vnd.fvt"),
  _mxu("mxu", "video/vnd.mpegurl"),
  _pyv("pyv", "video/vnd.ms-playready.media.pyv"),
  _uvu("uvu", "video/vnd.uvvu.mp4"),
  _viv("viv", "video/vnd.vivo"),
  _webm("webm", "video/webm"),
  _f4v("f4v", "video/x-f4v"),
  _fli("fli", "video/x-fli"),
  _flv("flv", "video/x-flv"),
  _m4v("m4v", "video/x-m4v"),
  _asf("asf", "video/x-ms-asf"),
  _wm("wm", "video/x-ms-wm"),
  _wmv("wmv", "video/x-ms-wmv"),
  _wmx("wmx", "video/x-ms-wmx"),
  _wvx("wvx", "video/x-ms-wvx"),
  _avi("avi", "video/x-msvideo"),
  _movie("movie", "video/x-sgi-movie"),
  _ice("ice", "x-conference/x-cooltalk"),
  _par("par", "text/plain-bas"),
  _yaml("yaml", "text/yaml"),
  _dmg("dmg", "application/x-apple-diskimage"),
  _xww("form", "application/x-www-form-urlencoded");

  private final String mime;
  private final String extension;

  MediaType(String extension, String mime) {
    this.mime = mime;
    this.extension = extension;
  }

  public static MediaType getByExtension(String extension) {
    for (MediaType type : values()) {
      if (type.extension.equals(extension)) {
        return type;
      }
    }
    return null;
  }

  public String getMIME() {
    return mime;
  }

  public String getExtension() {
    return extension;
  }
}
