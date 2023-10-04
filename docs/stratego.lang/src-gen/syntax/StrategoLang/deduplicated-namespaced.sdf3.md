---
title: deduplicated-namespaced.sdf3
hide:
  - toc
---

# `deduplicated-namespaced.sdf3`



[pdmosses/stratego/stratego.lang/src-gen/syntax/StrategoLang/deduplicated-namespaced.sdf3]: https://github.com/pdmosses/stratego/blob/master/stratego.lang/src-gen/syntax/StrategoLang/deduplicated-namespaced.sdf3 "The source file on GitHub"

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
70
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <span id="StrategoLang/deduplicated-namespaced_7_43" title="Not referenced locally, nor via imports">StrategoLang/deduplicated-namespaced</span>

<span class="keyword">imports</span>
  <a href="../core/terms-namespaced.sdf3#StrategoLang/core/terms-namespaced_7_41" id="StrategoLang/core/terms-namespaced_55_89" title="Defined at ../core/terms-namespaced.sdf3 line 1">StrategoLang/core/terms-namespaced</a>        
  <a href="../core/signatures-namespaced.sdf3#StrategoLang/core/signatures-namespaced_7_46" id="StrategoLang/core/signatures-namespaced_93_132" title="Defined at ../core/signatures-namespaced.sdf3 line 1">StrategoLang/core/signatures-namespaced</a>        
  <a href="../core/identifiers-namespaced.sdf3#StrategoLang/core/identifiers-namespaced_7_47" id="StrategoLang/core/identifiers-namespaced_136_176" title="Defined at ../core/identifiers-namespaced.sdf3 line 1">StrategoLang/core/identifiers-namespaced</a>        
  <a href="../sugar/terms-namespaced.sdf3#StrategoLang/sugar/terms-namespaced_7_42" id="StrategoLang/sugar/terms-namespaced_180_215" title="Defined at ../sugar/terms-namespaced.sdf3 line 1">StrategoLang/sugar/terms-namespaced</a>        
  <a href="../sugar/rules-namespaced.sdf3#StrategoLang/sugar/rules-namespaced_7_42" id="StrategoLang/sugar/rules-namespaced_219_254" title="Defined at ../sugar/rules-namespaced.sdf3 line 1">StrategoLang/sugar/rules-namespaced</a>        
  <a href="../core/strategies-namespaced.sdf3#StrategoLang/core/strategies-namespaced_7_46" id="StrategoLang/core/strategies-namespaced_258_297" title="Defined at ../core/strategies-namespaced.sdf3 line 1">StrategoLang/core/strategies-namespaced</a>        
  <a href="../sugar/dynamic-rules-namespaced.sdf3#StrategoLang/sugar/dynamic-rules-namespaced_7_50" id="StrategoLang/sugar/dynamic-rules-namespaced_301_344" title="Defined at ../sugar/dynamic-rules-namespaced.sdf3 line 1">StrategoLang/sugar/dynamic-rules-namespaced</a>        
  <a href="../sugar/string-quotations-namespaced.sdf3#StrategoLang/sugar/string-quotations-namespaced_7_54" id="StrategoLang/sugar/string-quotations-namespaced_348_395" title="Defined at ../sugar/string-quotations-namespaced.sdf3 line 1">StrategoLang/sugar/string-quotations-namespaced</a>        
  <a href="../gradual-types/signatures-namespaced.sdf3#StrategoLang/gradual-types/signatures-namespaced_7_55" id="StrategoLang/gradual-types/signatures-namespaced_399_447" title="Defined at ../gradual-types/signatures-namespaced.sdf3 line 1">StrategoLang/gradual-types/signatures-namespaced</a>        
  <a href="../gradual-types/strategies-namespaced.sdf3#StrategoLang/gradual-types/strategies-namespaced_7_55" id="StrategoLang/gradual-types/strategies-namespaced_451_499" title="Defined at ../gradual-types/strategies-namespaced.sdf3 line 1">StrategoLang/gradual-types/strategies-namespaced</a>

<span class="keyword">context-free syntax</span>

  <a href="#StrategoLang-PreTerm_571_591" id="StrategoLang-PreTerm_524_544" title="Referenced at line 17">StrategoLang-PreTerm</a>.<span class="cons_Constructor"><span id="As_545_547" title="Not referenced locally, nor via imports">As</span></span> = &lt;&lt;<a href="../core/terms-namespaced.sdf3#StrategoLang-Var_159_175" id="StrategoLang-Var_552_568" title="Defined at ../core/terms-namespaced.sdf3 line 7, 11">StrategoLang-Var</a>&gt;<span class="cons_String">@</span>&lt;<a href="#StrategoLang-PreTerm_524_544" id="StrategoLang-PreTerm_571_591" title="Defined at line 17, 30, 31">StrategoLang-PreTerm</a>&gt;&gt; { }

<span class="keyword">context-free syntax</span>

  <span id="StrategoLang-SortDef_622_642" title="Not referenced locally, nor via imports">StrategoLang-SortDef</span>.<span class="cons_Constructor"><span id="SortVar_643_650" title="Not referenced locally, nor via imports">SortVar</span></span> = <a href="../core/identifiers-namespaced.sdf3#StrategoLang-LCID_790_807" id="StrategoLang-LCID_653_670" title="Defined at ../core/identifiers-namespaced.sdf3 line 30, 53">StrategoLang-LCID</a> {<span class="keyword">deprecated</span>("This syntax never had a clear meaning should not be used")}
  <span id="StrategoLang-SortDef_746_766" title="Not referenced locally, nor via imports">StrategoLang-SortDef</span>.<span class="cons_Constructor"><span id="SortNoArgs_767_777" title="Not referenced locally, nor via imports">SortNoArgs</span></span> = <a href="../core/identifiers-namespaced.sdf3#StrategoLang-UCID_841_858" id="StrategoLang-UCID_780_797" title="Defined at ../core/identifiers-namespaced.sdf3 line 31, 54">StrategoLang-UCID</a> { }
  <span id="StrategoLang-SortDef_804_824" title="Not referenced locally, nor via imports">StrategoLang-SortDef</span>.<span class="cons_Constructor"><span id="Sort_825_829" title="Not referenced locally, nor via imports">Sort</span></span> = [[<a href="../core/identifiers-namespaced.sdf3#StrategoLang-UCID_841_858" id="StrategoLang-UCID_834_851" title="Defined at ../core/identifiers-namespaced.sdf3 line 31, 54">StrategoLang-UCID</a>]<span class="cons_String">(</span>[{<a href="../core/signatures-namespaced.sdf3#StrategoLang-Kind_148_165" id="StrategoLang-Kind_855_872" title="Defined at ../core/signatures-namespaced.sdf3 line 7, 11">StrategoLang-Kind</a> <span class="cons_Lit">", "</span>}*]<span class="cons_String">)</span>] { }
  <span id="StrategoLang-SortDef_889_909" title="Not referenced locally, nor via imports">StrategoLang-SortDef</span>.<span class="cons_Constructor"><span id="Sort_910_914" title="Not referenced locally, nor via imports">Sort</span></span> = &lt;&lt;<a href="../core/identifiers-namespaced.sdf3#StrategoLang-Id_645_660" id="StrategoLang-Id_919_934" title="Defined at ../core/identifiers-namespaced.sdf3 line 27, 29, 49, 50, 51">StrategoLang-Id</a>&gt;<span class="cons_String">(</span>&lt;{<a href="../core/signatures-namespaced.sdf3#StrategoLang-Sort_1053_1070" id="StrategoLang-Sort_938_955" title="Defined at ../core/signatures-namespaced.sdf3 line 32, 36, 37, 38">StrategoLang-Sort</a> <span class="cons_Lit">", "</span>}+&gt;<span class="cons_String">)</span>&gt; {<span class="keyword">deprecated</span>("This syntax never had a clear meaning should be replaced by the version that uses kinds A(*, *)")}
  <span id="StrategoLang-SortDef_1080_1100" title="Not referenced locally, nor via imports">StrategoLang-SortDef</span>.<span class="cons_Constructor"><span id="ExtSort_1101_1108" title="Not referenced locally, nor via imports">ExtSort</span></span> = [<span class="cons_String">external</span> [<a href="../core/identifiers-namespaced.sdf3#StrategoLang-UCID_841_858" id="StrategoLang-UCID_1122_1139" title="Defined at ../core/identifiers-namespaced.sdf3 line 31, 54">StrategoLang-UCID</a>]<span class="cons_String">(</span>[{<a href="../core/signatures-namespaced.sdf3#StrategoLang-Kind_148_165" id="StrategoLang-Kind_1143_1160" title="Defined at ../core/signatures-namespaced.sdf3 line 7, 11">StrategoLang-Kind</a> <span class="cons_Lit">", "</span>}*]<span class="cons_String">)</span>] { }
  <span id="StrategoLang-OpType_1177_1196" title="Not referenced locally, nor via imports">StrategoLang-OpType</span>.<span class="cons_Constructor"><span id="FunType_1197_1204" title="Not referenced locally, nor via imports">FunType</span></span> = [[{<a href="#StrategoLang-ConstType_2786_2808" id="StrategoLang-ConstType_1210_1232" title="Defined at line 59">StrategoLang-ConstType</a> <span class="cons_Lit">" * "</span>}+] <span class="cons_String">-&gt;</span> [<a href="#StrategoLang-ConstType_2786_2808" id="StrategoLang-ConstType_1246_1268" title="Defined at line 59">StrategoLang-ConstType</a>]] { }

<span class="keyword">context-free syntax</span>

  <a href="#StrategoLang-PreTerm_571_591" id="StrategoLang-PreTerm_1299_1319" title="Referenced at line 17">StrategoLang-PreTerm</a>.<span class="cons_Constructor"><span id="App_1320_1323" title="Not referenced locally, nor via imports">App</span></span> = [<span class="cons_String">&lt;</span>[<a href="#StrategoLang-Strategy_1555_1576" id="StrategoLang-Strategy_1329_1350" title="Defined at line 39, 40">StrategoLang-Strategy</a>]<span class="cons_String">&gt;</span> [<a href="../core/terms-namespaced.sdf3#StrategoLang-Term_340_357" id="StrategoLang-Term_1354_1371" title="Defined at ../core/terms-namespaced.sdf3 line 15, 19, 20, 21, 22">StrategoLang-Term</a>]] { }
  <a href="#StrategoLang-PreTerm_571_591" id="StrategoLang-PreTerm_1380_1400" title="Referenced at line 17">StrategoLang-PreTerm</a>.<span class="cons_Constructor"><span id="RootApp_1401_1408" title="Not referenced locally, nor via imports">RootApp</span></span> = [<span class="cons_String">&lt;</span>[<a href="#StrategoLang-Strategy_1555_1576" id="StrategoLang-Strategy_1414_1435" title="Defined at line 39, 40">StrategoLang-Strategy</a>]<span class="cons_String">&gt;</span>] { }

<span class="keyword">context-free syntax</span>

  <span id="StrategoLang-Def_1467_1483" title="Not referenced locally, nor via imports">StrategoLang-Def</span>.<span class="cons_Constructor"><span id="AnnoDef_1484_1491" title="Not referenced locally, nor via imports">AnnoDef</span></span> = &lt;&lt;<a href="../core/strategies-namespaced.sdf3#StrategoLang-Anno_1241_1258" id="StrategoLang-Anno_1496_1513" title="Defined at ../core/strategies-namespaced.sdf3 line 40, 44, 45, 46">StrategoLang-Anno</a>+&gt; &lt;StrategoLang-RuleDef&gt;&gt; { }

<span class="keyword">syntax</span>

  <a href="#StrategoLang-Strategy_1851_1872" id="StrategoLang-Strategy_1555_1576" title="Referenced at line 40">StrategoLang-Strategy</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="DynRuleUnionFix_1580_1595" title="Not referenced locally, nor via imports">DynRuleUnionFix</span></span> = <span class="cons_Lit">"\\"</span> <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span> StrategoLang-RuleNames<span class="keyword">-CF</span> <span class="cons_Lit">" /*"</span> <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span> <a href="#StrategoLang-Strategy_1555_1576" id="StrategoLang-Strategy_1657_1678" title="Defined at line 39, 40">StrategoLang-Strategy</a><span class="keyword">-CF</span> { }
  <a href="#StrategoLang-Strategy_1851_1872" id="StrategoLang-Strategy_1688_1709" title="Referenced at line 40">StrategoLang-Strategy</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="DynRuleIntersectUnionFix_1713_1737" title="Not referenced locally, nor via imports">DynRuleIntersectUnionFix</span></span> = <span class="cons_Lit">"/"</span> <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span> StrategoLang-RuleNames<span class="keyword">-CF LAYOUT</span>?<span class="keyword">-CF</span> <span class="cons_Lit">"\\"</span> <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span> StrategoLang-RuleNames<span class="keyword">-CF</span> <span class="cons_Lit">" /*"</span> <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span> <a href="#StrategoLang-Strategy_1555_1576" id="StrategoLang-Strategy_1851_1872" title="Defined at line 39, 40">StrategoLang-Strategy</a><span class="keyword">-CF</span> { }

<span class="keyword">context-free syntax</span>

  <span id="StrategoLang-StringQuotedPart1_1904_1934" title="Not referenced locally, nor via imports">StrategoLang-StringQuotedPart1</span>.<span class="cons_Constructor"><span id="QStr_1935_1939" title="Not referenced locally, nor via imports">QStr</span></span> = StrategoLang-StringQuotedChars1 { }
  <span id="StrategoLang-StringQuotedPart2_1980_2010" title="Not referenced locally, nor via imports">StrategoLang-StringQuotedPart2</span>.<span class="cons_Constructor"><span id="QStr_2011_2015" title="Not referenced locally, nor via imports">QStr</span></span> = StrategoLang-StringQuotedChars2 { }
  <span id="StrategoLang-StringQuotedPart3_2056_2086" title="Not referenced locally, nor via imports">StrategoLang-StringQuotedPart3</span>.<span class="cons_Constructor"><span id="QStr_2087_2091" title="Not referenced locally, nor via imports">QStr</span></span> = StrategoLang-StringQuotedChars3 { }
  <span id="StrategoLang-StringQuotedPart4_2132_2162" title="Not referenced locally, nor via imports">StrategoLang-StringQuotedPart4</span>.<span class="cons_Constructor"><span id="QStr_2163_2167" title="Not referenced locally, nor via imports">QStr</span></span> = StrategoLang-StringQuotedChars4 { }
  <span id="StrategoLang-StringQuotedPart1_2208_2238" title="Not referenced locally, nor via imports">StrategoLang-StringQuotedPart1</span>.<span class="cons_Constructor"><span id="QDollar_2239_2246" title="Not referenced locally, nor via imports">QDollar</span></span> = StrategoLang-Dollar1 { }
  <span id="StrategoLang-StringQuotedPart2_2276_2306" title="Not referenced locally, nor via imports">StrategoLang-StringQuotedPart2</span>.<span class="cons_Constructor"><span id="QDollar_2307_2314" title="Not referenced locally, nor via imports">QDollar</span></span> = StrategoLang-Dollar2 { }
  <span id="StrategoLang-StringQuotedPart3_2344_2374" title="Not referenced locally, nor via imports">StrategoLang-StringQuotedPart3</span>.<span class="cons_Constructor"><span id="QDollar_2375_2382" title="Not referenced locally, nor via imports">QDollar</span></span> = StrategoLang-Dollar3 { }
  <span id="StrategoLang-StringQuotedPart4_2412_2442" title="Not referenced locally, nor via imports">StrategoLang-StringQuotedPart4</span>.<span class="cons_Constructor"><span id="QDollar_2443_2450" title="Not referenced locally, nor via imports">QDollar</span></span> = StrategoLang-Dollar4 { }
  <span id="StrategoLang-StringQuotedPart1_2480_2510" title="Not referenced locally, nor via imports">StrategoLang-StringQuotedPart1</span>.<span class="cons_Constructor"><span id="QBr_2511_2514" title="Not referenced locally, nor via imports">QBr</span></span> = StrategoLang-QuotedBracket1 { }
  <span id="StrategoLang-StringQuotedPart2_2551_2581" title="Not referenced locally, nor via imports">StrategoLang-StringQuotedPart2</span>.<span class="cons_Constructor"><span id="QBr_2582_2585" title="Not referenced locally, nor via imports">QBr</span></span> = StrategoLang-QuotedBracket2 { }
  <span id="StrategoLang-StringQuotedPart3_2622_2652" title="Not referenced locally, nor via imports">StrategoLang-StringQuotedPart3</span>.<span class="cons_Constructor"><span id="QBr_2653_2656" title="Not referenced locally, nor via imports">QBr</span></span> = StrategoLang-QuotedBracket3 { }
  <span id="StrategoLang-StringQuotedPart4_2693_2723" title="Not referenced locally, nor via imports">StrategoLang-StringQuotedPart4</span>.<span class="cons_Constructor"><span id="QBr_2724_2727" title="Not referenced locally, nor via imports">QBr</span></span> = StrategoLang-QuotedBracket4 { }

<span class="keyword">context-free syntax</span>

  <a href="#StrategoLang-ConstType_1246_1268" id="StrategoLang-ConstType_2786_2808" title="Referenced at line 26">StrategoLang-ConstType</a>.<span class="cons_Constructor"><span id="DynT_2809_2813" title="Not referenced locally, nor via imports">DynT</span></span> = StrategoLang-Dyn { }
  <span id="StrategoLang-SortT_2839_2857" title="Not referenced locally, nor via imports">StrategoLang-SortT</span>.<span class="cons_Constructor"><span id="Sort_2858_2862" title="Not referenced locally, nor via imports">Sort</span></span> = [[<a href="../core/identifiers-namespaced.sdf3#StrategoLang-Id_645_660" id="StrategoLang-Id_2867_2882" title="Defined at ../core/identifiers-namespaced.sdf3 line 27, 29, 49, 50, 51">StrategoLang-Id</a>]<span class="cons_String">(</span>[{StrategoLang-Type <span class="cons_Lit">", "</span>}*]<span class="cons_String">)</span>] { }
  <span id="StrategoLang-SortT_2920_2938" title="Not referenced locally, nor via imports">StrategoLang-SortT</span>.<span class="cons_Constructor"><span id="SortNoArgs_2939_2949" title="Not referenced locally, nor via imports">SortNoArgs</span></span> = <a href="../core/identifiers-namespaced.sdf3#StrategoLang-UCID_841_858" id="StrategoLang-UCID_2952_2969" title="Defined at ../core/identifiers-namespaced.sdf3 line 31, 54">StrategoLang-UCID</a> { }
  <span id="StrategoLang-SortT_2976_2994" title="Not referenced locally, nor via imports">StrategoLang-SortT</span>.<span class="cons_Constructor"><span id="SortVar_2995_3002" title="Not referenced locally, nor via imports">SortVar</span></span> = <a href="../core/identifiers-namespaced.sdf3#StrategoLang-SortVar_892_912" id="StrategoLang-SortVar_3005_3025" title="Defined at ../core/identifiers-namespaced.sdf3 line 32, 33">StrategoLang-SortVar</a> { }
  <span id="StrategoLang-SortArg_3032_3052" title="Not referenced locally, nor via imports">StrategoLang-SortArg</span>.<span class="cons_Constructor"><span id="TupleT_3053_3059" title="Not referenced locally, nor via imports">TupleT</span></span> = [[<a href="../core/signatures-namespaced.sdf3#StrategoLang-Sort_1053_1070" id="StrategoLang-Sort_3064_3081" title="Defined at ../core/signatures-namespaced.sdf3 line 32, 36, 37, 38">StrategoLang-Sort</a>] <span class="cons_String">*</span> [{<a href="../core/signatures-namespaced.sdf3#StrategoLang-Sort_1053_1070" id="StrategoLang-Sort_3087_3104" title="Defined at ../core/signatures-namespaced.sdf3 line 32, 36, 37, 38">StrategoLang-Sort</a> <span class="cons_Lit">" * "</span>}+]] { }
  <span id="StrategoLang-SortArg_3121_3141" title="Not referenced locally, nor via imports">StrategoLang-SortArg</span>.<span class="cons_Constructor"><span id="DynT_3142_3146" title="Not referenced locally, nor via imports">DynT</span></span> = StrategoLang-Dyn { }
  <span id="StrategoLang-SFunType_3172_3193" title="Not referenced locally, nor via imports">StrategoLang-SFunType</span>.<span class="cons_Constructor"><span id="FunType_3194_3201" title="Not referenced locally, nor via imports">FunType</span></span> = [<span class="cons_String">(</span>[{StrategoLang-SType <span class="cons_Lit">", "</span>}*]<span class="cons_String">)</span> [StrategoLang-SSimpleFunType]] { }

<span class="keyword">context-free syntax</span>

  <span id="StrategoLang-Coercion_3295_3316" title="Not referenced locally, nor via imports">StrategoLang-Coercion</span>.<span class="cons_Constructor"><span id="Fail_3317_3321" title="Not referenced locally, nor via imports">Fail</span></span> = [<span class="cons_String">fail</span>] { }
  <span id="StrategoLang-Coercion_3337_3358" title="Not referenced locally, nor via imports">StrategoLang-Coercion</span>.<span class="cons_Constructor"><span id="Id_3359_3361" title="Not referenced locally, nor via imports">Id</span></span> = [<span class="cons_String">id</span>] { }

</code></pre></td></tr></tbody></table></div>