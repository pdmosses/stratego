---
title: terms-namespaced.sdf3
---

# `terms-namespaced.sdf3`

:simple-github: [pdmosses/stratego/stratego.lang/src-gen/syntax/StrategoLang/sugar/terms-namespaced.sdf3]

[pdmosses/stratego/stratego.lang/src-gen/syntax/StrategoLang/sugar/terms-namespaced.sdf3]: https://github.com/pdmosses/stratego/blob/master/stratego.lang/src-gen/syntax/StrategoLang/sugar/terms-namespaced.sdf3 "The source file on GitHub"

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
42
43
44
45
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <a href="../strategies-namespaced.sdf3#StrategoLang/sugar/terms-namespaced_226_261" id="StrategoLang/sugar/terms-namespaced_7_42" title="Referenced at ../strategies-namespaced.sdf3 line 8">StrategoLang/sugar/terms-namespaced</a>

<span class="keyword">imports</span>
  <a href="../../core/terms-namespaced.sdf3#StrategoLang/core/terms-namespaced_7_41" id="StrategoLang/core/terms-namespaced_54_88" title="Defined at ../../core/terms-namespaced.sdf3 line 1">StrategoLang/core/terms-namespaced</a>        
  <a href="../../core/identifiers-namespaced.sdf3#StrategoLang/core/identifiers-namespaced_7_47" id="StrategoLang/core/identifiers-namespaced_92_132" title="Defined at ../../core/identifiers-namespaced.sdf3 line 1">StrategoLang/core/identifiers-namespaced</a>        
  <a href="../constants-namespaced.sdf3#StrategoLang/sugar/constants-namespaced_7_46" id="StrategoLang/sugar/constants-namespaced_136_175" title="Defined at ../constants-namespaced.sdf3 line 1">StrategoLang/sugar/constants-namespaced</a>        
  <a href="../strategies-namespaced.sdf3#StrategoLang/sugar/strategies-namespaced_7_47" id="StrategoLang/sugar/strategies-namespaced_179_219" title="Defined at ../strategies-namespaced.sdf3 line 1">StrategoLang/sugar/strategies-namespaced</a>

<span class="keyword">context-free syntax</span>

  <span id="StrategoLang-ID_244_259" title="Not referenced locally, nor via imports">StrategoLang-ID</span>.<span class="cons_Constructor"><span id="ListVar_260_267" title="Not referenced locally, nor via imports">ListVar</span></span> = <a href="../../core/identifiers-namespaced.sdf3#StrategoLang-LId_697_713" id="StrategoLang-LId_270_286" title="Defined at ../../core/identifiers-namespaced.sdf3 line 28">StrategoLang-LId</a> { }

<span class="keyword">context-free syntax</span>

  <a href="#StrategoLang-Term_2032_2049" id="StrategoLang-Term_315_332" title="Referenced at line 44">StrategoLang-Term</a>.<span class="cons_Constructor"><a href="#BuildDefault_2050_2062" id="BuildDefault_333_345" title="Referenced at line 44">BuildDefault</a></span> = &lt;<span class="cons_String">_</span>&lt;<a href="#StrategoLang-Term_315_332" id="StrategoLang-Term_351_368" title="Defined at line 15, 16, 17, 18, 19, 33">StrategoLang-Term</a>&gt;&gt; { }
  <a href="#StrategoLang-Term_2032_2049" id="StrategoLang-Term_377_394" title="Referenced at line 44">StrategoLang-Term</a>.<span class="cons_Constructor"><a href="#AnnoList_1727_1735" id="AnnoList_395_403" title="Referenced at line 39">AnnoList</a></span> = &lt;&lt;<a href="#StrategoLang-PreTerm_686_706" id="StrategoLang-PreTerm_408_428" title="Defined at line 23, 24, 25, 26, 27, 28, 29, 33, 34">StrategoLang-PreTerm</a>&gt;<span class="cons_String">{</span>&lt;{<a href="#StrategoLang-Term_315_332" id="StrategoLang-Term_432_449" title="Defined at line 15, 16, 17, 18, 19, 33">StrategoLang-Term</a> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">}</span>&gt; { }
  <a href="#StrategoLang-Term_2032_2049" id="StrategoLang-Term_466_483" title="Referenced at line 44">StrategoLang-Term</a>.<span class="cons_Constructor"><a href="#NoAnnoList_1449_1459" id="NoAnnoList_484_494" title="Referenced at line 35">NoAnnoList</a></span> = <a href="#StrategoLang-PreTerm_686_706" id="StrategoLang-PreTerm_497_517" title="Defined at line 23, 24, 25, 26, 27, 28, 29, 33, 34">StrategoLang-PreTerm</a> { }
  <a href="#StrategoLang-Term_2032_2049" id="StrategoLang-Term_524_541" title="Referenced at line 44">StrategoLang-Term</a>.<span class="cons_Constructor"><a href="#App_1933_1936" id="App_542_545" title="Referenced at line 42">App</a></span> = [<span class="cons_String">&lt;</span>[<a href="../strategies-namespaced.sdf3#StrategoLang-Strategy_1078_1099" id="StrategoLang-Strategy_551_572" title="Defined at ../strategies-namespaced.sdf3 line 38, 41, 42, 43, 44, 45, 46, 47, 49, 50, 51, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 72, 73, 74, 75, 76, 77, 78, 79, 80, 86, 89">StrategoLang-Strategy</a>]<span class="cons_String">&gt;</span> [<a href="#StrategoLang-Term_315_332" id="StrategoLang-Term_576_593" title="Defined at line 15, 16, 17, 18, 19, 33">StrategoLang-Term</a>]] { }
  <a href="#StrategoLang-Term_2032_2049" id="StrategoLang-Term_602_619" title="Referenced at line 44">StrategoLang-Term</a>.<span class="cons_Constructor"><span id="RootApp_620_627" title="Not referenced locally, nor via imports">RootApp</span></span> = [<span class="cons_String">&lt;</span>[<a href="../strategies-namespaced.sdf3#StrategoLang-Strategy_1078_1099" id="StrategoLang-Strategy_633_654" title="Defined at ../strategies-namespaced.sdf3 line 38, 41, 42, 43, 44, 45, 46, 47, 49, 50, 51, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 72, 73, 74, 75, 76, 77, 78, 79, 80, 86, 89">StrategoLang-Strategy</a>]<span class="cons_String">&gt;</span>] { }

<span class="keyword">context-free syntax</span>

  <a href="#StrategoLang-PreTerm_2097_2117" id="StrategoLang-PreTerm_686_706" title="Referenced at line 45">StrategoLang-PreTerm</a>.<span class="cons_Constructor"><span id="Char_707_711" title="Not referenced locally, nor via imports">Char</span></span> = <a href="../constants-namespaced.sdf3#StrategoLang-Char_240_257" id="StrategoLang-Char_714_731" title="Defined at ../constants-namespaced.sdf3 line 12">StrategoLang-Char</a> { }
  <a href="#StrategoLang-PreTerm_2097_2117" id="StrategoLang-PreTerm_738_758" title="Referenced at line 45">StrategoLang-PreTerm</a>.<span class="cons_Constructor"><a href="#AppPT_1992_1997" id="AppPT_759_764" title="Referenced at line 43">AppPT</a></span> = [<span class="cons_String">&lt;</span>[<a href="../strategies-namespaced.sdf3#StrategoLang-Strategy_1078_1099" id="StrategoLang-Strategy_770_791" title="Defined at ../strategies-namespaced.sdf3 line 38, 41, 42, 43, 44, 45, 46, 47, 49, 50, 51, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 72, 73, 74, 75, 76, 77, 78, 79, 80, 86, 89">StrategoLang-Strategy</a>]<span class="cons_String">&gt;</span> [<a href="#StrategoLang-Term_315_332" id="StrategoLang-Term_795_812" title="Defined at line 15, 16, 17, 18, 19, 33">StrategoLang-Term</a>]] { }
  <a href="#StrategoLang-PreTerm_2097_2117" id="StrategoLang-PreTerm_821_841" title="Referenced at line 45">StrategoLang-PreTerm</a>.<span class="cons_Constructor"><a href="#RootAppPT_1620_1629" id="RootAppPT_842_851" title="Referenced at line 37">RootAppPT</a></span> = [<span class="cons_String">&lt;</span>[<a href="../strategies-namespaced.sdf3#StrategoLang-Strategy_1078_1099" id="StrategoLang-Strategy_857_878" title="Defined at ../strategies-namespaced.sdf3 line 38, 41, 42, 43, 44, 45, 46, 47, 49, 50, 51, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 72, 73, 74, 75, 76, 77, 78, 79, 80, 86, 89">StrategoLang-Strategy</a>]<span class="cons_String">&gt;</span>] { }
  <a href="#StrategoLang-PreTerm_2097_2117" id="StrategoLang-PreTerm_888_908" title="Referenced at line 45">StrategoLang-PreTerm</a>.<span class="cons_Constructor"><span id="Tuple_909_914" title="Not referenced locally, nor via imports">Tuple</span></span> = &lt;<span class="cons_String">(</span>&lt;{<a href="#StrategoLang-Term_315_332" id="StrategoLang-Term_921_938" title="Defined at line 15, 16, 17, 18, 19, 33">StrategoLang-Term</a> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">)</span>&gt; { }
  <a href="#StrategoLang-PreTerm_2097_2117" id="StrategoLang-PreTerm_955_975" title="Referenced at line 45">StrategoLang-PreTerm</a>.<span class="cons_Constructor"><span id="List_976_980" title="Not referenced locally, nor via imports">List</span></span> = &lt;<span class="cons_String">[</span>&lt;{<a href="#StrategoLang-Term_315_332" id="StrategoLang-Term_987_1004" title="Defined at line 15, 16, 17, 18, 19, 33">StrategoLang-Term</a> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">]</span>&gt; { }
  <a href="#StrategoLang-PreTerm_2097_2117" id="StrategoLang-PreTerm_1021_1041" title="Referenced at line 45">StrategoLang-PreTerm</a>.<span class="cons_Constructor"><span id="ListTail_1042_1050" title="Not referenced locally, nor via imports">ListTail</span></span> = &lt;<span class="cons_String">[</span>&lt;{<a href="#StrategoLang-Term_315_332" id="StrategoLang-Term_1057_1074" title="Defined at line 15, 16, 17, 18, 19, 33">StrategoLang-Term</a> <span class="cons_Lit">", "</span>}+&gt; <span class="cons_String">|</span> &lt;<a href="#StrategoLang-Term_315_332" id="StrategoLang-Term_1086_1103" title="Defined at line 15, 16, 17, 18, 19, 33">StrategoLang-Term</a>&gt;<span class="cons_String">]</span>&gt; { }
  <a href="#StrategoLang-PreTerm_2097_2117" id="StrategoLang-PreTerm_1113_1133" title="Referenced at line 45">StrategoLang-PreTerm</a>.<span class="cons_Constructor"><a href="#BuildDefaultPT_2118_2132" id="BuildDefaultPT_1134_1148" title="Referenced at line 45">BuildDefaultPT</a></span> = &lt;<span class="cons_String">_</span>&lt;<a href="#StrategoLang-PreTerm_686_706" id="StrategoLang-PreTerm_1154_1174" title="Defined at line 23, 24, 25, 26, 27, 28, 29, 33, 34">StrategoLang-PreTerm</a>&gt;&gt; { }

<span class="keyword">context-free priorities</span>

  <a href="#StrategoLang-Term_2032_2049" id="StrategoLang-Term_1209_1226" title="Referenced at line 44">StrategoLang-Term</a>.<span class="cons_Constructor"><a href="#NoAnnoList_1449_1459" id="NoAnnoList_1227_1237" title="Referenced at line 35">NoAnnoList</a></span> = <a href="#StrategoLang-PreTerm_686_706" id="StrategoLang-PreTerm_1240_1260" title="Defined at line 23, 24, 25, 26, 27, 28, 29, 33, 34">StrategoLang-PreTerm</a> { } &lt;0&gt;. &gt; {<a href="#StrategoLang-PreTerm_2097_2117" id="StrategoLang-PreTerm_1273_1293" title="Referenced at line 45">StrategoLang-PreTerm</a> = <a href="../../core/terms-namespaced.sdf3#StrategoLang-Var_159_175" id="StrategoLang-Var_1296_1312" title="Defined at ../../core/terms-namespaced.sdf3 line 7, 11">StrategoLang-Var</a> { }
                                                                  <a href="#StrategoLang-PreTerm_2097_2117" id="StrategoLang-PreTerm_1383_1403" title="Referenced at line 45">StrategoLang-PreTerm</a> = <a href="../../core/terms-namespaced.sdf3#StrategoLang-Wld_176_192" id="StrategoLang-Wld_1406_1422" title="Defined at ../../core/terms-namespaced.sdf3 line 7, 13">StrategoLang-Wld</a> { }},
  <a href="#StrategoLang-Term_315_332" id="StrategoLang-Term_1431_1448" title="Defined at line 15, 16, 17, 18, 19, 33">StrategoLang-Term</a>.<span class="cons_Constructor"><a href="#NoAnnoList_484_494" id="NoAnnoList_1449_1459" title="Defined at line 17, 33">NoAnnoList</a></span> &lt;0&gt;. &gt; {<a href="#StrategoLang-PreTerm_686_706" id="StrategoLang-PreTerm_1468_1488" title="Defined at line 23, 24, 25, 26, 27, 28, 29, 33, 34">StrategoLang-PreTerm</a>.<span class="cons_Constructor"><a href="../../core/terms-namespaced.sdf3#AsPT_1185_1189" id="AsPT_1489_1493" title="Defined at ../../core/terms-namespaced.sdf3 line 36">AsPT</a></span>
                                       <a href="#StrategoLang-PreTerm_686_706" id="StrategoLang-PreTerm_1533_1553" title="Defined at line 23, 24, 25, 26, 27, 28, 29, 33, 34">StrategoLang-PreTerm</a>.<span class="cons_Constructor"><a href="#AppPT_759_764" id="AppPT_1554_1559" title="Defined at line 24">AppPT</a></span>
                                       <a href="#StrategoLang-PreTerm_686_706" id="StrategoLang-PreTerm_1599_1619" title="Defined at line 23, 24, 25, 26, 27, 28, 29, 33, 34">StrategoLang-PreTerm</a>.<span class="cons_Constructor"><a href="#RootAppPT_842_851" id="RootAppPT_1620_1629" title="Defined at line 25">RootAppPT</a></span>
                                       <a href="#StrategoLang-PreTerm_686_706" id="StrategoLang-PreTerm_1669_1689" title="Defined at line 23, 24, 25, 26, 27, 28, 29, 33, 34">StrategoLang-PreTerm</a>.<span class="cons_Constructor"><a href="#BuildDefaultPT_1134_1148" id="BuildDefaultPT_1690_1704" title="Defined at line 29">BuildDefaultPT</a></span>},
  <a href="#StrategoLang-Term_315_332" id="StrategoLang-Term_1709_1726" title="Defined at line 15, 16, 17, 18, 19, 33">StrategoLang-Term</a>.<span class="cons_Constructor"><a href="#AnnoList_395_403" id="AnnoList_1727_1735" title="Defined at line 16">AnnoList</a></span> &gt; {<a href="#StrategoLang-PreTerm_686_706" id="StrategoLang-PreTerm_1739_1759" title="Defined at line 23, 24, 25, 26, 27, 28, 29, 33, 34">StrategoLang-PreTerm</a>.<span class="cons_Constructor"><a href="../../core/terms-namespaced.sdf3#AsPT_1185_1189" id="AsPT_1760_1764" title="Defined at ../../core/terms-namespaced.sdf3 line 36">AsPT</a></span>
                                <a href="#StrategoLang-PreTerm_686_706" id="StrategoLang-PreTerm_1797_1817" title="Defined at line 23, 24, 25, 26, 27, 28, 29, 33, 34">StrategoLang-PreTerm</a>.<span class="cons_Constructor"><a href="#AppPT_759_764" id="AppPT_1818_1823" title="Defined at line 24">AppPT</a></span>},
  <a href="#StrategoLang-Term_315_332" id="StrategoLang-Term_1828_1845" title="Defined at line 15, 16, 17, 18, 19, 33">StrategoLang-Term</a>.<span class="cons_Constructor"><a href="../../core/terms-namespaced.sdf3#Anno_486_490" id="Anno_1846_1850" title="Defined at ../../core/terms-namespaced.sdf3 line 21">Anno</a></span> &gt; <a href="#StrategoLang-PreTerm_686_706" id="StrategoLang-PreTerm_1853_1873" title="Defined at line 23, 24, 25, 26, 27, 28, 29, 33, 34">StrategoLang-PreTerm</a>.<span class="cons_Constructor"><a href="#AppPT_759_764" id="AppPT_1874_1879" title="Defined at line 24">AppPT</a></span>,
  <a href="#StrategoLang-PreTerm_686_706" id="StrategoLang-PreTerm_1883_1903" title="Defined at line 23, 24, 25, 26, 27, 28, 29, 33, 34">StrategoLang-PreTerm</a>.<span class="cons_Constructor"><a href="../../core/terms-namespaced.sdf3#Explode_1104_1111" id="Explode_1904_1911" title="Defined at ../../core/terms-namespaced.sdf3 line 35">Explode</a></span> &gt; {<a href="#StrategoLang-Term_315_332" id="StrategoLang-Term_1915_1932" title="Defined at line 15, 16, 17, 18, 19, 33">StrategoLang-Term</a>.<span class="cons_Constructor"><a href="#App_542_545" id="App_1933_1936" title="Defined at line 18">App</a></span>
                                  <a href="#StrategoLang-PreTerm_686_706" id="StrategoLang-PreTerm_1971_1991" title="Defined at line 23, 24, 25, 26, 27, 28, 29, 33, 34">StrategoLang-PreTerm</a>.<span class="cons_Constructor"><a href="#AppPT_759_764" id="AppPT_1992_1997" title="Defined at line 24">AppPT</a></span>
                                  <a href="#StrategoLang-Term_315_332" id="StrategoLang-Term_2032_2049" title="Defined at line 15, 16, 17, 18, 19, 33">StrategoLang-Term</a>.<span class="cons_Constructor"><a href="#BuildDefault_333_345" id="BuildDefault_2050_2062" title="Defined at line 15">BuildDefault</a></span>
                                  <a href="#StrategoLang-PreTerm_686_706" id="StrategoLang-PreTerm_2097_2117" title="Defined at line 23, 24, 25, 26, 27, 28, 29, 33, 34">StrategoLang-PreTerm</a>.<span class="cons_Constructor"><a href="#BuildDefaultPT_1134_1148" id="BuildDefaultPT_2118_2132" title="Defined at line 29">BuildDefaultPT</a></span>}

</code></pre></td></tr></tbody></table></div>