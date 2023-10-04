---
title: signatures-namespaced.sdf3
hide:
  - toc
---

# `signatures-namespaced.sdf3`



[pdmosses/stratego/stratego.lang/src-gen/syntax/StrategoLang/core/signatures-namespaced.sdf3]: https://github.com/pdmosses/stratego/blob/master/stratego.lang/src-gen/syntax/StrategoLang/core/signatures-namespaced.sdf3 "The source file on GitHub"

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
46
47
48
49
50
51
52
53
54
55
56
57
58
59
60
61
62
63
64
65
66
67
68
69
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <a href="../../sugar/signatures-namespaced.sdf3#StrategoLang/core/signatures-namespaced_59_98" id="StrategoLang/core/signatures-namespaced_7_46" title="Referenced at ../../sugar/signatures-namespaced.sdf3 line 4">StrategoLang/core/signatures-namespaced</a>

<span class="keyword">imports</span>
  <a href="../identifiers-namespaced.sdf3#StrategoLang/core/identifiers-namespaced_7_47" id="StrategoLang/core/identifiers-namespaced_58_98" title="Defined at ../identifiers-namespaced.sdf3 line 1">StrategoLang/core/identifiers-namespaced</a>        
  <a href="../constants-namespaced.sdf3#StrategoLang/core/constants-namespaced_7_45" id="StrategoLang/core/constants-namespaced_102_140" title="Defined at ../constants-namespaced.sdf3 line 1">StrategoLang/core/constants-namespaced</a>

<span class="keyword">sorts</span> <a href="#StrategoLang-Kind_815_832" id="StrategoLang-Kind_148_165" title="Referenced at line 21; ../../deduplicated-namespaced.sdf3 line 25">StrategoLang-Kind</a>

<span class="keyword">context-free syntax</span>

  <a href="#StrategoLang-Kind_815_832" id="StrategoLang-Kind_190_207" title="Referenced at line 21; ../../deduplicated-namespaced.sdf3 line 25">StrategoLang-Kind</a>.<span class="cons_Constructor"><span id="Star_208_212" title="Not referenced locally, nor via imports">Star</span></span> = &lt;<span class="cons_String">*</span>&gt; { }

<span class="keyword">sorts</span> <a href="#StrategoLang-SortDef_932_952" id="StrategoLang-SortDef_230_250" title="Referenced at line 27">StrategoLang-SortDef</a>

<span class="keyword">context-free syntax</span>

  <a href="#StrategoLang-SortDef_932_952" id="StrategoLang-SortDef_275_295" title="Referenced at line 27">StrategoLang-SortDef</a>.<span class="cons_Constructor"><span id="SortDefVar_296_306" title="Not referenced locally, nor via imports">SortDefVar</span></span> = <a href="../identifiers-namespaced.sdf3#StrategoLang-LCID_790_807" id="StrategoLang-LCID_309_326" title="Defined at ../identifiers-namespaced.sdf3 line 30, 53">StrategoLang-LCID</a> {<span class="keyword">deprecated</span>("This syntax never had a clear meaning should not be used")}
  <a href="#StrategoLang-SortDef_932_952" id="StrategoLang-SortDef_402_422" title="Referenced at line 27">StrategoLang-SortDef</a>.<span class="cons_Constructor"><span id="SortDefNoArgs_423_436" title="Not referenced locally, nor via imports">SortDefNoArgs</span></span> = <a href="../identifiers-namespaced.sdf3#StrategoLang-UCID_841_858" id="StrategoLang-UCID_439_456" title="Defined at ../identifiers-namespaced.sdf3 line 31, 54">StrategoLang-UCID</a> { }
  <a href="#StrategoLang-SortDef_932_952" id="StrategoLang-SortDef_463_483" title="Referenced at line 27">StrategoLang-SortDef</a>.<span class="cons_Constructor"><span id="SortDef_484_491" title="Not referenced locally, nor via imports">SortDef</span></span> = [[<a href="../identifiers-namespaced.sdf3#StrategoLang-UCID_841_858" id="StrategoLang-UCID_496_513" title="Defined at ../identifiers-namespaced.sdf3 line 31, 54">StrategoLang-UCID</a>]<span class="cons_String">(</span>[{<a href="#StrategoLang-Kind_148_165" id="StrategoLang-Kind_517_534" title="Defined at line 7, 11">StrategoLang-Kind</a> <span class="cons_Lit">", "</span>}*]<span class="cons_String">)</span>] { }
  <a href="#StrategoLang-SortDef_932_952" id="StrategoLang-SortDef_551_571" title="Referenced at line 27">StrategoLang-SortDef</a>.<span class="cons_Constructor"><span id="SortDefDepr_572_583" title="Not referenced locally, nor via imports">SortDefDepr</span></span> = &lt;&lt;<a href="../identifiers-namespaced.sdf3#StrategoLang-Id_645_660" id="StrategoLang-Id_588_603" title="Defined at ../identifiers-namespaced.sdf3 line 27, 29, 49, 50, 51">StrategoLang-Id</a>&gt;<span class="cons_String">(</span>&lt;{<a href="#StrategoLang-Sort_1053_1070" id="StrategoLang-Sort_607_624" title="Defined at line 32, 36, 37, 38">StrategoLang-Sort</a> <span class="cons_Lit">", "</span>}+&gt;<span class="cons_String">)</span>&gt; {<span class="keyword">deprecated</span>("This syntax never had a clear meaning should be replaced by the version that uses kinds A(*, *)")}
  <a href="#StrategoLang-SortDef_932_952" id="StrategoLang-SortDef_749_769" title="Referenced at line 27">StrategoLang-SortDef</a>.<span class="cons_Constructor"><span id="ExtSortDef_770_780" title="Not referenced locally, nor via imports">ExtSortDef</span></span> = [<span class="cons_String">external</span> [<a href="../identifiers-namespaced.sdf3#StrategoLang-UCID_841_858" id="StrategoLang-UCID_794_811" title="Defined at ../identifiers-namespaced.sdf3 line 31, 54">StrategoLang-UCID</a>]<span class="cons_String">(</span>[{<a href="#StrategoLang-Kind_148_165" id="StrategoLang-Kind_815_832" title="Defined at line 7, 11">StrategoLang-Kind</a> <span class="cons_Lit">", "</span>}*]<span class="cons_String">)</span>] { }

<span class="keyword">sorts</span> <span id="StrategoLang-Sdecl_854_872" title="Not referenced locally, nor via imports">StrategoLang-Sdecl</span>

<span class="keyword">context-free syntax</span>

  <span id="StrategoLang-Sdecl_897_915" title="Not referenced locally, nor via imports">StrategoLang-Sdecl</span>.<span class="cons_Constructor"><span id="Sorts_916_921" title="Not referenced locally, nor via imports">Sorts</span></span> = &lt;<span class="cons_String">sorts</span> &lt;<a href="#StrategoLang-SortDef_230_250" id="StrategoLang-SortDef_932_952" title="Defined at line 13, 17, 18, 19, 20, 21">StrategoLang-SortDef</a>*&gt;&gt; { }
  <span id="StrategoLang-Sdecl_962_980" title="Not referenced locally, nor via imports">StrategoLang-Sdecl</span>.<span class="cons_Constructor"><span id="Constructors_981_993" title="Not referenced locally, nor via imports">Constructors</span></span> = &lt;<span class="cons_String">constructors</span>

&lt;{<a href="#StrategoLang-Opdecl_1358_1377" id="StrategoLang-Opdecl_1013_1032" title="Defined at line 41, 45, 46, 47, 48, 49, 50">StrategoLang-Opdecl</a> <span class="cons_Lit">"\n"</span>}*&gt;&gt; { }

<span class="keyword">sorts</span> <a href="#StrategoLang-Sort_2718_2735" id="StrategoLang-Sort_1053_1070" title="Referenced at line 69; ../../deduplicated-namespaced.sdf3 line 63; ../../gradual-types/signatures-namespaced.sdf3 line 25">StrategoLang-Sort</a> <a href="#StrategoLang-SortArg_1269_1289" id="StrategoLang-SortArg_1071_1091" title="Referenced at line 38">StrategoLang-SortArg</a>

<span class="keyword">context-free syntax</span>

  <a href="#StrategoLang-Sort_2718_2735" id="StrategoLang-Sort_1116_1133" title="Referenced at line 69; ../../deduplicated-namespaced.sdf3 line 63; ../../gradual-types/signatures-namespaced.sdf3 line 25">StrategoLang-Sort</a>.<span class="cons_Constructor"><span id="SortVar_1134_1141" title="Not referenced locally, nor via imports">SortVar</span></span> = <a href="../identifiers-namespaced.sdf3#StrategoLang-LCID_790_807" id="StrategoLang-LCID_1144_1161" title="Defined at ../identifiers-namespaced.sdf3 line 30, 53">StrategoLang-LCID</a> { }
  <a href="#StrategoLang-Sort_2718_2735" id="StrategoLang-Sort_1168_1185" title="Referenced at line 69; ../../deduplicated-namespaced.sdf3 line 63; ../../gradual-types/signatures-namespaced.sdf3 line 25">StrategoLang-Sort</a>.<span class="cons_Constructor"><span id="SortNoArgs_1186_1196" title="Not referenced locally, nor via imports">SortNoArgs</span></span> = <a href="../identifiers-namespaced.sdf3#StrategoLang-UCID_841_858" id="StrategoLang-UCID_1199_1216" title="Defined at ../identifiers-namespaced.sdf3 line 31, 54">StrategoLang-UCID</a> { }
  <a href="#StrategoLang-Sort_2718_2735" id="StrategoLang-Sort_1223_1240" title="Referenced at line 69; ../../deduplicated-namespaced.sdf3 line 63; ../../gradual-types/signatures-namespaced.sdf3 line 25">StrategoLang-Sort</a>.<span class="cons_Constructor"><span id="Sort_1241_1245" title="Not referenced locally, nor via imports">Sort</span></span> = &lt;&lt;<a href="../identifiers-namespaced.sdf3#StrategoLang-Id_645_660" id="StrategoLang-Id_1250_1265" title="Defined at ../identifiers-namespaced.sdf3 line 27, 29, 49, 50, 51">StrategoLang-Id</a>&gt;<span class="cons_String">(</span>&lt;{<a href="#StrategoLang-SortArg_1071_1091" id="StrategoLang-SortArg_1269_1289" title="Defined at line 32, 39">StrategoLang-SortArg</a> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">)</span>&gt; { }
  <a href="#StrategoLang-SortArg_1269_1289" id="StrategoLang-SortArg_1306_1326" title="Referenced at line 38">StrategoLang-SortArg</a> = <a href="#StrategoLang-Sort_1053_1070" id="StrategoLang-Sort_1329_1346" title="Defined at line 32, 36, 37, 38">StrategoLang-Sort</a> { }

<span class="keyword">sorts</span> <a href="#StrategoLang-Opdecl_1013_1032" id="StrategoLang-Opdecl_1358_1377" title="Referenced at line 30">StrategoLang-Opdecl</a>

<span class="keyword">context-free syntax</span>

  <a href="#StrategoLang-Opdecl_1013_1032" id="StrategoLang-Opdecl_1402_1421" title="Referenced at line 30">StrategoLang-Opdecl</a>.<span class="cons_Constructor"><span id="OpDecl_1422_1428" title="Not referenced locally, nor via imports">OpDecl</span></span> = &lt;&lt;<a href="../identifiers-namespaced.sdf3#StrategoLang-Id_645_660" id="StrategoLang-Id_1433_1448" title="Defined at ../identifiers-namespaced.sdf3 line 27, 29, 49, 50, 51">StrategoLang-Id</a>&gt; <span class="cons_String">:</span> &lt;<a href="#StrategoLang-OpType_2007_2026" id="StrategoLang-OpType_1453_1472" title="Defined at line 52, 64, 65">StrategoLang-OpType</a>&gt;&gt; { }
  <a href="#StrategoLang-Opdecl_1013_1032" id="StrategoLang-Opdecl_1481_1500" title="Referenced at line 30">StrategoLang-Opdecl</a>.<span class="cons_Constructor"><span id="OpDeclQ_1501_1508" title="Not referenced locally, nor via imports">OpDeclQ</span></span> = &lt;&lt;<a href="../constants-namespaced.sdf3#StrategoLang-String_202_221" id="StrategoLang-String_1513_1532" title="Defined at ../constants-namespaced.sdf3 line 10">StrategoLang-String</a>&gt; <span class="cons_String">:</span> &lt;<a href="#StrategoLang-OpType_2007_2026" id="StrategoLang-OpType_1537_1556" title="Defined at line 52, 64, 65">StrategoLang-OpType</a>&gt;&gt; { }
  <a href="#StrategoLang-Opdecl_1013_1032" id="StrategoLang-Opdecl_1565_1584" title="Referenced at line 30">StrategoLang-Opdecl</a>.<span class="cons_Constructor"><span id="OpDeclInj_1585_1594" title="Not referenced locally, nor via imports">OpDeclInj</span></span> = &lt;<span class="cons_String">:</span> &lt;<a href="#StrategoLang-OpType_2007_2026" id="StrategoLang-OpType_1601_1620" title="Defined at line 52, 64, 65">StrategoLang-OpType</a>&gt;&gt; { }
  <a href="#StrategoLang-Opdecl_1013_1032" id="StrategoLang-Opdecl_1629_1648" title="Referenced at line 30">StrategoLang-Opdecl</a>.<span class="cons_Constructor"><span id="ExtOpDecl_1649_1658" title="Not referenced locally, nor via imports">ExtOpDecl</span></span> = &lt;<span class="cons_String">external</span> &lt;<a href="../identifiers-namespaced.sdf3#StrategoLang-Id_645_660" id="StrategoLang-Id_1672_1687" title="Defined at ../identifiers-namespaced.sdf3 line 27, 29, 49, 50, 51">StrategoLang-Id</a>&gt; <span class="cons_String">:</span> &lt;<a href="#StrategoLang-OpType_2007_2026" id="StrategoLang-OpType_1692_1711" title="Defined at line 52, 64, 65">StrategoLang-OpType</a>&gt;&gt; { }
  <a href="#StrategoLang-Opdecl_1013_1032" id="StrategoLang-Opdecl_1720_1739" title="Referenced at line 30">StrategoLang-Opdecl</a>.<span class="cons_Constructor"><span id="ExtOpDeclQ_1740_1750" title="Not referenced locally, nor via imports">ExtOpDeclQ</span></span> = &lt;<span class="cons_String">external</span> &lt;<a href="../constants-namespaced.sdf3#StrategoLang-String_202_221" id="StrategoLang-String_1764_1783" title="Defined at ../constants-namespaced.sdf3 line 10">StrategoLang-String</a>&gt; <span class="cons_String">:</span> &lt;<a href="#StrategoLang-OpType_2007_2026" id="StrategoLang-OpType_1788_1807" title="Defined at line 52, 64, 65">StrategoLang-OpType</a>&gt;&gt; { }
  <a href="#StrategoLang-Opdecl_1013_1032" id="StrategoLang-Opdecl_1816_1835" title="Referenced at line 30">StrategoLang-Opdecl</a>.<span class="cons_Constructor"><span id="ExtOpDeclInj_1836_1848" title="Not referenced locally, nor via imports">ExtOpDeclInj</span></span> = &lt;<span class="cons_String">external</span> <span class="cons_String">:</span> &lt;<a href="#StrategoLang-OpType_2007_2026" id="StrategoLang-OpType_1864_1883" title="Defined at line 52, 64, 65">StrategoLang-OpType</a>&gt;&gt; { }

<span class="keyword">sorts</span> <a href="#StrategoLang-OldType_2353_2373" id="StrategoLang-OldType_1897_1917" title="Referenced at line 60; ../strategies-namespaced.sdf3 line 52">StrategoLang-OldType</a> <a href="#StrategoLang-OldArgType_2144_2167" id="StrategoLang-OldArgType_1918_1941" title="Referenced at line 57">StrategoLang-OldArgType</a> <a href="#StrategoLang-ConstType_2659_2681" id="StrategoLang-ConstType_1942_1964" title="Referenced at line 65; ../../gradual-types/overlays-namespaced.sdf3 line 12">StrategoLang-ConstType</a> <a href="#StrategoLang-FunType_2458_2478" id="StrategoLang-FunType_1965_1985" title="Referenced at line 62">StrategoLang-FunType</a> <a href="#StrategoLang-RetType_2181_2201" id="StrategoLang-RetType_1986_2006" title="Referenced at line 57">StrategoLang-RetType</a> <a href="#StrategoLang-OpType_1864_1883" id="StrategoLang-OpType_2007_2026" title="Referenced at line 50">StrategoLang-OpType</a>

<span class="keyword">context-free syntax</span>

  <a href="#StrategoLang-ConstType_2659_2681" id="StrategoLang-ConstType_2051_2073" title="Referenced at line 65; ../../gradual-types/overlays-namespaced.sdf3 line 12">StrategoLang-ConstType</a>.<span class="cons_Constructor"><span id="ConstType_2074_2083" title="Not referenced locally, nor via imports">ConstType</span></span> = <a href="#StrategoLang-Sort_1053_1070" id="StrategoLang-Sort_2086_2103" title="Defined at line 32, 36, 37, 38">StrategoLang-Sort</a> { }
  <a href="#StrategoLang-FunType_2458_2478" id="StrategoLang-FunType_2110_2130" title="Referenced at line 62">StrategoLang-FunType</a>.<span class="cons_Constructor"><span id="FunType_2131_2138" title="Not referenced locally, nor via imports">FunType</span></span> = [[{<a href="#StrategoLang-OldArgType_1918_1941" id="StrategoLang-OldArgType_2144_2167" title="Defined at line 52, 58, 59">StrategoLang-OldArgType</a> <span class="cons_Lit">" * "</span>}+] <span class="cons_String">-&gt;</span> [<a href="#StrategoLang-RetType_1986_2006" id="StrategoLang-RetType_2181_2201" title="Defined at line 52, 60, 61">StrategoLang-RetType</a>]] { }
  <a href="#StrategoLang-OldArgType_2144_2167" id="StrategoLang-OldArgType_2210_2233" title="Referenced at line 57">StrategoLang-OldArgType</a> = &lt;<span class="cons_String">(</span>&lt;<a href="#StrategoLang-OldType_1897_1917" id="StrategoLang-OldType_2239_2259" title="Defined at line 52, 62, 63">StrategoLang-OldType</a>&gt;<span class="cons_String">)</span>&gt; {<span class="keyword">bracket</span>}
  <a href="#StrategoLang-OldArgType_2144_2167" id="StrategoLang-OldArgType_2275_2298" title="Referenced at line 57">StrategoLang-OldArgType</a> = <a href="#StrategoLang-ConstType_1942_1964" id="StrategoLang-ConstType_2301_2323" title="Defined at line 52, 56">StrategoLang-ConstType</a> { }
  <a href="#StrategoLang-RetType_2181_2201" id="StrategoLang-RetType_2330_2350" title="Referenced at line 57">StrategoLang-RetType</a> = <a href="#StrategoLang-OldType_1897_1917" id="StrategoLang-OldType_2353_2373" title="Defined at line 52, 62, 63">StrategoLang-OldType</a> { }
  <a href="#StrategoLang-RetType_2181_2201" id="StrategoLang-RetType_2380_2400" title="Referenced at line 57">StrategoLang-RetType</a> = <a href="#StrategoLang-FunType_1965_1985" id="StrategoLang-FunType_2403_2423" title="Defined at line 52, 57">StrategoLang-FunType</a> {<span class="keyword">reject</span>}
  <a href="#StrategoLang-OldType_2353_2373" id="StrategoLang-OldType_2435_2455" title="Referenced at line 60; ../strategies-namespaced.sdf3 line 52">StrategoLang-OldType</a> = <a href="#StrategoLang-FunType_1965_1985" id="StrategoLang-FunType_2458_2478" title="Defined at line 52, 57">StrategoLang-FunType</a> { }
  <a href="#StrategoLang-OldType_2353_2373" id="StrategoLang-OldType_2485_2505" title="Referenced at line 60; ../strategies-namespaced.sdf3 line 52">StrategoLang-OldType</a> = <a href="#StrategoLang-ConstType_1942_1964" id="StrategoLang-ConstType_2508_2530" title="Defined at line 52, 56">StrategoLang-ConstType</a> { }
  <a href="#StrategoLang-OpType_1864_1883" id="StrategoLang-OpType_2537_2556" title="Referenced at line 50">StrategoLang-OpType</a> = <a href="#StrategoLang-ConstType_1942_1964" id="StrategoLang-ConstType_2559_2581" title="Defined at line 52, 56">StrategoLang-ConstType</a> { }
  <a href="#StrategoLang-OpType_1864_1883" id="StrategoLang-OpType_2588_2607" title="Referenced at line 50">StrategoLang-OpType</a>.<span class="cons_Constructor"><span id="OpFunType_2608_2617" title="Not referenced locally, nor via imports">OpFunType</span></span> = [[{<a href="#StrategoLang-ConstType_1942_1964" id="StrategoLang-ConstType_2623_2645" title="Defined at line 52, 56">StrategoLang-ConstType</a> <span class="cons_Lit">" * "</span>}+] <span class="cons_String">-&gt;</span> [<a href="#StrategoLang-ConstType_1942_1964" id="StrategoLang-ConstType_2659_2681" title="Defined at line 52, 56">StrategoLang-ConstType</a>]] { }

<span class="keyword">context-free restrictions</span>

  <a href="#StrategoLang-Sort_1053_1070" id="StrategoLang-Sort_2718_2735" title="Defined at line 32, 36, 37, 38">StrategoLang-Sort</a> -/- [\(]

</code></pre></td></tr></tbody></table></div>