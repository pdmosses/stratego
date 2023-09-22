---
title: strategies.sdf3
---

# `strategies.sdf3`

:simple-github: [pdmosses/stratego/stratego.lang/syntax/core/strategies.sdf3]

[pdmosses/stratego/stratego.lang/syntax/core/strategies.sdf3]: https://github.com/pdmosses/stratego/blob/master/stratego.lang/syntax/core/strategies.sdf3 "The source file on GitHub"

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
85
86
87
88
89
90
91
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <a href="../../sugar/strategies.sdf3#core/strategies_70_85" id="core/strategies_7_22" title="Referenced at ../../sugar/strategies.sdf3 line 5">core/strategies</a>

<span class="keyword">imports</span>
  <a href="../terms.sdf3#core/terms_7_17" id="core/terms_34_44" title="Defined at ../terms.sdf3 line 1">core/terms</a>
  <a href="../constants.sdf3#core/constants_7_21" id="core/constants_47_61" title="Defined at ../constants.sdf3 line 1">core/constants</a>
  <a href="../signatures.sdf3#core/signatures_7_22" id="core/signatures_64_79" title="Defined at ../signatures.sdf3 line 1">core/signatures</a>
  <a href="../identifiers.sdf3#core/identifiers_7_23" id="core/identifiers_82_98" title="Defined at ../identifiers.sdf3 line 1">core/identifiers</a>

<span class="keyword">template options</span>
  <span class="keyword">keyword</span> -/- [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\'\-\_]
  <span class="keyword">tokenize</span>: ")(|"

<span class="keyword">context-free sorts</span> <a href="#Def_1691_1694" id="Def_187_190" title="Referenced at line 73; ../modules.sdf3 line 32">Def</a>
<span class="keyword">context-free syntax</span>
  <a href="#Def_1691_1694" id="Def_213_216" title="Referenced at line 73; ../modules.sdf3 line 32">Def</a> = <a href="#StrategyDef_251_262" id="StrategyDef_219_230" title="Defined at line 17, 20, 27, 31">StrategyDef</a>

<span class="keyword">context-free sorts</span> <a href="#StrategyDef_463_474" id="StrategyDef_251_262" title="Referenced at line 25">StrategyDef</a> <a href="#SDefT_352_357" id="SDefT_263_268" title="Referenced at line 20; ../../sugar/strategies.sdf3 line 30">SDefT</a>
<span class="keyword">context-free syntax</span>
  <span class="layout">// indirection for SDefP in sugar/strategies</span>
  <a href="#StrategyDef_463_474" id="StrategyDef_338_349" title="Referenced at line 25">StrategyDef</a> = <a href="#SDefT_263_268" id="SDefT_352_357" title="Defined at line 17, 21">SDefT</a>
  <a href="#SDefT_352_357" id="SDefT_360_365" title="Referenced at line 20; ../../sugar/strategies.sdf3 line 30">SDefT</a>.<span class="cons_Constructor"><span id="SDefT_366_371" title="Not referenced locally, nor via imports">SDefT</span></span> =
&lt;&lt;<a href="#SId_686_689" id="SId_376_379" title="Defined at line 34, 37">SId</a>&gt;<span class="cons_String">(</span>&lt;{<a href="#Typedid_953_960" id="Typedid_383_390" title="Defined at line 48, 50">Typedid</a> <span class="cons_Lit">", "</span>}*&gt; <span class="cons_String">|</span> &lt;{<a href="#Typedid_953_960" id="Typedid_403_410" title="Defined at line 48, 50">Typedid</a> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">)</span> <span class="cons_String">=</span>
  &lt;<a href="#Strategy_1040_1048" id="Strategy_425_433" title="Defined at line 53, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 71, 78, 81, 84">Strategy</a>&gt;&gt;

  <a href="#Def_1691_1694" id="Def_439_442" title="Referenced at line 73; ../modules.sdf3 line 32">Def</a>.<span class="cons_Constructor"><span id="AnnoDef_443_450" title="Not referenced locally, nor via imports">AnnoDef</span></span> = &lt;&lt;<a href="#Anno_825_829" id="Anno_455_459" title="Defined at line 42, 44, 45, 46">Anno</a>+&gt; &lt;<a href="#StrategyDef_251_262" id="StrategyDef_463_474" title="Defined at line 17, 20, 27, 31">StrategyDef</a>&gt;&gt;

  <a href="#StrategyDef_463_474" id="StrategyDef_480_491" title="Referenced at line 25">StrategyDef</a>.<span class="cons_Constructor"><span id="ExtSDefInl_492_502" title="Not referenced locally, nor via imports">ExtSDefInl</span></span> =
&lt;<span class="cons_String">external</span> &lt;<a href="#SId_686_689" id="SId_516_519" title="Defined at line 34, 37">SId</a>&gt;<span class="cons_String">(</span>&lt;{<a href="#Typedid_953_960" id="Typedid_523_530" title="Defined at line 48, 50">Typedid</a> <span class="cons_Lit">", "</span>}*&gt; <span class="cons_String">|</span> &lt;{<a href="#Typedid_953_960" id="Typedid_543_550" title="Defined at line 48, 50">Typedid</a> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">)</span> <span class="cons_String">=</span>
  &lt;<a href="#Strategy_1040_1048" id="Strategy_565_573" title="Defined at line 53, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 71, 78, 81, 84">Strategy</a>&gt;&gt;

  <a href="#StrategyDef_463_474" id="StrategyDef_579_590" title="Referenced at line 25">StrategyDef</a>.<span class="cons_Constructor"><span id="ExtSDef_591_598" title="Not referenced locally, nor via imports">ExtSDef</span></span> =
    &lt;<span class="cons_String">external</span> &lt;<a href="#MaybeEmptySId_690_703" id="MaybeEmptySId_616_629" title="Defined at line 34, 39, 40">MaybeEmptySId</a>&gt;<span class="cons_String">(</span>&lt;{<a href="#Typedid_953_960" id="Typedid_633_640" title="Defined at line 48, 50">Typedid</a> <span class="cons_Lit">", "</span>}*&gt; <span class="cons_String">|</span> &lt;{<a href="#Typedid_953_960" id="Typedid_653_660" title="Defined at line 48, 50">Typedid</a> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">)</span>&gt;

<span class="keyword">lexical sorts</span> <a href="#SId_1660_1663" id="SId_686_689" title="Referenced at line 69; ../../gradual-types/internal.sdf3 line 39; ../../gradual-types/modules.sdf3 line 11; ../../sugar/dynamic-rules.sdf3 line 65; ../../sugar/rules.sdf3 line 35; ../../sugar/strategies.sdf3 line 45">SId</a> <a href="#MaybeEmptySId_616_629" id="MaybeEmptySId_690_703" title="Referenced at line 32; ../../gradual-types/strategies.sdf3 line 44">MaybeEmptySId</a>
<span class="keyword">lexical syntax</span>
  <span class="layout">// indirection for highlighting</span>
  <a href="#SId_1660_1663" id="SId_755_758" title="Referenced at line 69; ../../gradual-types/internal.sdf3 line 39; ../../gradual-types/modules.sdf3 line 11; ../../sugar/dynamic-rules.sdf3 line 65; ../../sugar/rules.sdf3 line 35; ../../sugar/strategies.sdf3 line 45">SId</a> = <a href="../identifiers.sdf3#Id_420_422" id="Id_761_763" title="Defined at ../identifiers.sdf3 line 16, 21, 23, 43, 44, 45">Id</a>

  <a href="#MaybeEmptySId_616_629" id="MaybeEmptySId_767_780" title="Referenced at line 32; ../../gradual-types/strategies.sdf3 line 44">MaybeEmptySId</a> =
  <a href="#MaybeEmptySId_616_629" id="MaybeEmptySId_785_798" title="Referenced at line 32; ../../gradual-types/strategies.sdf3 line 44">MaybeEmptySId</a> = <a href="#SId_686_689" id="SId_801_804" title="Defined at line 34, 37">SId</a>

<span class="keyword">context-free sorts</span> <a href="#Anno_455_459" id="Anno_825_829" title="Referenced at line 25; ../../deduplicated.sdf3 line 41; ../../sugar/rules.sdf3 line 21">Anno</a>
<span class="keyword">context-free syntax</span>
  <a href="#Anno_455_459" id="Anno_852_856" title="Referenced at line 25; ../../deduplicated.sdf3 line 41; ../../sugar/rules.sdf3 line 21">Anno</a>.<span class="cons_Constructor"><span id="Extend_857_863" title="Not referenced locally, nor via imports">Extend</span></span> = &lt;<span class="cons_String">extend</span>&gt;
  <a href="#Anno_455_459" id="Anno_877_881" title="Referenced at line 25; ../../deduplicated.sdf3 line 41; ../../sugar/rules.sdf3 line 21">Anno</a>.<span class="cons_Constructor"><span id="Override_882_890" title="Not referenced locally, nor via imports">Override</span></span> = &lt;<span class="cons_String">override</span>&gt;
  <a href="#Anno_455_459" id="Anno_906_910" title="Referenced at line 25; ../../deduplicated.sdf3 line 41; ../../sugar/rules.sdf3 line 21">Anno</a>.<span class="cons_Constructor"><span id="Internal_911_919" title="Not referenced locally, nor via imports">Internal</span></span> = &lt;<span class="cons_String">internal</span>&gt;

<span class="keyword">context-free sorts</span> <a href="#Typedid_653_660" id="Typedid_953_960" title="Referenced at line 32; ../../sugar/dynamic-rules.sdf3 line 60; ../../sugar/rules.sdf3 line 35">Typedid</a>
<span class="keyword">context-free syntax</span>
  <a href="#Typedid_653_660" id="Typedid_983_990" title="Referenced at line 32; ../../sugar/dynamic-rules.sdf3 line 60; ../../sugar/rules.sdf3 line 35">Typedid</a>.<span class="cons_Constructor"><span id="VarDec_991_997" title="Not referenced locally, nor via imports">VarDec</span></span> = &lt;&lt;<a href="../terms.sdf3#ID_83_85" id="ID_1002_1004" title="Defined at ../terms.sdf3 line 7, 10">ID</a>&gt; <span class="cons_String">:</span> &lt;<a href="../signatures.sdf3#OldType_1217_1224" id="OldType_1009_1016" title="Defined at ../signatures.sdf3 line 48, 59, 60">OldType</a>&gt;&gt;


<span class="keyword">context-free sorts</span> <a href="#Strategy_2053_2061" id="Strategy_1040_1048" title="Referenced at line 91; ../../sugar/rules.sdf3 line 50">Strategy</a> <a href="#SVar_1750_1754" id="SVar_1049_1053" title="Referenced at line 79; ../../sugar/strategies.sdf3 line 76">SVar</a>
<span class="keyword">context-free syntax</span>
  <a href="#Strategy_2053_2061" id="Strategy_1076_1084" title="Referenced at line 91; ../../sugar/rules.sdf3 line 50">Strategy</a>.<span class="cons_Constructor"><span id="Fail_1085_1089" title="Not referenced locally, nor via imports">Fail</span></span>  = &lt;<span class="cons_String">fail</span>&gt;
  <a href="#Strategy_2053_2061" id="Strategy_1102_1110" title="Referenced at line 91; ../../sugar/rules.sdf3 line 50">Strategy</a>.<span class="cons_Constructor"><span id="Id_1111_1113" title="Not referenced locally, nor via imports">Id</span></span>    = &lt;<span class="cons_String">id</span>&gt;
  <a href="#Strategy_2053_2061" id="Strategy_1126_1134" title="Referenced at line 91; ../../sugar/rules.sdf3 line 50">Strategy</a>.<span class="cons_Constructor"><span id="ProceedT_1135_1143" title="Not referenced locally, nor via imports">ProceedT</span></span> = &lt;<span class="cons_String">proceed(</span>&lt;{<a href="#Strategy_1040_1048" id="Strategy_1157_1165" title="Defined at line 53, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 71, 78, 81, 84">Strategy</a> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">|</span>&lt;{<a href="../terms.sdf3#Term_180_184" id="Term_1176_1180" title="Defined at ../terms.sdf3 line 13, 16, 17, 18, 19">Term</a> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">)</span>&gt;
  <a href="#Strategy_2053_2061" id="Strategy_1193_1201" title="Referenced at line 91; ../../sugar/rules.sdf3 line 50">Strategy</a>.<span class="cons_Constructor"><span id="ProceedNoArgs_1202_1215" title="Not referenced locally, nor via imports">ProceedNoArgs</span></span> = &lt;<span class="cons_String">proceed</span>&gt;
  <a href="#Strategy_2053_2061" id="Strategy_1230_1238" title="Referenced at line 91; ../../sugar/rules.sdf3 line 50">Strategy</a>.<span class="cons_Constructor"><a href="#Match_2026_2031" id="Match_1239_1244" title="Referenced at line 88; ../../sugar/strategies.sdf3 line 127">Match</a></span> = &lt;<span class="cons_String">?</span>&lt;<a href="../terms.sdf3#Term_180_184" id="Term_1250_1254" title="Defined at ../terms.sdf3 line 13, 16, 17, 18, 19">Term</a>&gt;&gt;
  <a href="#Strategy_2053_2061" id="Strategy_1259_1267" title="Referenced at line 91; ../../sugar/rules.sdf3 line 50">Strategy</a>.<span class="cons_Constructor"><a href="#Build_2007_2012" id="Build_1268_1273" title="Referenced at line 87; ../../sugar/strategies.sdf3 line 127">Build</a></span> = &lt;<span class="cons_String">!</span>&lt;<a href="../terms.sdf3#Term_180_184" id="Term_1279_1283" title="Defined at ../terms.sdf3 line 13, 16, 17, 18, 19">Term</a>&gt;&gt;
  <a href="#Strategy_2053_2061" id="Strategy_1288_1296" title="Referenced at line 91; ../../sugar/rules.sdf3 line 50">Strategy</a>.<span class="cons_Constructor"><span id="Scope_1297_1302" title="Not referenced locally, nor via imports">Scope</span></span> = &lt;<span class="cons_String">{</span>&lt;{<a href="../terms.sdf3#ID_83_85" id="ID_1309_1311" title="Defined at ../terms.sdf3 line 7, 10">ID</a> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">:</span> &lt;<a href="#Strategy_1040_1048" id="Strategy_1322_1330" title="Defined at line 53, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 71, 78, 81, 84">Strategy</a>&gt; <span class="cons_String">}</span>&gt;
  <a href="#Strategy_2053_2061" id="Strategy_1337_1345" title="Referenced at line 91; ../../sugar/rules.sdf3 line 50">Strategy</a>.<span class="cons_Constructor"><a href="#Seq_2047_2050" id="Seq_1346_1349" title="Referenced at line 90; ../../sugar/dynamic-rules.sdf3 line 105; ../../sugar/strategies.sdf3 line 108">Seq</a></span>   = &lt;&lt;<a href="#Strategy_1040_1048" id="Strategy_1356_1364" title="Defined at line 53, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 71, 78, 81, 84">Strategy</a>&gt;<span class="cons_String">;</span> &lt;<a href="#Strategy_1040_1048" id="Strategy_1368_1376" title="Defined at line 53, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 71, 78, 81, 84">Strategy</a>&gt;&gt; {<span class="keyword">right</span>}
  <a href="#Strategy_2053_2061" id="Strategy_1389_1397" title="Referenced at line 91; ../../sugar/rules.sdf3 line 50">Strategy</a>.<span class="cons_Constructor"><a href="#GuardedLChoice_2062_2076" id="GuardedLChoice_1398_1412" title="Referenced at line 91; ../../sugar/strategies.sdf3 line 136">GuardedLChoice</a></span> = [[<a href="#Strategy_1040_1048" id="Strategy_1417_1425" title="Defined at line 53, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 71, 78, 81, 84">Strategy</a>] <span class="cons_String">&lt;</span> [<a href="#Strategy_1040_1048" id="Strategy_1430_1438" title="Defined at line 53, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 71, 78, 81, 84">Strategy</a>] <span class="cons_String">+</span> [<a href="#Strategy_1040_1048" id="Strategy_1443_1451" title="Defined at line 53, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 71, 78, 81, 84">Strategy</a>]] {<span class="keyword">right</span>}
  <a href="#Strategy_2053_2061" id="Strategy_1464_1472" title="Referenced at line 91; ../../sugar/rules.sdf3 line 50">Strategy</a>.<span class="cons_Constructor"><span id="PrimT_1473_1478" title="Not referenced locally, nor via imports">PrimT</span></span> = &lt;<span class="cons_String">prim(</span>&lt;<a href="../constants.sdf3#String_46_52" id="String_1488_1494" title="Defined at ../constants.sdf3 line 3, 9">String</a>&gt;<span class="cons_String">,</span> &lt;{<a href="#Strategy_1040_1048" id="Strategy_1499_1507" title="Defined at line 53, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 71, 78, 81, 84">Strategy</a> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">|</span>&lt;{<a href="../terms.sdf3#Term_180_184" id="Term_1518_1522" title="Defined at ../terms.sdf3 line 13, 16, 17, 18, 19">Term</a> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">)</span>&gt;
  <a href="#Strategy_2053_2061" id="Strategy_1535_1543" title="Referenced at line 91; ../../sugar/rules.sdf3 line 50">Strategy</a>.<span class="cons_Constructor"><span id="Some_1544_1548" title="Not referenced locally, nor via imports">Some</span></span>  = &lt;<span class="cons_String">some(</span>&lt;<a href="#Strategy_1040_1048" id="Strategy_1559_1567" title="Defined at line 53, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 71, 78, 81, 84">Strategy</a>&gt;<span class="cons_String">)</span>&gt;
  <a href="#Strategy_2053_2061" id="Strategy_1573_1581" title="Referenced at line 91; ../../sugar/rules.sdf3 line 50">Strategy</a>.<span class="cons_Constructor"><span id="One_1582_1585" title="Not referenced locally, nor via imports">One</span></span>   = &lt;<span class="cons_String">one(</span>&lt;<a href="#Strategy_1040_1048" id="Strategy_1596_1604" title="Defined at line 53, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 71, 78, 81, 84">Strategy</a>&gt;<span class="cons_String">)</span>&gt;
  <a href="#Strategy_2053_2061" id="Strategy_1610_1618" title="Referenced at line 91; ../../sugar/rules.sdf3 line 50">Strategy</a>.<span class="cons_Constructor"><span id="All_1619_1622" title="Not referenced locally, nor via imports">All</span></span>   = &lt;<span class="cons_String">all(</span>&lt;<a href="#Strategy_1040_1048" id="Strategy_1633_1641" title="Defined at line 53, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 71, 78, 81, 84">Strategy</a>&gt;<span class="cons_String">)</span>&gt;

  <a href="#SVar_1750_1754" id="SVar_1648_1652" title="Referenced at line 79; ../../sugar/strategies.sdf3 line 76">SVar</a>.<span class="cons_Constructor"><span id="SVar_1653_1657" title="Not referenced locally, nor via imports">SVar</span></span> = <a href="#SId_686_689" id="SId_1660_1663" title="Defined at line 34, 37">SId</a>

  <a href="#Strategy_2053_2061" id="Strategy_1667_1675" title="Referenced at line 91; ../../sugar/rules.sdf3 line 50">Strategy</a>.<span class="cons_Constructor"><span id="Let_1676_1679" title="Not referenced locally, nor via imports">Let</span></span> =
&lt;<span class="cons_String">let</span>
  &lt;{<a href="#Def_187_190" id="Def_1691_1694" title="Defined at line 13, 15, 25">Def</a> <span class="cons_Lit">"\n"</span>}*&gt;
<span class="cons_String">in</span>
  &lt;<a href="#Strategy_1040_1048" id="Strategy_1709_1717" title="Defined at line 53, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 71, 78, 81, 84">Strategy</a>&gt;
<span class="cons_String">end</span>&gt;

  <a href="#Strategy_2053_2061" id="Strategy_1727_1735" title="Referenced at line 91; ../../sugar/rules.sdf3 line 50">Strategy</a>.<span class="cons_Constructor"><span id="CallT_1736_1741" title="Not referenced locally, nor via imports">CallT</span></span> =
    &lt;&lt;<a href="#SVar_1049_1053" id="SVar_1750_1754" title="Defined at line 53, 69">SVar</a>&gt;<span class="cons_String">(</span>&lt;{<a href="#Strategy_1040_1048" id="Strategy_1758_1766" title="Defined at line 53, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 71, 78, 81, 84">Strategy</a> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">|</span>&lt;{<a href="../terms.sdf3#Term_180_184" id="Term_1777_1781" title="Defined at ../terms.sdf3 line 13, 16, 17, 18, 19">Term</a> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">)</span>&gt;

  <a href="#Strategy_2053_2061" id="Strategy_1795_1803" title="Referenced at line 91; ../../sugar/rules.sdf3 line 50">Strategy</a>.<span class="cons_Constructor"><span id="CallDynamic_1804_1815" title="Not referenced locally, nor via imports">CallDynamic</span></span> =
    &lt;<span class="cons_String">call(</span>&lt;<a href="../terms.sdf3#Term_180_184" id="Term_1829_1833" title="Defined at ../terms.sdf3 line 13, 16, 17, 18, 19">Term</a>&gt;<span class="cons_String">|</span>&lt;{<a href="#Strategy_1040_1048" id="Strategy_1837_1845" title="Defined at line 53, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 71, 78, 81, 84">Strategy</a> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">|</span>&lt;{<a href="../terms.sdf3#Term_180_184" id="Term_1856_1860" title="Defined at ../terms.sdf3 line 13, 16, 17, 18, 19">Term</a> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">)</span>&gt; {<span class="keyword">deprecated</span>("Dynamic calls are not supported")}

  <a href="#Strategy_2053_2061" id="Strategy_1922_1930" title="Referenced at line 91; ../../sugar/rules.sdf3 line 50">Strategy</a>.<span class="cons_Constructor"><span id="ImportTerm_1931_1941" title="Not referenced locally, nor via imports">ImportTerm</span></span> = &lt;<span class="cons_String">import-term(</span>&lt;<a href="../identifiers.sdf3#ModName_39_46" id="ModName_1958_1965" title="Defined at ../identifiers.sdf3 line 3, 5, 10, 11, 12, 13, 14">ModName</a>&gt;<span class="cons_String">)</span>&gt;

<span class="keyword">context-free priorities</span>
  { <a href="#Strategy_1040_1048" id="Strategy_1998_2006" title="Defined at line 53, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 71, 78, 81, 84">Strategy</a>.<span class="cons_Constructor"><a href="#Build_1268_1273" id="Build_2007_2012" title="Defined at line 60">Build</a></span>
    <a href="#Strategy_1040_1048" id="Strategy_2017_2025" title="Defined at line 53, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 71, 78, 81, 84">Strategy</a>.<span class="cons_Constructor"><a href="#Match_1239_1244" id="Match_2026_2031" title="Defined at line 59">Match</a></span>
  }
&gt; <a href="#Strategy_1040_1048" id="Strategy_2038_2046" title="Defined at line 53, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 71, 78, 81, 84">Strategy</a>.<span class="cons_Constructor"><a href="#Seq_1346_1349" id="Seq_2047_2050" title="Defined at line 62">Seq</a></span>
&gt; <a href="#Strategy_1040_1048" id="Strategy_2053_2061" title="Defined at line 53, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 71, 78, 81, 84">Strategy</a>.<span class="cons_Constructor"><a href="#GuardedLChoice_1398_1412" id="GuardedLChoice_2062_2076" title="Defined at line 63">GuardedLChoice</a></span>

</code></pre></td></tr></tbody></table></div>