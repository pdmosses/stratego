---
title: terms-namespaced.sdf3
hide:
  - toc
---

# `terms-namespaced.sdf3`



[pdmosses/stratego/stratego.lang/src-gen/syntax/StrategoLang/core/terms-namespaced.sdf3]: https://github.com/pdmosses/stratego/blob/master/stratego.lang/src-gen/syntax/StrategoLang/core/terms-namespaced.sdf3 "The source file on GitHub"

<div class="sdf3"><table class="highlighttable"><tbody><tr><td class="linenos"><div class="linenodiv"><pre><span></span>1
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
19
20
21
22
23
24
25
26
27
28
29
30
31
32
33
34
35
36
37
38
39
40
41
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <a href="../../sugar/terms-namespaced.sdf3#StrategoLang/core/terms-namespaced_54_88" id="StrategoLang/core/terms-namespaced_7_41" title="Referenced at ../../sugar/terms-namespaced.sdf3 line 4">StrategoLang/core/terms-namespaced</a>

<span class="keyword">imports</span>
  <a href="../identifiers-namespaced.sdf3#StrategoLang/core/identifiers-namespaced_7_47" id="StrategoLang/core/identifiers-namespaced_53_93" title="Defined at ../identifiers-namespaced.sdf3 line 1">StrategoLang/core/identifiers-namespaced</a>        
  <a href="../constants-namespaced.sdf3#StrategoLang/core/constants-namespaced_7_45" id="StrategoLang/core/constants-namespaced_97_135" title="Defined at ../constants-namespaced.sdf3 line 1">StrategoLang/core/constants-namespaced</a>

<span class="keyword">sorts</span> <a href="#StrategoLang-ID_240_255" id="StrategoLang-ID_143_158" title="Referenced at line 11; ../../gradual-types/strategies-namespaced.sdf3 line 36; ../../sugar/strategies-namespaced.sdf3 line 32">StrategoLang-ID</a> <a href="#StrategoLang-Var_1194_1210" id="StrategoLang-Var_159_175" title="Referenced at line 36; ../../deduplicated-namespaced.sdf3 line 17; ../../sugar/terms-namespaced.sdf3 line 33">StrategoLang-Var</a> <a href="#StrategoLang-Wld_738_754" id="StrategoLang-Wld_176_192" title="Referenced at line 29; ../../sugar/terms-namespaced.sdf3 line 34">StrategoLang-Wld</a>

<span class="keyword">context-free syntax</span>

  <a href="#StrategoLang-Var_1194_1210" id="StrategoLang-Var_217_233" title="Referenced at line 36; ../../deduplicated-namespaced.sdf3 line 17; ../../sugar/terms-namespaced.sdf3 line 33">StrategoLang-Var</a>.<span class="cons_Constructor"><span id="Var_234_237" title="Not referenced locally, nor via imports">Var</span></span> = <a href="#StrategoLang-ID_143_158" id="StrategoLang-ID_240_255" title="Defined at line 7, 12">StrategoLang-ID</a> { }
  <a href="#StrategoLang-ID_240_255" id="StrategoLang-ID_262_277" title="Referenced at line 11; ../../gradual-types/strategies-namespaced.sdf3 line 36; ../../sugar/strategies-namespaced.sdf3 line 32">StrategoLang-ID</a> = <a href="../identifiers-namespaced.sdf3#StrategoLang-Id_645_660" id="StrategoLang-Id_280_295" title="Defined at ../identifiers-namespaced.sdf3 line 27, 29, 49, 50, 51">StrategoLang-Id</a> { }
  <a href="#StrategoLang-Wld_738_754" id="StrategoLang-Wld_302_318" title="Referenced at line 29; ../../sugar/terms-namespaced.sdf3 line 34">StrategoLang-Wld</a>.<span class="cons_Constructor"><span id="Wld_319_322" title="Not referenced locally, nor via imports">Wld</span></span> = <span class="cons_Lit">"_"</span> { }

<span class="keyword">sorts</span> <a href="#StrategoLang-Term_1323_1340" id="StrategoLang-Term_340_357" title="Referenced at line 41; ../../deduplicated-namespaced.sdf3 line 30; ../../sugar/dynamic-rules-namespaced.sdf3 line 57; ../../sugar/overlays-namespaced.sdf3 line 12; ../../sugar/rules-namespaced.sdf3 line 36; ../../sugar/strategies-namespaced.sdf3 line 67; ../../sugar/string-quotations-namespaced.sdf3 line 74">StrategoLang-Term</a>

<span class="keyword">context-free syntax</span>

  <a href="#StrategoLang-Term_1323_1340" id="StrategoLang-Term_382_399" title="Referenced at line 41; ../../deduplicated-namespaced.sdf3 line 30; ../../sugar/dynamic-rules-namespaced.sdf3 line 57; ../../sugar/overlays-namespaced.sdf3 line 12; ../../sugar/rules-namespaced.sdf3 line 36; ../../sugar/strategies-namespaced.sdf3 line 67; ../../sugar/string-quotations-namespaced.sdf3 line 74">StrategoLang-Term</a> = <a href="#StrategoLang-Var_159_175" id="StrategoLang-Var_402_418" title="Defined at line 7, 11">StrategoLang-Var</a> { }
  <a href="#StrategoLang-Term_1323_1340" id="StrategoLang-Term_425_442" title="Referenced at line 41; ../../deduplicated-namespaced.sdf3 line 30; ../../sugar/dynamic-rules-namespaced.sdf3 line 57; ../../sugar/overlays-namespaced.sdf3 line 12; ../../sugar/rules-namespaced.sdf3 line 36; ../../sugar/strategies-namespaced.sdf3 line 67; ../../sugar/string-quotations-namespaced.sdf3 line 74">StrategoLang-Term</a> = <a href="#StrategoLang-Wld_176_192" id="StrategoLang-Wld_445_461" title="Defined at line 7, 13">StrategoLang-Wld</a> { }
  <a href="#StrategoLang-Term_1323_1340" id="StrategoLang-Term_468_485" title="Referenced at line 41; ../../deduplicated-namespaced.sdf3 line 30; ../../sugar/dynamic-rules-namespaced.sdf3 line 57; ../../sugar/overlays-namespaced.sdf3 line 12; ../../sugar/rules-namespaced.sdf3 line 36; ../../sugar/strategies-namespaced.sdf3 line 67; ../../sugar/string-quotations-namespaced.sdf3 line 74">StrategoLang-Term</a>.<span class="cons_Constructor"><a href="#Anno_1341_1345" id="Anno_486_490" title="Referenced at line 41; ../../sugar/terms-namespaced.sdf3 line 41">Anno</a></span> = &lt;&lt;<a href="#StrategoLang-PreTerm_624_644" id="StrategoLang-PreTerm_495_515" title="Defined at line 24, 28, 29, 30, 31, 32, 33, 34, 35, 36">StrategoLang-PreTerm</a>&gt;<span class="cons_String">{^</span>&lt;<a href="#StrategoLang-PreTerm_624_644" id="StrategoLang-PreTerm_519_539" title="Defined at line 24, 28, 29, 30, 31, 32, 33, 34, 35, 36">StrategoLang-PreTerm</a>&gt;<span class="cons_String">}</span>&gt; { }
  <a href="#StrategoLang-Term_1323_1340" id="StrategoLang-Term_549_566" title="Referenced at line 41; ../../deduplicated-namespaced.sdf3 line 30; ../../sugar/dynamic-rules-namespaced.sdf3 line 57; ../../sugar/overlays-namespaced.sdf3 line 12; ../../sugar/rules-namespaced.sdf3 line 36; ../../sugar/strategies-namespaced.sdf3 line 67; ../../sugar/string-quotations-namespaced.sdf3 line 74">StrategoLang-Term</a>.<span class="cons_Constructor"><a href="#As_1317_1319" id="As_567_569" title="Referenced at line 40">As</a></span> = &lt;&lt;<a href="#StrategoLang-Var_159_175" id="StrategoLang-Var_574_590" title="Defined at line 7, 11">StrategoLang-Var</a>&gt;<span class="cons_String">@</span>&lt;<a href="#StrategoLang-Term_340_357" id="StrategoLang-Term_593_610" title="Defined at line 15, 19, 20, 21, 22">StrategoLang-Term</a>&gt;&gt; { }

<span class="keyword">sorts</span> <a href="#StrategoLang-PreTerm_1348_1368" id="StrategoLang-PreTerm_624_644" title="Referenced at line 41; ../../gradual-types/terms-namespaced.sdf3 line 15">StrategoLang-PreTerm</a>

<span class="keyword">context-free syntax</span>

  <a href="#StrategoLang-PreTerm_1348_1368" id="StrategoLang-PreTerm_669_689" title="Referenced at line 41; ../../gradual-types/terms-namespaced.sdf3 line 15">StrategoLang-PreTerm</a> = <a href="#StrategoLang-Var_159_175" id="StrategoLang-Var_692_708" title="Defined at line 7, 11">StrategoLang-Var</a> { }
  <a href="#StrategoLang-PreTerm_1348_1368" id="StrategoLang-PreTerm_715_735" title="Referenced at line 41; ../../gradual-types/terms-namespaced.sdf3 line 15">StrategoLang-PreTerm</a> = <a href="#StrategoLang-Wld_176_192" id="StrategoLang-Wld_738_754" title="Defined at line 7, 13">StrategoLang-Wld</a> { }
  <a href="#StrategoLang-PreTerm_1348_1368" id="StrategoLang-PreTerm_761_781" title="Referenced at line 41; ../../gradual-types/terms-namespaced.sdf3 line 15">StrategoLang-PreTerm</a>.<span class="cons_Constructor"><span id="Int_782_785" title="Not referenced locally, nor via imports">Int</span></span> = <a href="../constants-namespaced.sdf3#StrategoLang-Int_113_129" id="StrategoLang-Int_788_804" title="Defined at ../constants-namespaced.sdf3 line 8">StrategoLang-Int</a> { }
  <a href="#StrategoLang-PreTerm_1348_1368" id="StrategoLang-PreTerm_811_831" title="Referenced at line 41; ../../gradual-types/terms-namespaced.sdf3 line 15">StrategoLang-PreTerm</a>.<span class="cons_Constructor"><span id="Real_832_836" title="Not referenced locally, nor via imports">Real</span></span> = <a href="../constants-namespaced.sdf3#StrategoLang-Real_151_168" id="StrategoLang-Real_839_856" title="Defined at ../constants-namespaced.sdf3 line 9">StrategoLang-Real</a> { }
  <a href="#StrategoLang-PreTerm_1348_1368" id="StrategoLang-PreTerm_863_883" title="Referenced at line 41; ../../gradual-types/terms-namespaced.sdf3 line 15">StrategoLang-PreTerm</a>.<span class="cons_Constructor"><span id="Str_884_887" title="Not referenced locally, nor via imports">Str</span></span> = <a href="../constants-namespaced.sdf3#StrategoLang-String_202_221" id="StrategoLang-String_890_909" title="Defined at ../constants-namespaced.sdf3 line 10">StrategoLang-String</a> { }
  <a href="#StrategoLang-PreTerm_1348_1368" id="StrategoLang-PreTerm_916_936" title="Referenced at line 41; ../../gradual-types/terms-namespaced.sdf3 line 15">StrategoLang-PreTerm</a>.<span class="cons_Constructor"><span id="Op_937_939" title="Not referenced locally, nor via imports">Op</span></span> = &lt;&lt;<a href="../identifiers-namespaced.sdf3#StrategoLang-Id_645_660" id="StrategoLang-Id_944_959" title="Defined at ../identifiers-namespaced.sdf3 line 27, 29, 49, 50, 51">StrategoLang-Id</a>&gt;<span class="cons_String">(</span>&lt;{<a href="#StrategoLang-Term_340_357" id="StrategoLang-Term_963_980" title="Defined at line 15, 19, 20, 21, 22">StrategoLang-Term</a> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">)</span>&gt; { }
  <a href="#StrategoLang-PreTerm_1348_1368" id="StrategoLang-PreTerm_997_1017" title="Referenced at line 41; ../../gradual-types/terms-namespaced.sdf3 line 15">StrategoLang-PreTerm</a>.<span class="cons_Constructor"><span id="OpQ_1018_1021" title="Not referenced locally, nor via imports">OpQ</span></span> = &lt;&lt;<a href="../constants-namespaced.sdf3#StrategoLang-String_202_221" id="StrategoLang-String_1026_1045" title="Defined at ../constants-namespaced.sdf3 line 10">StrategoLang-String</a>&gt;<span class="cons_String">(</span>&lt;{<a href="#StrategoLang-Term_340_357" id="StrategoLang-Term_1049_1066" title="Defined at line 15, 19, 20, 21, 22">StrategoLang-Term</a> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">)</span>&gt; { }
  <a href="#StrategoLang-PreTerm_1348_1368" id="StrategoLang-PreTerm_1083_1103" title="Referenced at line 41; ../../gradual-types/terms-namespaced.sdf3 line 15">StrategoLang-PreTerm</a>.<span class="cons_Constructor"><a href="#Explode_1289_1296" id="Explode_1104_1111" title="Referenced at line 40; ../../sugar/terms-namespaced.sdf3 line 42">Explode</a></span> = &lt;&lt;<a href="#StrategoLang-Term_340_357" id="StrategoLang-Term_1116_1133" title="Defined at line 15, 19, 20, 21, 22">StrategoLang-Term</a>&gt;<span class="cons_String">#(</span>&lt;<a href="#StrategoLang-Term_340_357" id="StrategoLang-Term_1137_1154" title="Defined at line 15, 19, 20, 21, 22">StrategoLang-Term</a>&gt;<span class="cons_String">)</span>&gt; { }
  <a href="#StrategoLang-PreTerm_1348_1368" id="StrategoLang-PreTerm_1164_1184" title="Referenced at line 41; ../../gradual-types/terms-namespaced.sdf3 line 15">StrategoLang-PreTerm</a>.<span class="cons_Constructor"><a href="#AsPT_1369_1373" id="AsPT_1185_1189" title="Referenced at line 41; ../../sugar/terms-namespaced.sdf3 line 39">AsPT</a></span> = &lt;&lt;<a href="#StrategoLang-Var_159_175" id="StrategoLang-Var_1194_1210" title="Defined at line 7, 11">StrategoLang-Var</a>&gt;<span class="cons_String">@</span>&lt;<a href="#StrategoLang-PreTerm_624_644" id="StrategoLang-PreTerm_1213_1233" title="Defined at line 24, 28, 29, 30, 31, 32, 33, 34, 35, 36">StrategoLang-PreTerm</a>&gt;&gt; { }

<span class="keyword">context-free priorities</span>

  <a href="#StrategoLang-PreTerm_624_644" id="StrategoLang-PreTerm_1268_1288" title="Defined at line 24, 28, 29, 30, 31, 32, 33, 34, 35, 36">StrategoLang-PreTerm</a>.<span class="cons_Constructor"><a href="#Explode_1104_1111" id="Explode_1289_1296" title="Defined at line 35">Explode</a></span> &gt; <a href="#StrategoLang-Term_340_357" id="StrategoLang-Term_1299_1316" title="Defined at line 15, 19, 20, 21, 22">StrategoLang-Term</a>.<span class="cons_Constructor"><a href="#As_567_569" id="As_1317_1319" title="Defined at line 22">As</a></span>,
  <a href="#StrategoLang-Term_340_357" id="StrategoLang-Term_1323_1340" title="Defined at line 15, 19, 20, 21, 22">StrategoLang-Term</a>.<span class="cons_Constructor"><a href="#Anno_486_490" id="Anno_1341_1345" title="Defined at line 21">Anno</a></span> &gt; <a href="#StrategoLang-PreTerm_624_644" id="StrategoLang-PreTerm_1348_1368" title="Defined at line 24, 28, 29, 30, 31, 32, 33, 34, 35, 36">StrategoLang-PreTerm</a>.<span class="cons_Constructor"><a href="#AsPT_1185_1189" id="AsPT_1369_1373" title="Defined at line 36">AsPT</a></span>

</code></pre></td></tr></tbody></table></div>