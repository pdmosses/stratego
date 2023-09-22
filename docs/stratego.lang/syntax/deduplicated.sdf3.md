---
title: deduplicated.sdf3
---

# `deduplicated.sdf3`

:simple-github: [pdmosses/stratego/stratego.lang/syntax/deduplicated.sdf3]

[pdmosses/stratego/stratego.lang/syntax/deduplicated.sdf3]: https://github.com/pdmosses/stratego/blob/master/stratego.lang/syntax/deduplicated.sdf3 "The source file on GitHub"

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
71
72
73
74
75
76
77
78
79
80
81
82
83
84
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <span id="deduplicated_7_19" title="Not referenced locally, nor via imports">deduplicated</span>

<span class="keyword">imports</span>
  <a href="../core/terms.sdf3#core/terms_7_17" id="core/terms_31_41" title="Defined at ../core/terms.sdf3 line 1">core/terms</a>
  <a href="../core/signatures.sdf3#core/signatures_7_22" id="core/signatures_44_59" title="Defined at ../core/signatures.sdf3 line 1">core/signatures</a>
  <a href="../core/identifiers.sdf3#core/identifiers_7_23" id="core/identifiers_62_78" title="Defined at ../core/identifiers.sdf3 line 1">core/identifiers</a>

  <a href="../sugar/terms.sdf3#sugar/terms_7_18" id="sugar/terms_82_93" title="Defined at ../sugar/terms.sdf3 line 1">sugar/terms</a>
  <a href="../sugar/rules.sdf3#sugar/rules_7_18" id="sugar/rules_96_107" title="Defined at ../sugar/rules.sdf3 line 1">sugar/rules</a>
  <a href="../core/strategies.sdf3#core/strategies_7_22" id="core/strategies_110_125" title="Defined at ../core/strategies.sdf3 line 1">core/strategies</a>
  <a href="../sugar/dynamic-rules.sdf3#sugar/dynamic-rules_7_26" id="sugar/dynamic-rules_128_147" title="Defined at ../sugar/dynamic-rules.sdf3 line 1">sugar/dynamic-rules</a>
  <a href="../sugar/string-quotations.sdf3#sugar/string-quotations_7_30" id="sugar/string-quotations_150_173" title="Defined at ../sugar/string-quotations.sdf3 line 1">sugar/string-quotations</a>

  <a href="../gradual-types/signatures.sdf3#gradual-types/signatures_7_31" id="gradual-types/signatures_177_201" title="Defined at ../gradual-types/signatures.sdf3 line 1">gradual-types/signatures</a>
  <a href="../gradual-types/strategies.sdf3#gradual-types/strategies_7_31" id="gradual-types/strategies_204_228" title="Defined at ../gradual-types/strategies.sdf3 line 1">gradual-types/strategies</a>

/*
<span class="keyword">This file contains the original productions of constructors that were renamed to conform to</span>
<span class="keyword">requirements from Statix that every constructor be unique</span>.
*/

<span class="keyword">context-free syntax</span> <span class="layout">// core/terms</span>
  <a href="#PreTerm_450_457" id="PreTerm_424_431" title="Referenced at line 23">PreTerm</a>.<span class="cons_Constructor"><span id="As_432_434" title="Not referenced locally, nor via imports">As</span></span>      = &lt;&lt;<a href="../core/terms.sdf3#Var_86_89" id="Var_444_447" title="Defined at ../core/terms.sdf3 line 7, 9">Var</a>&gt;<span class="cons_String">@</span>&lt;<a href="#PreTerm_424_431" id="PreTerm_450_457" title="Defined at line 23, 36, 37">PreTerm</a>&gt;&gt;

<span class="keyword">context-free syntax</span> <span class="layout">// core/signatures</span>
  <span id="SortDef_502_509" title="Not referenced locally, nor via imports">SortDef</span>.<span class="cons_Constructor"><span id="SortVar_510_517" title="Not referenced locally, nor via imports">SortVar</span></span>    = <a href="../core/identifiers.sdf3#LCID_427_431" id="LCID_523_527" title="Defined at ../core/identifiers.sdf3 line 16, 25, 47">LCID</a> {<span class="keyword">deprecated</span>("This syntax never had a clear meaning should not be used")}
  <span id="SortDef_603_610" title="Not referenced locally, nor via imports">SortDef</span>.<span class="cons_Constructor"><span id="SortNoArgs_611_621" title="Not referenced locally, nor via imports">SortNoArgs</span></span> = <a href="../core/identifiers.sdf3#UCID_432_436" id="UCID_624_628" title="Defined at ../core/identifiers.sdf3 line 16, 26, 48">UCID</a>
  <span id="SortDef_631_638" title="Not referenced locally, nor via imports">SortDef</span>.<span class="cons_Constructor"><span id="Sort_639_643" title="Not referenced locally, nor via imports">Sort</span></span> = [[<a href="../core/identifiers.sdf3#UCID_432_436" id="UCID_648_652" title="Defined at ../core/identifiers.sdf3 line 16, 26, 48">UCID</a>]<span class="cons_String">(</span>[{<a href="../core/signatures.sdf3#Kind_88_92" id="Kind_656_660" title="Defined at ../core/signatures.sdf3 line 7, 9">Kind</a> <span class="cons_Lit">", "</span>}*]<span class="cons_String">)</span>]
  <span id="SortDef_673_680" title="Not referenced locally, nor via imports">SortDef</span>.<span class="cons_Constructor"><span id="Sort_681_685" title="Not referenced locally, nor via imports">Sort</span></span> = &lt;&lt;<a href="../core/identifiers.sdf3#Id_420_422" id="Id_690_692" title="Defined at ../core/identifiers.sdf3 line 16, 21, 23, 43, 44, 45">Id</a>&gt;<span class="cons_String">(</span>&lt;{<a href="../core/signatures.sdf3#Sort_735_739" id="Sort_696_700" title="Defined at ../core/signatures.sdf3 line 31, 33, 34, 35">Sort</a> <span class="cons_Lit">", "</span>}+&gt;<span class="cons_String">)</span>&gt; {<span class="keyword">deprecated</span>("This syntax never had a clear meaning should be replaced by the version that uses kinds A(*, *)")}

  <span id="SortDef_826_833" title="Not referenced locally, nor via imports">SortDef</span>.<span class="cons_Constructor"><span id="ExtSort_834_841" title="Not referenced locally, nor via imports">ExtSort</span></span> = [<span class="cons_String">external</span> [<a href="../core/identifiers.sdf3#UCID_432_436" id="UCID_855_859" title="Defined at ../core/identifiers.sdf3 line 16, 26, 48">UCID</a>]<span class="cons_String">(</span>[{<a href="../core/signatures.sdf3#Kind_88_92" id="Kind_863_867" title="Defined at ../core/signatures.sdf3 line 7, 9">Kind</a> <span class="cons_Lit">", "</span>}*]<span class="cons_String">)</span>]

  <span id="OpType_881_887" title="Not referenced locally, nor via imports">OpType</span>.<span class="cons_Constructor"><span id="FunType_888_895" title="Not referenced locally, nor via imports">FunType</span></span> = [[{<a href="#ConstType_2059_2068" id="ConstType_901_910" title="Defined at line 71">ConstType</a> <span class="cons_Lit">" * "</span>}+] <span class="cons_String">-&gt;</span> [<a href="#ConstType_2059_2068" id="ConstType_924_933" title="Defined at line 71">ConstType</a>]]

<span class="keyword">context-free syntax</span> <span class="layout">// sugar/terms</span>
  <a href="#PreTerm_450_457" id="PreTerm_974_981" title="Referenced at line 23">PreTerm</a>.<span class="cons_Constructor"><span id="App_982_985" title="Not referenced locally, nor via imports">App</span></span>       = [<span class="cons_String">&lt;</span>[<a href="#Strategy_1191_1199" id="Strategy_997_1005" title="Defined at line 45, 49">Strategy</a>]<span class="cons_String">&gt;</span> [<a href="../core/terms.sdf3#Term_180_184" id="Term_1009_1013" title="Defined at ../core/terms.sdf3 line 13, 16, 17, 18, 19">Term</a>]]
  <a href="#PreTerm_450_457" id="PreTerm_1018_1025" title="Referenced at line 23">PreTerm</a>.<span class="cons_Constructor"><span id="RootApp_1026_1033" title="Not referenced locally, nor via imports">RootApp</span></span>   = [<span class="cons_String">&lt;</span>[<a href="#Strategy_1191_1199" id="Strategy_1041_1049" title="Defined at line 45, 49">Strategy</a>]<span class="cons_String">&gt;</span>]

<span class="keyword">context-free syntax</span> <span class="layout">// sugar/rules</span>
  <span id="Def_1091_1094" title="Not referenced locally, nor via imports">Def</span>.<span class="cons_Constructor"><span id="AnnoDef_1095_1102" title="Not referenced locally, nor via imports">AnnoDef</span></span> =
    &lt;&lt;<a href="../core/strategies.sdf3#Anno_825_829" id="Anno_1111_1115" title="Defined at ../core/strategies.sdf3 line 42, 44, 45, 46">Anno</a>+&gt; &lt;<a href="../sugar/rules.sdf3#RuleDef_199_206" id="RuleDef_1119_1126" title="Defined at ../sugar/rules.sdf3 line 14, 16, 23, 27, 33">RuleDef</a>&gt;&gt;

<span class="keyword">syntax</span> <span class="layout">// sugar/dynamic-rules</span>
  <span class="layout">// 1 space after RuleNames</span>
  <a href="#Strategy_1445_1453" id="Strategy_1191_1199" title="Referenced at line 51">Strategy</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="DynRuleUnionFix_1203_1218" title="Not referenced locally, nor via imports">DynRuleUnionFix</span></span> =
  <span class="cons_Lit">"\\"</span> <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span> <a href="../sugar/dynamic-rules.sdf3#RuleNames_1412_1421" id="RuleNames_1239_1248" title="Defined at ../sugar/dynamic-rules.sdf3 line 62, 65, 66">RuleNames</a><span class="keyword">-CF</span> <span class="cons_Lit">" /*"</span> <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span> <a href="#Strategy_1191_1199" id="Strategy_1269_1277" title="Defined at line 45, 49">Strategy</a><span class="keyword">-CF</span>

  <span class="layout">// 1 space after RuleNames</span>
  <a href="#Strategy_1445_1453" id="Strategy_1313_1321" title="Referenced at line 51">Strategy</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="DynRuleIntersectUnionFix_1325_1349" title="Not referenced locally, nor via imports">DynRuleIntersectUnionFix</span></span> =
  <span class="cons_Lit">"/"</span> <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span> <a href="../sugar/dynamic-rules.sdf3#RuleNames_1412_1421" id="RuleNames_1369_1378" title="Defined at ../sugar/dynamic-rules.sdf3 line 62, 65, 66">RuleNames</a><span class="keyword">-CF LAYOUT</span>?<span class="keyword">-CF</span> <span class="cons_Lit">"\\"</span>
      <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span> <a href="../sugar/dynamic-rules.sdf3#RuleNames_1412_1421" id="RuleNames_1415_1424" title="Defined at ../sugar/dynamic-rules.sdf3 line 62, 65, 66">RuleNames</a><span class="keyword">-CF</span> <span class="cons_Lit">" /*"</span> <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span> <a href="#Strategy_1191_1199" id="Strategy_1445_1453" title="Defined at line 45, 49">Strategy</a><span class="keyword">-CF</span>

<span class="keyword">context-free syntax</span> <span class="layout">// sugar/string-quotations</span>

  <span id="StringQuotedPart1_1508_1525" title="Not referenced locally, nor via imports">StringQuotedPart1</span>.<span class="cons_Constructor"><span id="QStr_1526_1530" title="Not referenced locally, nor via imports">QStr</span></span> = <a href="../sugar/string-quotations.sdf3#StringQuotedChars1_750_768" id="StringQuotedChars1_1533_1551" title="Defined at ../sugar/string-quotations.sdf3 line 31, 37">StringQuotedChars1</a>
  <span id="StringQuotedPart2_1554_1571" title="Not referenced locally, nor via imports">StringQuotedPart2</span>.<span class="cons_Constructor"><span id="QStr_1572_1576" title="Not referenced locally, nor via imports">QStr</span></span> = <a href="../sugar/string-quotations.sdf3#StringQuotedChars2_794_812" id="StringQuotedChars2_1579_1597" title="Defined at ../sugar/string-quotations.sdf3 line 32, 38">StringQuotedChars2</a>
  <span id="StringQuotedPart3_1600_1617" title="Not referenced locally, nor via imports">StringQuotedPart3</span>.<span class="cons_Constructor"><span id="QStr_1618_1622" title="Not referenced locally, nor via imports">QStr</span></span> = <a href="../sugar/string-quotations.sdf3#StringQuotedChars3_838_856" id="StringQuotedChars3_1625_1643" title="Defined at ../sugar/string-quotations.sdf3 line 33, 39">StringQuotedChars3</a>
  <span id="StringQuotedPart4_1646_1663" title="Not referenced locally, nor via imports">StringQuotedPart4</span>.<span class="cons_Constructor"><span id="QStr_1664_1668" title="Not referenced locally, nor via imports">QStr</span></span> = <a href="../sugar/string-quotations.sdf3#StringQuotedChars4_882_900" id="StringQuotedChars4_1671_1689" title="Defined at ../sugar/string-quotations.sdf3 line 34, 40">StringQuotedChars4</a>

  <span id="StringQuotedPart1_1693_1710" title="Not referenced locally, nor via imports">StringQuotedPart1</span>.<span class="cons_Constructor"><span id="QDollar_1711_1718" title="Not referenced locally, nor via imports">QDollar</span></span> = <a href="../sugar/string-quotations.sdf3#Dollar1_769_776" id="Dollar1_1721_1728" title="Defined at ../sugar/string-quotations.sdf3 line 31, 42">Dollar1</a>
  <span id="StringQuotedPart2_1731_1748" title="Not referenced locally, nor via imports">StringQuotedPart2</span>.<span class="cons_Constructor"><span id="QDollar_1749_1756" title="Not referenced locally, nor via imports">QDollar</span></span> = <a href="../sugar/string-quotations.sdf3#Dollar2_813_820" id="Dollar2_1759_1766" title="Defined at ../sugar/string-quotations.sdf3 line 32, 43">Dollar2</a>
  <span id="StringQuotedPart3_1769_1786" title="Not referenced locally, nor via imports">StringQuotedPart3</span>.<span class="cons_Constructor"><span id="QDollar_1787_1794" title="Not referenced locally, nor via imports">QDollar</span></span> = <a href="../sugar/string-quotations.sdf3#Dollar3_857_864" id="Dollar3_1797_1804" title="Defined at ../sugar/string-quotations.sdf3 line 33, 44">Dollar3</a>
  <span id="StringQuotedPart4_1807_1824" title="Not referenced locally, nor via imports">StringQuotedPart4</span>.<span class="cons_Constructor"><span id="QDollar_1825_1832" title="Not referenced locally, nor via imports">QDollar</span></span> = <a href="../sugar/string-quotations.sdf3#Dollar4_901_908" id="Dollar4_1835_1842" title="Defined at ../sugar/string-quotations.sdf3 line 34, 45">Dollar4</a>

  <span id="StringQuotedPart1_1846_1863" title="Not referenced locally, nor via imports">StringQuotedPart1</span>.<span class="cons_Constructor"><span id="QBr_1864_1867" title="Not referenced locally, nor via imports">QBr</span></span> = <a href="../sugar/string-quotations.sdf3#QuotedBracket1_777_791" id="QuotedBracket1_1870_1884" title="Defined at ../sugar/string-quotations.sdf3 line 31, 47">QuotedBracket1</a>
  <span id="StringQuotedPart2_1887_1904" title="Not referenced locally, nor via imports">StringQuotedPart2</span>.<span class="cons_Constructor"><span id="QBr_1905_1908" title="Not referenced locally, nor via imports">QBr</span></span> = <a href="../sugar/string-quotations.sdf3#QuotedBracket2_821_835" id="QuotedBracket2_1911_1925" title="Defined at ../sugar/string-quotations.sdf3 line 32, 48">QuotedBracket2</a>
  <span id="StringQuotedPart3_1928_1945" title="Not referenced locally, nor via imports">StringQuotedPart3</span>.<span class="cons_Constructor"><span id="QBr_1946_1949" title="Not referenced locally, nor via imports">QBr</span></span> = <a href="../sugar/string-quotations.sdf3#QuotedBracket3_865_879" id="QuotedBracket3_1952_1966" title="Defined at ../sugar/string-quotations.sdf3 line 33, 49">QuotedBracket3</a>
  <span id="StringQuotedPart4_1969_1986" title="Not referenced locally, nor via imports">StringQuotedPart4</span>.<span class="cons_Constructor"><span id="QBr_1987_1990" title="Not referenced locally, nor via imports">QBr</span></span> = <a href="../sugar/string-quotations.sdf3#QuotedBracket4_909_923" id="QuotedBracket4_1993_2007" title="Defined at ../sugar/string-quotations.sdf3 line 34, 50">QuotedBracket4</a>

<span class="keyword">context-free syntax</span> <span class="layout">// gradual-types/signatures</span>
  <a href="#ConstType_924_933" id="ConstType_2059_2068" title="Referenced at line 33">ConstType</a>.<span class="cons_Constructor"><span id="DynT_2069_2073" title="Not referenced locally, nor via imports">DynT</span></span> = <a href="../gradual-types/signatures.sdf3#Dyn_109_112" id="Dyn_2076_2079" title="Defined at ../gradual-types/signatures.sdf3 line 7, 10">Dyn</a>

  <span id="SortT_2083_2088" title="Not referenced locally, nor via imports">SortT</span>.<span class="cons_Constructor"><span id="Sort_2089_2093" title="Not referenced locally, nor via imports">Sort</span></span>       = [[<a href="../core/identifiers.sdf3#Id_420_422" id="Id_2104_2106" title="Defined at ../core/identifiers.sdf3 line 16, 21, 23, 43, 44, 45">Id</a>]<span class="cons_String">(</span>[{<a href="../gradual-types/signatures.sdf3#Type_98_102" id="Type_2110_2114" title="Defined at ../gradual-types/signatures.sdf3 line 7, 11, 12, 13, 14, 15, 16, 17, 18">Type</a> <span class="cons_Lit">", "</span>}*]<span class="cons_String">)</span>]
  <span id="SortT_2127_2132" title="Not referenced locally, nor via imports">SortT</span>.<span class="cons_Constructor"><span id="SortNoArgs_2133_2143" title="Not referenced locally, nor via imports">SortNoArgs</span></span> = <a href="../core/identifiers.sdf3#UCID_432_436" id="UCID_2146_2150" title="Defined at ../core/identifiers.sdf3 line 16, 26, 48">UCID</a>
  <span id="SortT_2153_2158" title="Not referenced locally, nor via imports">SortT</span>.<span class="cons_Constructor"><span id="SortVar_2159_2166" title="Not referenced locally, nor via imports">SortVar</span></span>    = <a href="../core/identifiers.sdf3#SortVar_437_444" id="SortVar_2172_2179" title="Defined at ../core/identifiers.sdf3 line 16, 28, 29">SortVar</a>

  <span id="SortArg_2183_2190" title="Not referenced locally, nor via imports">SortArg</span>.<span class="cons_Constructor"><span id="TupleT_2191_2197" title="Not referenced locally, nor via imports">TupleT</span></span> = [[<a href="../core/signatures.sdf3#Sort_735_739" id="Sort_2202_2206" title="Defined at ../core/signatures.sdf3 line 31, 33, 34, 35">Sort</a>] <span class="cons_String">*</span> [{<a href="../core/signatures.sdf3#Sort_735_739" id="Sort_2212_2216" title="Defined at ../core/signatures.sdf3 line 31, 33, 34, 35">Sort</a> <span class="cons_Lit">" * "</span>}+]]
  <span id="SortArg_2229_2236" title="Not referenced locally, nor via imports">SortArg</span>.<span class="cons_Constructor"><span id="DynT_2237_2241" title="Not referenced locally, nor via imports">DynT</span></span>   = <a href="../gradual-types/signatures.sdf3#Dyn_109_112" id="Dyn_2246_2249" title="Defined at ../gradual-types/signatures.sdf3 line 7, 10">Dyn</a>

  <span id="SFunType_2253_2261" title="Not referenced locally, nor via imports">SFunType</span>.<span class="cons_Constructor"><span id="FunType_2262_2269" title="Not referenced locally, nor via imports">FunType</span></span> = [<span class="cons_String">(</span>[{<a href="../gradual-types/signatures.sdf3#SType_838_843" id="SType_2276_2281" title="Defined at ../gradual-types/signatures.sdf3 line 32, 34, 35">SType</a> <span class="cons_Lit">", "</span>}*]<span class="cons_String">)</span> [<a href="../gradual-types/signatures.sdf3#SSimpleFunType_853_867" id="SSimpleFunType_2292_2306" title="Defined at ../gradual-types/signatures.sdf3 line 32, 37, 38">SSimpleFunType</a>]]

<span class="keyword">context-free syntax</span> <span class="layout">// gradual-types/strategies</span>
  <span id="Coercion_2360_2368" title="Not referenced locally, nor via imports">Coercion</span>.<span class="cons_Constructor"><span id="Fail_2369_2373" title="Not referenced locally, nor via imports">Fail</span></span> = [<span class="cons_String">fail</span>]
  <span id="Coercion_2385_2393" title="Not referenced locally, nor via imports">Coercion</span>.<span class="cons_Constructor"><span id="Id_2394_2396" title="Not referenced locally, nor via imports">Id</span></span> = [<span class="cons_String">id</span>]
</code></pre></td></tr></tbody></table></div>