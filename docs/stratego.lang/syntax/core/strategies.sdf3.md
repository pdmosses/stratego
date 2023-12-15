---
title: strategies.sdf3
hide:
  - toc
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
<td class="code"><pre><code><span class="keyword">module</span> <button class="modal-open" id="core/strategies_1_8" title="Multi-file references" data-urls="../main.sdf3/#core/strategies_9_3 line 9; ../modules.sdf3/#core/strategies_7_3 line 7; ../../deduplicated.sdf3/#core/strategies_10_3 line 10; ../../gradual-types/internal.sdf3/#core/strategies_7_3 line 7; ../../gradual-types/modules.sdf3/#core/strategies_4_3 line 4; ../../gradual-types/strategies.sdf3/#core/strategies_6_3 line 6; ../../sugar/dynamic-rules.sdf3/#core/strategies_7_3 line 7; ../../sugar/modules.sdf3/#core/strategies_4_3 line 4; ../../sugar/rules.sdf3/#core/strategies_7_5 line 7; ../../sugar/strategies.sdf3/#core/strategies_5_3 line 5">core/strategies</button>

<span class="keyword">imports</span>
  <a href="../terms.sdf3/#core/terms_1_8" id="core/terms_4_3" title="Defined at ../terms.sdf3 line 1">core/terms</a>
  <a href="../constants.sdf3/#core/constants_1_8" id="core/constants_5_3" title="Defined at ../constants.sdf3 line 1">core/constants</a>
  <a href="../signatures.sdf3/#core/signatures_1_8" id="core/signatures_6_3" title="Defined at ../signatures.sdf3 line 1">core/signatures</a>
  <a href="../identifiers.sdf3/#core/identifiers_1_8" id="core/identifiers_7_3" title="Defined at ../identifiers.sdf3 line 1">core/identifiers</a>

<span class="keyword">template options</span>
  <span class="keyword">keyword</span> -/- [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\'\-\_]
  <span class="keyword">tokenize</span>: ")(|"

<span class="keyword">context-free sorts</span> <button class="modal-open" id="Def_13_20" title="Multi-file references" data-urls="#Def_73_5 line 73; ../modules.sdf3/#Def_32_3 line 32">Def</button>
<span class="keyword">context-free syntax</span>
  <button class="modal-open" id="Def_15_3" title="Multi-file references" data-urls="#Def_73_5 line 73; ../modules.sdf3/#Def_32_3 line 32">Def</button> = <a href="#StrategyDef_17_20" id="StrategyDef_15_9" title="Defined at line 17, 20, 27, 31">StrategyDef</a>

<span class="keyword">context-free sorts</span> <a href="#StrategyDef_15_9" id="StrategyDef_17_20" title="Referenced at line 15, 25">StrategyDef</a> <button class="modal-open" id="SDefT_17_32" title="Multi-file references" data-urls="#SDefT_20_17 line 20; ../../sugar/strategies.sdf3/#SDefT_30_11 line 30">SDefT</button>
<span class="keyword">context-free syntax</span>
  <span class="layout">// indirection for SDefP in sugar/strategies</span>
  <a href="#StrategyDef_15_9" id="StrategyDef_20_3" title="Referenced at line 15, 25">StrategyDef</a> = <a href="#SDefT_17_32" id="SDefT_20_17" title="Defined at line 17, 21">SDefT</a>
  <button class="modal-open" id="SDefT_21_3" title="Multi-file references" data-urls="#SDefT_20_17 line 20; ../../sugar/strategies.sdf3/#SDefT_30_11 line 30">SDefT</button>.<span class="cons_Constructor"><span id="SDefT_21_9" title="Not referenced">SDefT</span></span> =
&lt;&lt;<a href="#SId_34_15" id="SId_22_3" title="Defined at line 34, 37">SId</a>&gt;<span class="cons_String">(</span>&lt;{<a href="#Typedid_48_20" id="Typedid_22_10" title="Defined at line 48, 50">Typedid</a> <span class="cons_Lit">", "</span>}*&gt; <span class="cons_String">|</span> &lt;{<a href="#Typedid_48_20" id="Typedid_22_30" title="Defined at line 48, 50">Typedid</a> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">)</span> <span class="cons_String">=</span>
  &lt;<a href="#Strategy_53_20" id="Strategy_23_4" title="Defined at line 53, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 71, 78, 81, 84">Strategy</a>&gt;&gt;

  <button class="modal-open" id="Def_25_3" title="Multi-file references" data-urls="#Def_73_5 line 73; ../modules.sdf3/#Def_32_3 line 32">Def</button>.<span class="cons_Constructor"><span id="AnnoDef_25_7" title="Not referenced">AnnoDef</span></span> = &lt;&lt;<a href="#Anno_42_20" id="Anno_25_19" title="Defined at line 42, 44, 45, 46">Anno</a>+&gt; &lt;<a href="#StrategyDef_17_20" id="StrategyDef_25_27" title="Defined at line 17, 20, 27, 31">StrategyDef</a>&gt;&gt;

  <a href="#StrategyDef_15_9" id="StrategyDef_27_3" title="Referenced at line 15, 25">StrategyDef</a>.<span class="cons_Constructor"><span id="ExtSDefInl_27_15" title="Not referenced">ExtSDefInl</span></span> =
&lt;<span class="cons_String">external</span> &lt;<a href="#SId_34_15" id="SId_28_12" title="Defined at line 34, 37">SId</a>&gt;<span class="cons_String">(</span>&lt;{<a href="#Typedid_48_20" id="Typedid_28_19" title="Defined at line 48, 50">Typedid</a> <span class="cons_Lit">", "</span>}*&gt; <span class="cons_String">|</span> &lt;{<a href="#Typedid_48_20" id="Typedid_28_39" title="Defined at line 48, 50">Typedid</a> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">)</span> <span class="cons_String">=</span>
  &lt;<a href="#Strategy_53_20" id="Strategy_29_4" title="Defined at line 53, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 71, 78, 81, 84">Strategy</a>&gt;&gt;

  <a href="#StrategyDef_15_9" id="StrategyDef_31_3" title="Referenced at line 15, 25">StrategyDef</a>.<span class="cons_Constructor"><span id="ExtSDef_31_15" title="Not referenced">ExtSDef</span></span> =
    &lt;<span class="cons_String">external</span> &lt;<a href="#MaybeEmptySId_34_19" id="MaybeEmptySId_32_16" title="Defined at line 34, 39, 40">MaybeEmptySId</a>&gt;<span class="cons_String">(</span>&lt;{<a href="#Typedid_48_20" id="Typedid_32_33" title="Defined at line 48, 50">Typedid</a> <span class="cons_Lit">", "</span>}*&gt; <span class="cons_String">|</span> &lt;{<a href="#Typedid_48_20" id="Typedid_32_53" title="Defined at line 48, 50">Typedid</a> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">)</span>&gt;

<span class="keyword">lexical sorts</span> <button class="modal-open" id="SId_34_15" title="Multi-file references" data-urls="#SId_22_3 line 22, 28, 40, 69; ../../gradual-types/internal.sdf3/#SId_39_22 line 39; ../../gradual-types/modules.sdf3/#SId_9_28 line 9, 10, 11; ../../sugar/dynamic-rules.sdf3/#SId_31_7 line 31, 58, 59, 60, 65; ../../sugar/rules.sdf3/#SId_17_3 line 17, 24, 29, 35; ../../sugar/strategies.sdf3/#SId_18_3 line 18, 22, 28, 45">SId</button> <button class="modal-open" id="MaybeEmptySId_34_19" title="Multi-file references" data-urls="#MaybeEmptySId_32_16 line 32; ../../gradual-types/strategies.sdf3/#MaybeEmptySId_41_16 line 41, 44">MaybeEmptySId</button>
<span class="keyword">lexical syntax</span>
  <span class="layout">// indirection for highlighting</span>
  <button class="modal-open" id="SId_37_3" title="Multi-file references" data-urls="#SId_22_3 line 22, 28, 40, 69; ../../gradual-types/internal.sdf3/#SId_39_22 line 39; ../../gradual-types/modules.sdf3/#SId_9_28 line 9, 10, 11; ../../sugar/dynamic-rules.sdf3/#SId_31_7 line 31, 58, 59, 60, 65; ../../sugar/rules.sdf3/#SId_17_3 line 17, 24, 29, 35; ../../sugar/strategies.sdf3/#SId_18_3 line 18, 22, 28, 45">SId</button> = <a href="../identifiers.sdf3/#Id_16_15" id="Id_37_9" title="Defined at ../identifiers.sdf3 line 16, 21, 23, 43, 44, 45">Id</a>

  <button class="modal-open" id="MaybeEmptySId_39_3" title="Multi-file references" data-urls="#MaybeEmptySId_32_16 line 32; ../../gradual-types/strategies.sdf3/#MaybeEmptySId_41_16 line 41, 44">MaybeEmptySId</button> =
  <button class="modal-open" id="MaybeEmptySId_40_3" title="Multi-file references" data-urls="#MaybeEmptySId_32_16 line 32; ../../gradual-types/strategies.sdf3/#MaybeEmptySId_41_16 line 41, 44">MaybeEmptySId</button> = <a href="#SId_34_15" id="SId_40_19" title="Defined at line 34, 37">SId</a>

<span class="keyword">context-free sorts</span> <button class="modal-open" id="Anno_42_20" title="Multi-file references" data-urls="#Anno_25_19 line 25; ../../deduplicated.sdf3/#Anno_41_7 line 41; ../../sugar/rules.sdf3/#Anno_21_7 line 21">Anno</button>
<span class="keyword">context-free syntax</span>
  <button class="modal-open" id="Anno_44_3" title="Multi-file references" data-urls="#Anno_25_19 line 25; ../../deduplicated.sdf3/#Anno_41_7 line 41; ../../sugar/rules.sdf3/#Anno_21_7 line 21">Anno</button>.<span class="cons_Constructor"><span id="Extend_44_8" title="Not referenced">Extend</span></span> = &lt;<span class="cons_String">extend</span>&gt;
  <button class="modal-open" id="Anno_45_3" title="Multi-file references" data-urls="#Anno_25_19 line 25; ../../deduplicated.sdf3/#Anno_41_7 line 41; ../../sugar/rules.sdf3/#Anno_21_7 line 21">Anno</button>.<span class="cons_Constructor"><span id="Override_45_8" title="Not referenced">Override</span></span> = &lt;<span class="cons_String">override</span>&gt;
  <button class="modal-open" id="Anno_46_3" title="Multi-file references" data-urls="#Anno_25_19 line 25; ../../deduplicated.sdf3/#Anno_41_7 line 41; ../../sugar/rules.sdf3/#Anno_21_7 line 21">Anno</button>.<span class="cons_Constructor"><span id="Internal_46_8" title="Not referenced">Internal</span></span> = &lt;<span class="cons_String">internal</span>&gt;

<span class="keyword">context-free sorts</span> <button class="modal-open" id="Typedid_48_20" title="Multi-file references" data-urls="#Typedid_22_10 line 22, 28, 32; ../../sugar/dynamic-rules.sdf3/#Typedid_59_27 line 59, 60">Typedid</button>
<span class="keyword">context-free syntax</span>
  <button class="modal-open" id="Typedid_50_3" title="Multi-file references" data-urls="#Typedid_22_10 line 22, 28, 32; ../../sugar/dynamic-rules.sdf3/#Typedid_59_27 line 59, 60">Typedid</button>.<span class="cons_Constructor"><span id="VarDec_50_11" title="Not referenced">VarDec</span></span> = &lt;&lt;<a href="../terms.sdf3/#ID_7_20" id="ID_50_22" title="Defined at ../terms.sdf3 line 7, 10">ID</a>&gt; <span class="cons_String">:</span> &lt;<a href="../signatures.sdf3/#OldType_48_20" id="OldType_50_29" title="Defined at ../signatures.sdf3 line 48, 59, 60">OldType</a>&gt;&gt;


<span class="keyword">context-free sorts</span> <a href="#Strategy_23_4" id="Strategy_53_20" title="Referenced at line 23, 29, 57, 61, 62, 63, 64, 65, 66, 67, 75, 79, 82, 87, 88, 90, 91">Strategy</a> <button class="modal-open" id="SVar_53_29" title="Multi-file references" data-urls="#SVar_79_7 line 79; ../../sugar/strategies.sdf3/#SVar_39_17 line 39, 76">SVar</button>
<span class="keyword">context-free syntax</span>
  <a href="#Strategy_23_4" id="Strategy_55_3" title="Referenced at line 23, 29, 57, 61, 62, 63, 64, 65, 66, 67, 75, 79, 82, 87, 88, 90, 91">Strategy</a>.<span class="cons_Constructor"><span id="Fail_55_12" title="Not referenced">Fail</span></span>  = &lt;<span class="cons_String">fail</span>&gt;
  <a href="#Strategy_23_4" id="Strategy_56_3" title="Referenced at line 23, 29, 57, 61, 62, 63, 64, 65, 66, 67, 75, 79, 82, 87, 88, 90, 91">Strategy</a>.<span class="cons_Constructor"><span id="Id_56_12" title="Not referenced">Id</span></span>    = &lt;<span class="cons_String">id</span>&gt;
  <a href="#Strategy_23_4" id="Strategy_57_3" title="Referenced at line 23, 29, 57, 61, 62, 63, 64, 65, 66, 67, 75, 79, 82, 87, 88, 90, 91">Strategy</a>.<span class="cons_Constructor"><span id="ProceedT_57_12" title="Not referenced">ProceedT</span></span> = &lt;<span class="cons_String">proceed(</span>&lt;{<a href="#Strategy_53_20" id="Strategy_57_34" title="Defined at line 53, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 71, 78, 81, 84">Strategy</a> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">|</span>&lt;{<a href="../terms.sdf3/#Term_13_20" id="Term_57_53" title="Defined at ../terms.sdf3 line 13, 16, 17, 18, 19">Term</a> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">)</span>&gt;
  <a href="#Strategy_23_4" id="Strategy_58_3" title="Referenced at line 23, 29, 57, 61, 62, 63, 64, 65, 66, 67, 75, 79, 82, 87, 88, 90, 91">Strategy</a>.<span class="cons_Constructor"><span id="ProceedNoArgs_58_12" title="Not referenced">ProceedNoArgs</span></span> = &lt;<span class="cons_String">proceed</span>&gt;
  <a href="#Strategy_23_4" id="Strategy_59_3" title="Referenced at line 23, 29, 57, 61, 62, 63, 64, 65, 66, 67, 75, 79, 82, 87, 88, 90, 91">Strategy</a>.<span class="cons_Constructor"><button class="modal-open" id="Match_59_12" title="Multi-file references" data-urls="#Match_88_14 line 88; ../../sugar/strategies.sdf3/#Match_105_14 line 105, 124, 127">Match</button></span> = &lt;<span class="cons_String">?</span>&lt;<a href="../terms.sdf3/#Term_13_20" id="Term_59_23" title="Defined at ../terms.sdf3 line 13, 16, 17, 18, 19">Term</a>&gt;&gt;
  <a href="#Strategy_23_4" id="Strategy_60_3" title="Referenced at line 23, 29, 57, 61, 62, 63, 64, 65, 66, 67, 75, 79, 82, 87, 88, 90, 91">Strategy</a>.<span class="cons_Constructor"><button class="modal-open" id="Build_60_12" title="Multi-file references" data-urls="#Build_87_14 line 87; ../../sugar/strategies.sdf3/#Build_105_29 line 105, 124, 127">Build</button></span> = &lt;<span class="cons_String">!</span>&lt;<a href="../terms.sdf3/#Term_13_20" id="Term_60_23" title="Defined at ../terms.sdf3 line 13, 16, 17, 18, 19">Term</a>&gt;&gt;
  <a href="#Strategy_23_4" id="Strategy_61_3" title="Referenced at line 23, 29, 57, 61, 62, 63, 64, 65, 66, 67, 75, 79, 82, 87, 88, 90, 91">Strategy</a>.<span class="cons_Constructor"><span id="Scope_61_12" title="Not referenced">Scope</span></span> = &lt;<span class="cons_String">{</span>&lt;{<a href="../terms.sdf3/#ID_7_20" id="ID_61_24" title="Defined at ../terms.sdf3 line 7, 10">ID</a> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">:</span> &lt;<a href="#Strategy_53_20" id="Strategy_61_37" title="Defined at line 53, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 71, 78, 81, 84">Strategy</a>&gt; <span class="cons_String">}</span>&gt;
  <a href="#Strategy_23_4" id="Strategy_62_3" title="Referenced at line 23, 29, 57, 61, 62, 63, 64, 65, 66, 67, 75, 79, 82, 87, 88, 90, 91">Strategy</a>.<span class="cons_Constructor"><button class="modal-open" id="Seq_62_12" title="Multi-file references" data-urls="#Seq_90_12 line 90; ../../sugar/dynamic-rules.sdf3/#Seq_105_15 line 105; ../../sugar/strategies.sdf3/#Seq_108_12 line 108">Seq</button></span>   = &lt;&lt;<a href="#Strategy_53_20" id="Strategy_62_22" title="Defined at line 53, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 71, 78, 81, 84">Strategy</a>&gt;<span class="cons_String">;</span> &lt;<a href="#Strategy_53_20" id="Strategy_62_34" title="Defined at line 53, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 71, 78, 81, 84">Strategy</a>&gt;&gt; {<span class="keyword">right</span>}
  <a href="#Strategy_23_4" id="Strategy_63_3" title="Referenced at line 23, 29, 57, 61, 62, 63, 64, 65, 66, 67, 75, 79, 82, 87, 88, 90, 91">Strategy</a>.<span class="cons_Constructor"><button class="modal-open" id="GuardedLChoice_63_12" title="Multi-file references" data-urls="#GuardedLChoice_91_12 line 91; ../../sugar/strategies.sdf3/#GuardedLChoice_114_13 line 114, 136">GuardedLChoice</button></span> = [[<a href="#Strategy_53_20" id="Strategy_63_31" title="Defined at line 53, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 71, 78, 81, 84">Strategy</a>] <span class="cons_String">&lt;</span> [<a href="#Strategy_53_20" id="Strategy_63_44" title="Defined at line 53, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 71, 78, 81, 84">Strategy</a>] <span class="cons_String">+</span> [<a href="#Strategy_53_20" id="Strategy_63_57" title="Defined at line 53, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 71, 78, 81, 84">Strategy</a>]] {<span class="keyword">right</span>}
  <a href="#Strategy_23_4" id="Strategy_64_3" title="Referenced at line 23, 29, 57, 61, 62, 63, 64, 65, 66, 67, 75, 79, 82, 87, 88, 90, 91">Strategy</a>.<span class="cons_Constructor"><span id="PrimT_64_12" title="Not referenced">PrimT</span></span> = &lt;<span class="cons_String">prim(</span>&lt;<a href="../constants.sdf3/#String_3_24" id="String_64_27" title="Defined at ../constants.sdf3 line 3, 9">String</a>&gt;<span class="cons_String">,</span> &lt;{<a href="#Strategy_53_20" id="Strategy_64_38" title="Defined at line 53, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 71, 78, 81, 84">Strategy</a> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">|</span>&lt;{<a href="../terms.sdf3/#Term_13_20" id="Term_64_57" title="Defined at ../terms.sdf3 line 13, 16, 17, 18, 19">Term</a> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">)</span>&gt;
  <a href="#Strategy_23_4" id="Strategy_65_3" title="Referenced at line 23, 29, 57, 61, 62, 63, 64, 65, 66, 67, 75, 79, 82, 87, 88, 90, 91">Strategy</a>.<span class="cons_Constructor"><span id="Some_65_12" title="Not referenced">Some</span></span>  = &lt;<span class="cons_String">some(</span>&lt;<a href="#Strategy_53_20" id="Strategy_65_27" title="Defined at line 53, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 71, 78, 81, 84">Strategy</a>&gt;<span class="cons_String">)</span>&gt;
  <a href="#Strategy_23_4" id="Strategy_66_3" title="Referenced at line 23, 29, 57, 61, 62, 63, 64, 65, 66, 67, 75, 79, 82, 87, 88, 90, 91">Strategy</a>.<span class="cons_Constructor"><span id="One_66_12" title="Not referenced">One</span></span>   = &lt;<span class="cons_String">one(</span>&lt;<a href="#Strategy_53_20" id="Strategy_66_26" title="Defined at line 53, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 71, 78, 81, 84">Strategy</a>&gt;<span class="cons_String">)</span>&gt;
  <a href="#Strategy_23_4" id="Strategy_67_3" title="Referenced at line 23, 29, 57, 61, 62, 63, 64, 65, 66, 67, 75, 79, 82, 87, 88, 90, 91">Strategy</a>.<span class="cons_Constructor"><span id="All_67_12" title="Not referenced">All</span></span>   = &lt;<span class="cons_String">all(</span>&lt;<a href="#Strategy_53_20" id="Strategy_67_26" title="Defined at line 53, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 71, 78, 81, 84">Strategy</a>&gt;<span class="cons_String">)</span>&gt;

  <button class="modal-open" id="SVar_69_3" title="Multi-file references" data-urls="#SVar_79_7 line 79; ../../sugar/strategies.sdf3/#SVar_39_17 line 39, 76">SVar</button>.<span class="cons_Constructor"><span id="SVar_69_8" title="Not referenced">SVar</span></span> = <a href="#SId_34_15" id="SId_69_15" title="Defined at line 34, 37">SId</a>

  <a href="#Strategy_23_4" id="Strategy_71_3" title="Referenced at line 23, 29, 57, 61, 62, 63, 64, 65, 66, 67, 75, 79, 82, 87, 88, 90, 91">Strategy</a>.<span class="cons_Constructor"><span id="Let_71_12" title="Not referenced">Let</span></span> =
&lt;<span class="cons_String">let</span>
  &lt;{<a href="#Def_13_20" id="Def_73_5" title="Defined at line 13, 15, 25">Def</a> <span class="cons_Lit">"\n"</span>}*&gt;
<span class="cons_String">in</span>
  &lt;<a href="#Strategy_53_20" id="Strategy_75_4" title="Defined at line 53, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 71, 78, 81, 84">Strategy</a>&gt;
<span class="cons_String">end</span>&gt;

  <a href="#Strategy_23_4" id="Strategy_78_3" title="Referenced at line 23, 29, 57, 61, 62, 63, 64, 65, 66, 67, 75, 79, 82, 87, 88, 90, 91">Strategy</a>.<span class="cons_Constructor"><span id="CallT_78_12" title="Not referenced">CallT</span></span> =
    &lt;&lt;<a href="#SVar_53_29" id="SVar_79_7" title="Defined at line 53, 69">SVar</a>&gt;<span class="cons_String">(</span>&lt;{<a href="#Strategy_53_20" id="Strategy_79_15" title="Defined at line 53, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 71, 78, 81, 84">Strategy</a> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">|</span>&lt;{<a href="../terms.sdf3/#Term_13_20" id="Term_79_34" title="Defined at ../terms.sdf3 line 13, 16, 17, 18, 19">Term</a> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">)</span>&gt;

  <a href="#Strategy_23_4" id="Strategy_81_3" title="Referenced at line 23, 29, 57, 61, 62, 63, 64, 65, 66, 67, 75, 79, 82, 87, 88, 90, 91">Strategy</a>.<span class="cons_Constructor"><span id="CallDynamic_81_12" title="Not referenced">CallDynamic</span></span> =
    &lt;<span class="cons_String">call(</span>&lt;<a href="../terms.sdf3/#Term_13_20" id="Term_82_12" title="Defined at ../terms.sdf3 line 13, 16, 17, 18, 19">Term</a>&gt;<span class="cons_String">|</span>&lt;{<a href="#Strategy_53_20" id="Strategy_82_20" title="Defined at line 53, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 71, 78, 81, 84">Strategy</a> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">|</span>&lt;{<a href="../terms.sdf3/#Term_13_20" id="Term_82_39" title="Defined at ../terms.sdf3 line 13, 16, 17, 18, 19">Term</a> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">)</span>&gt; {<span class="keyword">deprecated</span>("Dynamic calls are not supported")}

  <a href="#Strategy_23_4" id="Strategy_84_3" title="Referenced at line 23, 29, 57, 61, 62, 63, 64, 65, 66, 67, 75, 79, 82, 87, 88, 90, 91">Strategy</a>.<span class="cons_Constructor"><span id="ImportTerm_84_12" title="Not referenced">ImportTerm</span></span> = &lt;<span class="cons_String">import-term(</span>&lt;<a href="../identifiers.sdf3/#ModName_3_15" id="ModName_84_39" title="Defined at ../identifiers.sdf3 line 3, 5, 10, 11, 12, 13, 14">ModName</a>&gt;<span class="cons_String">)</span>&gt;

<span class="keyword">context-free priorities</span>
  { <a href="#Strategy_53_20" id="Strategy_87_5" title="Defined at line 53, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 71, 78, 81, 84">Strategy</a>.<span class="cons_Constructor"><a href="#Build_60_12" id="Build_87_14" title="Defined at line 60">Build</a></span>
    <a href="#Strategy_53_20" id="Strategy_88_5" title="Defined at line 53, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 71, 78, 81, 84">Strategy</a>.<span class="cons_Constructor"><a href="#Match_59_12" id="Match_88_14" title="Defined at line 59">Match</a></span>
  }
&gt; <a href="#Strategy_53_20" id="Strategy_90_3" title="Defined at line 53, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 71, 78, 81, 84">Strategy</a>.<span class="cons_Constructor"><a href="#Seq_62_12" id="Seq_90_12" title="Defined at line 62">Seq</a></span>
&gt; <a href="#Strategy_53_20" id="Strategy_91_3" title="Defined at line 53, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 71, 78, 81, 84">Strategy</a>.<span class="cons_Constructor"><a href="#GuardedLChoice_63_12" id="GuardedLChoice_91_12" title="Defined at line 63">GuardedLChoice</a></span>

</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
