---
title: strategies-namespaced.sdf3
hide:
  - toc
---

# `strategies-namespaced.sdf3`



[pdmosses/stratego/stratego.lang/src-gen/syntax/StrategoLang/core/strategies-namespaced.sdf3]: https://github.com/pdmosses/stratego/blob/master/stratego.lang/src-gen/syntax/StrategoLang/core/strategies-namespaced.sdf3 "The source file on GitHub"

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
<td class="code"><pre><code><span class="keyword">module</span> <button class="modal-open" id="StrategoLang/core/strategies-namespaced_1_8" title="Multi-file references" data-urls="../main-namespaced.sdf3/#StrategoLang/core/strategies-namespaced_9_3 line 9; ../modules-namespaced.sdf3/#StrategoLang/core/strategies-namespaced_7_3 line 7; ../../deduplicated-namespaced.sdf3/#StrategoLang/core/strategies-namespaced_9_3 line 9; ../../gradual-types/internal-namespaced.sdf3/#StrategoLang/core/strategies-namespaced_7_3 line 7; ../../gradual-types/modules-namespaced.sdf3/#StrategoLang/core/strategies-namespaced_5_3 line 5; ../../gradual-types/strategies-namespaced.sdf3/#StrategoLang/core/strategies-namespaced_6_3 line 6; ../../sugar/dynamic-rules-namespaced.sdf3/#StrategoLang/core/strategies-namespaced_7_3 line 7; ../../sugar/modules-namespaced.sdf3/#StrategoLang/core/strategies-namespaced_5_3 line 5; ../../sugar/rules-namespaced.sdf3/#StrategoLang/core/strategies-namespaced_7_3 line 7; ../../sugar/strategies-namespaced.sdf3/#StrategoLang/core/strategies-namespaced_6_3 line 6">StrategoLang/core/strategies-namespaced</button>

<span class="keyword">imports</span>
  <a href="../terms-namespaced.sdf3/#StrategoLang/core/terms-namespaced_1_8" id="StrategoLang/core/terms-namespaced_4_3" title="Defined at ../terms-namespaced.sdf3 line 1">StrategoLang/core/terms-namespaced</a>        
  <a href="../constants-namespaced.sdf3/#StrategoLang/core/constants-namespaced_1_8" id="StrategoLang/core/constants-namespaced_5_3" title="Defined at ../constants-namespaced.sdf3 line 1">StrategoLang/core/constants-namespaced</a>        
  <a href="../signatures-namespaced.sdf3/#StrategoLang/core/signatures-namespaced_1_8" id="StrategoLang/core/signatures-namespaced_6_3" title="Defined at ../signatures-namespaced.sdf3 line 1">StrategoLang/core/signatures-namespaced</a>        
  <a href="../identifiers-namespaced.sdf3/#StrategoLang/core/identifiers-namespaced_1_8" id="StrategoLang/core/identifiers-namespaced_7_3" title="Defined at ../identifiers-namespaced.sdf3 line 1">StrategoLang/core/identifiers-namespaced</a>

<span class="keyword">template options</span>

  <span class="keyword">keyword</span> -/- [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\'\-\_]
  <span class="keyword">tokenize</span> : ")(|"

<span class="keyword">sorts</span> <a href="#StrategoLang-Def_73_5" id="StrategoLang-Def_14_7" title="Referenced at line 73">StrategoLang-Def</a>

<span class="keyword">context-free syntax</span>

  <a href="#StrategoLang-Def_73_5" id="StrategoLang-Def_18_3" title="Referenced at line 73">StrategoLang-Def</a> = <a href="#StrategoLang-StrategyDef_20_7" id="StrategoLang-StrategyDef_18_22" title="Defined at line 20, 24, 28, 30">StrategoLang-StrategyDef</a> { }

<span class="keyword">sorts</span> <a href="#StrategoLang-StrategyDef_18_22" id="StrategoLang-StrategyDef_20_7" title="Referenced at line 18, 27">StrategoLang-StrategyDef</a> <button class="modal-open" id="StrategoLang-SDefT_20_32" title="Multi-file references" data-urls="#StrategoLang-SDefT_24_30 line 24; ../../sugar/strategies-namespaced.sdf3/#StrategoLang-SDefT_28_24 line 28">StrategoLang-SDefT</button>

<span class="keyword">context-free syntax</span>

  <a href="#StrategoLang-StrategyDef_18_22" id="StrategoLang-StrategyDef_24_3" title="Referenced at line 18, 27">StrategoLang-StrategyDef</a> = <a href="#StrategoLang-SDefT_20_32" id="StrategoLang-SDefT_24_30" title="Defined at line 20, 25">StrategoLang-SDefT</a> { }
  <button class="modal-open" id="StrategoLang-SDefT_25_3" title="Multi-file references" data-urls="#StrategoLang-SDefT_24_30 line 24; ../../sugar/strategies-namespaced.sdf3/#StrategoLang-SDefT_28_24 line 28">StrategoLang-SDefT</button>.<span class="cons_Constructor"><span id="SDefT_25_22" title="Not referenced">SDefT</span></span> = &lt;&lt;<a href="#StrategoLang-SId_36_3" id="StrategoLang-SId_25_32" title="Defined at line 36">StrategoLang-SId</a>&gt;<span class="cons_String">(</span>&lt;{<a href="#StrategoLang-Typedid_48_7" id="StrategoLang-Typedid_25_52" title="Defined at line 48, 52">StrategoLang-Typedid</a> <span class="cons_Lit">", "</span>}*&gt; <span class="cons_String">|</span> &lt;{<a href="#StrategoLang-Typedid_48_7" id="StrategoLang-Typedid_25_85" title="Defined at line 48, 52">StrategoLang-Typedid</a> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">)</span> <span class="cons_String">=</span>
  &lt;<a href="#StrategoLang-Strategy_54_7" id="StrategoLang-Strategy_26_4" title="Defined at line 54, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 72, 77, 78, 79">StrategoLang-Strategy</a>&gt;&gt; { }
  <a href="#StrategoLang-Def_73_5" id="StrategoLang-Def_27_3" title="Referenced at line 73">StrategoLang-Def</a>.<span class="cons_Constructor"><span id="AnnoDef_27_20" title="Not referenced">AnnoDef</span></span> = &lt;&lt;<a href="#StrategoLang-Anno_40_7" id="StrategoLang-Anno_27_32" title="Defined at line 40, 44, 45, 46">StrategoLang-Anno</a>+&gt; &lt;<a href="#StrategoLang-StrategyDef_20_7" id="StrategoLang-StrategyDef_27_53" title="Defined at line 20, 24, 28, 30">StrategoLang-StrategyDef</a>&gt;&gt; { }
  <a href="#StrategoLang-StrategyDef_18_22" id="StrategoLang-StrategyDef_28_3" title="Referenced at line 18, 27">StrategoLang-StrategyDef</a>.<span class="cons_Constructor"><span id="ExtSDefInl_28_28" title="Not referenced">ExtSDefInl</span></span> = &lt;<span class="cons_String">external</span> &lt;<a href="#StrategoLang-SId_36_3" id="StrategoLang-SId_28_52" title="Defined at line 36">StrategoLang-SId</a>&gt;<span class="cons_String">(</span>&lt;{<a href="#StrategoLang-Typedid_48_7" id="StrategoLang-Typedid_28_72" title="Defined at line 48, 52">StrategoLang-Typedid</a> <span class="cons_Lit">", "</span>}*&gt; <span class="cons_String">|</span> &lt;{<a href="#StrategoLang-Typedid_48_7" id="StrategoLang-Typedid_28_105" title="Defined at line 48, 52">StrategoLang-Typedid</a> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">)</span> <span class="cons_String">=</span>
  &lt;<a href="#StrategoLang-Strategy_54_7" id="StrategoLang-Strategy_29_4" title="Defined at line 54, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 72, 77, 78, 79">StrategoLang-Strategy</a>&gt;&gt; { }
  <a href="#StrategoLang-StrategyDef_18_22" id="StrategoLang-StrategyDef_30_3" title="Referenced at line 18, 27">StrategoLang-StrategyDef</a>.<span class="cons_Constructor"><span id="ExtSDef_30_28" title="Not referenced">ExtSDef</span></span> = &lt;<span class="cons_String">external</span> &lt;<a href="#StrategoLang-MaybeEmptySId_37_3" id="StrategoLang-MaybeEmptySId_30_49" title="Defined at line 37, 38">StrategoLang-MaybeEmptySId</a>&gt;<span class="cons_String">(</span>&lt;{<a href="#StrategoLang-Typedid_48_7" id="StrategoLang-Typedid_30_79" title="Defined at line 48, 52">StrategoLang-Typedid</a> <span class="cons_Lit">", "</span>}*&gt; <span class="cons_String">|</span> &lt;{<a href="#StrategoLang-Typedid_48_7" id="StrategoLang-Typedid_30_112" title="Defined at line 48, 52">StrategoLang-Typedid</a> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">)</span>&gt; { }

<span class="keyword">sorts</span> <span id="SId_32_7" title="Not referenced">SId</span><span class="keyword">-LEX</span> <span id="MaybeEmptySId_32_15" title="Not referenced">MaybeEmptySId</span><span class="keyword">-LEX</span>

<span class="keyword">lexical syntax</span>

  <button class="modal-open" id="StrategoLang-SId_36_3" title="Multi-file references" data-urls="#StrategoLang-SId_25_32 line 25, 28, 38, 71; ../../gradual-types/internal-namespaced.sdf3/#StrategoLang-SId_40_35 line 40; ../../gradual-types/modules-namespaced.sdf3/#StrategoLang-SId_10_41 line 10, 11, 12; ../../sugar/dynamic-rules-namespaced.sdf3/#StrategoLang-SId_30_45 line 30, 48, 49, 50, 56; ../../sugar/rules-namespaced.sdf3/#StrategoLang-SId_19_39 line 19, 22, 25, 28; ../../sugar/strategies-namespaced.sdf3/#StrategoLang-SId_21_43 line 21, 23, 26, 44">StrategoLang-SId</button> = <a href="../identifiers-namespaced.sdf3/#StrategoLang-Id_27_3" id="StrategoLang-Id_36_22" title="Defined at ../identifiers-namespaced.sdf3 line 27, 29, 49, 50, 51">StrategoLang-Id</a> { }
  <button class="modal-open" id="StrategoLang-MaybeEmptySId_37_3" title="Multi-file references" data-urls="#StrategoLang-MaybeEmptySId_30_49 line 30; ../../gradual-types/strategies-namespaced.sdf3/#StrategoLang-MaybeEmptySId_35_53 line 35, 36">StrategoLang-MaybeEmptySId</button> = { }
  <button class="modal-open" id="StrategoLang-MaybeEmptySId_38_3" title="Multi-file references" data-urls="#StrategoLang-MaybeEmptySId_30_49 line 30; ../../gradual-types/strategies-namespaced.sdf3/#StrategoLang-MaybeEmptySId_35_53 line 35, 36">StrategoLang-MaybeEmptySId</button> = <a href="#StrategoLang-SId_36_3" id="StrategoLang-SId_38_32" title="Defined at line 36">StrategoLang-SId</a> { }

<span class="keyword">sorts</span> <button class="modal-open" id="StrategoLang-Anno_40_7" title="Multi-file references" data-urls="#StrategoLang-Anno_27_32 line 27; ../../deduplicated-namespaced.sdf3/#StrategoLang-Anno_35_32 line 35; ../../sugar/rules-namespaced.sdf3/#StrategoLang-Anno_21_36 line 21">StrategoLang-Anno</button>

<span class="keyword">context-free syntax</span>

  <button class="modal-open" id="StrategoLang-Anno_44_3" title="Multi-file references" data-urls="#StrategoLang-Anno_27_32 line 27; ../../deduplicated-namespaced.sdf3/#StrategoLang-Anno_35_32 line 35; ../../sugar/rules-namespaced.sdf3/#StrategoLang-Anno_21_36 line 21">StrategoLang-Anno</button>.<span class="cons_Constructor"><span id="Extend_44_21" title="Not referenced">Extend</span></span> = &lt;<span class="cons_String">extend</span>&gt; { }
  <button class="modal-open" id="StrategoLang-Anno_45_3" title="Multi-file references" data-urls="#StrategoLang-Anno_27_32 line 27; ../../deduplicated-namespaced.sdf3/#StrategoLang-Anno_35_32 line 35; ../../sugar/rules-namespaced.sdf3/#StrategoLang-Anno_21_36 line 21">StrategoLang-Anno</button>.<span class="cons_Constructor"><span id="Override_45_21" title="Not referenced">Override</span></span> = &lt;<span class="cons_String">override</span>&gt; { }
  <button class="modal-open" id="StrategoLang-Anno_46_3" title="Multi-file references" data-urls="#StrategoLang-Anno_27_32 line 27; ../../deduplicated-namespaced.sdf3/#StrategoLang-Anno_35_32 line 35; ../../sugar/rules-namespaced.sdf3/#StrategoLang-Anno_21_36 line 21">StrategoLang-Anno</button>.<span class="cons_Constructor"><span id="Internal_46_21" title="Not referenced">Internal</span></span> = &lt;<span class="cons_String">internal</span>&gt; { }

<span class="keyword">sorts</span> <button class="modal-open" id="StrategoLang-Typedid_48_7" title="Multi-file references" data-urls="#StrategoLang-Typedid_25_52 line 25, 28, 30; ../../sugar/dynamic-rules-namespaced.sdf3/#StrategoLang-Typedid_49_53 line 49, 50; ../../sugar/rules-namespaced.sdf3/#StrategoLang-Typedid_22_53 line 22, 25, 28">StrategoLang-Typedid</button>

<span class="keyword">context-free syntax</span>

  <button class="modal-open" id="StrategoLang-Typedid_52_3" title="Multi-file references" data-urls="#StrategoLang-Typedid_25_52 line 25, 28, 30; ../../sugar/dynamic-rules-namespaced.sdf3/#StrategoLang-Typedid_49_53 line 49, 50; ../../sugar/rules-namespaced.sdf3/#StrategoLang-Typedid_22_53 line 22, 25, 28">StrategoLang-Typedid</button>.<span class="cons_Constructor"><span id="VarDec_52_24" title="Not referenced">VarDec</span></span> = &lt;&lt;StrategoLang-ID&gt; <span class="cons_String">:</span> &lt;<a href="../signatures-namespaced.sdf3/#StrategoLang-OldType_52_7" id="StrategoLang-OldType_52_55" title="Defined at ../signatures-namespaced.sdf3 line 52, 62, 63">StrategoLang-OldType</a>&gt;&gt; { }

<span class="keyword">sorts</span> <button class="modal-open" id="StrategoLang-Strategy_54_7" title="Multi-file references" data-urls="#StrategoLang-Strategy_26_4 line 26, 29, 60, 64, 65, 66, 67, 68, 69, 70, 75, 77, 78, 83, 84; ../../sugar/rules-namespaced.sdf3/#StrategoLang-Strategy_39_4 line 39, 41">StrategoLang-Strategy</button> <button class="modal-open" id="StrategoLang-SVar_54_29" title="Multi-file references" data-urls="#StrategoLang-SVar_77_35 line 77; ../../sugar/strategies-namespaced.sdf3/#StrategoLang-SVar_39_30 line 39, 72">StrategoLang-SVar</button>

<span class="keyword">context-free syntax</span>

  <button class="modal-open" id="StrategoLang-Strategy_58_3" title="Multi-file references" data-urls="#StrategoLang-Strategy_26_4 line 26, 29, 60, 64, 65, 66, 67, 68, 69, 70, 75, 77, 78, 83, 84; ../../sugar/rules-namespaced.sdf3/#StrategoLang-Strategy_39_4 line 39, 41">StrategoLang-Strategy</button>.<span class="cons_Constructor"><span id="Fail_58_25" title="Not referenced">Fail</span></span> = &lt;<span class="cons_String">fail</span>&gt; { }
  <button class="modal-open" id="StrategoLang-Strategy_59_3" title="Multi-file references" data-urls="#StrategoLang-Strategy_26_4 line 26, 29, 60, 64, 65, 66, 67, 68, 69, 70, 75, 77, 78, 83, 84; ../../sugar/rules-namespaced.sdf3/#StrategoLang-Strategy_39_4 line 39, 41">StrategoLang-Strategy</button>.<span class="cons_Constructor"><span id="Id_59_25" title="Not referenced">Id</span></span> = &lt;<span class="cons_String">id</span>&gt; { }
  <button class="modal-open" id="StrategoLang-Strategy_60_3" title="Multi-file references" data-urls="#StrategoLang-Strategy_26_4 line 26, 29, 60, 64, 65, 66, 67, 68, 69, 70, 75, 77, 78, 83, 84; ../../sugar/rules-namespaced.sdf3/#StrategoLang-Strategy_39_4 line 39, 41">StrategoLang-Strategy</button>.<span class="cons_Constructor"><span id="ProceedT_60_25" title="Not referenced">ProceedT</span></span> = &lt;<span class="cons_String">proceed(</span>&lt;{<a href="#StrategoLang-Strategy_54_7" id="StrategoLang-Strategy_60_47" title="Defined at line 54, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 72, 77, 78, 79">StrategoLang-Strategy</a> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">|</span>&lt;{StrategoLang-Term <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">)</span>&gt; { }
  <button class="modal-open" id="StrategoLang-Strategy_61_3" title="Multi-file references" data-urls="#StrategoLang-Strategy_26_4 line 26, 29, 60, 64, 65, 66, 67, 68, 69, 70, 75, 77, 78, 83, 84; ../../sugar/rules-namespaced.sdf3/#StrategoLang-Strategy_39_4 line 39, 41">StrategoLang-Strategy</button>.<span class="cons_Constructor"><span id="ProceedNoArgs_61_25" title="Not referenced">ProceedNoArgs</span></span> = &lt;<span class="cons_String">proceed</span>&gt; { }
  <button class="modal-open" id="StrategoLang-Strategy_62_3" title="Multi-file references" data-urls="#StrategoLang-Strategy_26_4 line 26, 29, 60, 64, 65, 66, 67, 68, 69, 70, 75, 77, 78, 83, 84; ../../sugar/rules-namespaced.sdf3/#StrategoLang-Strategy_39_4 line 39, 41">StrategoLang-Strategy</button>.<span class="cons_Constructor"><button class="modal-open" id="Match_62_25" title="Multi-file references" data-urls="#Match_84_26 line 84; ../../sugar/strategies-namespaced.sdf3/#Match_99_64 line 99, 108, 113">Match</button></span> = &lt;<span class="cons_String">?</span>&lt;StrategoLang-Term&gt;&gt; { }
  <button class="modal-open" id="StrategoLang-Strategy_63_3" title="Multi-file references" data-urls="#StrategoLang-Strategy_26_4 line 26, 29, 60, 64, 65, 66, 67, 68, 69, 70, 75, 77, 78, 83, 84; ../../sugar/rules-namespaced.sdf3/#StrategoLang-Strategy_39_4 line 39, 41">StrategoLang-Strategy</button>.<span class="cons_Constructor"><button class="modal-open" id="Build_63_25" title="Multi-file references" data-urls="#Build_83_26 line 83; ../../sugar/strategies-namespaced.sdf3/#Build_100_64 line 100, 109, 114">Build</button></span> = &lt;<span class="cons_String">!</span>&lt;StrategoLang-Term&gt;&gt; { }
  <button class="modal-open" id="StrategoLang-Strategy_64_3" title="Multi-file references" data-urls="#StrategoLang-Strategy_26_4 line 26, 29, 60, 64, 65, 66, 67, 68, 69, 70, 75, 77, 78, 83, 84; ../../sugar/rules-namespaced.sdf3/#StrategoLang-Strategy_39_4 line 39, 41">StrategoLang-Strategy</button>.<span class="cons_Constructor"><span id="Scope_64_25" title="Not referenced">Scope</span></span> = &lt;<span class="cons_String">{</span>&lt;{StrategoLang-ID <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">:</span> &lt;<a href="#StrategoLang-Strategy_54_7" id="StrategoLang-Strategy_64_63" title="Defined at line 54, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 72, 77, 78, 79">StrategoLang-Strategy</a>&gt; <span class="cons_String">}</span>&gt; { }
  <button class="modal-open" id="StrategoLang-Strategy_65_3" title="Multi-file references" data-urls="#StrategoLang-Strategy_26_4 line 26, 29, 60, 64, 65, 66, 67, 68, 69, 70, 75, 77, 78, 83, 84; ../../sugar/rules-namespaced.sdf3/#StrategoLang-Strategy_39_4 line 39, 41">StrategoLang-Strategy</button>.<span class="cons_Constructor"><button class="modal-open" id="Seq_65_25" title="Multi-file references" data-urls="#Seq_84_57 line 84; ../../sugar/dynamic-rules-namespaced.sdf3/#Seq_76_245 line 76; ../../sugar/strategies-namespaced.sdf3/#Seq_100_149 line 100">Seq</button></span> = &lt;&lt;<a href="#StrategoLang-Strategy_54_7" id="StrategoLang-Strategy_65_33" title="Defined at line 54, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 72, 77, 78, 79">StrategoLang-Strategy</a>&gt;<span class="cons_String">;</span> &lt;<a href="#StrategoLang-Strategy_54_7" id="StrategoLang-Strategy_65_58" title="Defined at line 54, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 72, 77, 78, 79">StrategoLang-Strategy</a>&gt;&gt; {<span class="keyword">right</span>}
  <button class="modal-open" id="StrategoLang-Strategy_66_3" title="Multi-file references" data-urls="#StrategoLang-Strategy_26_4 line 26, 29, 60, 64, 65, 66, 67, 68, 69, 70, 75, 77, 78, 83, 84; ../../sugar/rules-namespaced.sdf3/#StrategoLang-Strategy_39_4 line 39, 41">StrategoLang-Strategy</button>.<span class="cons_Constructor"><button class="modal-open" id="GuardedLChoice_66_25" title="Multi-file references" data-urls="#GuardedLChoice_84_85 line 84; ../../sugar/strategies-namespaced.sdf3/#GuardedLChoice_104_27 line 104, 121">GuardedLChoice</button></span> = [[<a href="#StrategoLang-Strategy_54_7" id="StrategoLang-Strategy_66_44" title="Defined at line 54, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 72, 77, 78, 79">StrategoLang-Strategy</a>] <span class="cons_String">&lt;</span> [<a href="#StrategoLang-Strategy_54_7" id="StrategoLang-Strategy_66_70" title="Defined at line 54, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 72, 77, 78, 79">StrategoLang-Strategy</a>] <span class="cons_String">+</span> [<a href="#StrategoLang-Strategy_54_7" id="StrategoLang-Strategy_66_96" title="Defined at line 54, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 72, 77, 78, 79">StrategoLang-Strategy</a>]] {<span class="keyword">right</span>}
  <button class="modal-open" id="StrategoLang-Strategy_67_3" title="Multi-file references" data-urls="#StrategoLang-Strategy_26_4 line 26, 29, 60, 64, 65, 66, 67, 68, 69, 70, 75, 77, 78, 83, 84; ../../sugar/rules-namespaced.sdf3/#StrategoLang-Strategy_39_4 line 39, 41">StrategoLang-Strategy</button>.<span class="cons_Constructor"><span id="PrimT_67_25" title="Not referenced">PrimT</span></span> = &lt;<span class="cons_String">prim(</span>&lt;<a href="../constants-namespaced.sdf3/#StrategoLang-String_10_3" id="StrategoLang-String_67_40" title="Defined at ../constants-namespaced.sdf3 line 10">StrategoLang-String</a>&gt;<span class="cons_String">,</span> &lt;{<a href="#StrategoLang-Strategy_54_7" id="StrategoLang-Strategy_67_64" title="Defined at line 54, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 72, 77, 78, 79">StrategoLang-Strategy</a> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">|</span>&lt;{StrategoLang-Term <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">)</span>&gt; { }
  <button class="modal-open" id="StrategoLang-Strategy_68_3" title="Multi-file references" data-urls="#StrategoLang-Strategy_26_4 line 26, 29, 60, 64, 65, 66, 67, 68, 69, 70, 75, 77, 78, 83, 84; ../../sugar/rules-namespaced.sdf3/#StrategoLang-Strategy_39_4 line 39, 41">StrategoLang-Strategy</button>.<span class="cons_Constructor"><span id="Some_68_25" title="Not referenced">Some</span></span> = &lt;<span class="cons_String">some(</span>&lt;<a href="#StrategoLang-Strategy_54_7" id="StrategoLang-Strategy_68_39" title="Defined at line 54, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 72, 77, 78, 79">StrategoLang-Strategy</a>&gt;<span class="cons_String">)</span>&gt; { }
  <button class="modal-open" id="StrategoLang-Strategy_69_3" title="Multi-file references" data-urls="#StrategoLang-Strategy_26_4 line 26, 29, 60, 64, 65, 66, 67, 68, 69, 70, 75, 77, 78, 83, 84; ../../sugar/rules-namespaced.sdf3/#StrategoLang-Strategy_39_4 line 39, 41">StrategoLang-Strategy</button>.<span class="cons_Constructor"><span id="One_69_25" title="Not referenced">One</span></span> = &lt;<span class="cons_String">one(</span>&lt;<a href="#StrategoLang-Strategy_54_7" id="StrategoLang-Strategy_69_37" title="Defined at line 54, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 72, 77, 78, 79">StrategoLang-Strategy</a>&gt;<span class="cons_String">)</span>&gt; { }
  <button class="modal-open" id="StrategoLang-Strategy_70_3" title="Multi-file references" data-urls="#StrategoLang-Strategy_26_4 line 26, 29, 60, 64, 65, 66, 67, 68, 69, 70, 75, 77, 78, 83, 84; ../../sugar/rules-namespaced.sdf3/#StrategoLang-Strategy_39_4 line 39, 41">StrategoLang-Strategy</button>.<span class="cons_Constructor"><span id="All_70_25" title="Not referenced">All</span></span> = &lt;<span class="cons_String">all(</span>&lt;<a href="#StrategoLang-Strategy_54_7" id="StrategoLang-Strategy_70_37" title="Defined at line 54, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 72, 77, 78, 79">StrategoLang-Strategy</a>&gt;<span class="cons_String">)</span>&gt; { }
  <button class="modal-open" id="StrategoLang-SVar_71_3" title="Multi-file references" data-urls="#StrategoLang-SVar_77_35 line 77; ../../sugar/strategies-namespaced.sdf3/#StrategoLang-SVar_39_30 line 39, 72">StrategoLang-SVar</button>.<span class="cons_Constructor"><span id="SVar_71_21" title="Not referenced">SVar</span></span> = <a href="#StrategoLang-SId_36_3" id="StrategoLang-SId_71_28" title="Defined at line 36">StrategoLang-SId</a> { }
  <button class="modal-open" id="StrategoLang-Strategy_72_3" title="Multi-file references" data-urls="#StrategoLang-Strategy_26_4 line 26, 29, 60, 64, 65, 66, 67, 68, 69, 70, 75, 77, 78, 83, 84; ../../sugar/rules-namespaced.sdf3/#StrategoLang-Strategy_39_4 line 39, 41">StrategoLang-Strategy</button>.<span class="cons_Constructor"><span id="Let_72_25" title="Not referenced">Let</span></span> = &lt;<span class="cons_String">let</span>
  &lt;{<a href="#StrategoLang-Def_14_7" id="StrategoLang-Def_73_5" title="Defined at line 14, 18, 27">StrategoLang-Def</a> <span class="cons_Lit">"\n"</span>}*&gt;
<span class="cons_String">in</span>
  &lt;<a href="#StrategoLang-Strategy_54_7" id="StrategoLang-Strategy_75_4" title="Defined at line 54, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 72, 77, 78, 79">StrategoLang-Strategy</a>&gt;
<span class="cons_String">end</span>&gt; { }
  <button class="modal-open" id="StrategoLang-Strategy_77_3" title="Multi-file references" data-urls="#StrategoLang-Strategy_26_4 line 26, 29, 60, 64, 65, 66, 67, 68, 69, 70, 75, 77, 78, 83, 84; ../../sugar/rules-namespaced.sdf3/#StrategoLang-Strategy_39_4 line 39, 41">StrategoLang-Strategy</button>.<span class="cons_Constructor"><span id="CallT_77_25" title="Not referenced">CallT</span></span> = &lt;&lt;<a href="#StrategoLang-SVar_54_29" id="StrategoLang-SVar_77_35" title="Defined at line 54, 71">StrategoLang-SVar</a>&gt;<span class="cons_String">(</span>&lt;{<a href="#StrategoLang-Strategy_54_7" id="StrategoLang-Strategy_77_56" title="Defined at line 54, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 72, 77, 78, 79">StrategoLang-Strategy</a> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">|</span>&lt;{StrategoLang-Term <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">)</span>&gt; { }
  <button class="modal-open" id="StrategoLang-Strategy_78_3" title="Multi-file references" data-urls="#StrategoLang-Strategy_26_4 line 26, 29, 60, 64, 65, 66, 67, 68, 69, 70, 75, 77, 78, 83, 84; ../../sugar/rules-namespaced.sdf3/#StrategoLang-Strategy_39_4 line 39, 41">StrategoLang-Strategy</button>.<span class="cons_Constructor"><span id="CallDynamic_78_25" title="Not referenced">CallDynamic</span></span> = &lt;<span class="cons_String">call(</span>&lt;StrategoLang-Term&gt;<span class="cons_String">|</span>&lt;{<a href="#StrategoLang-Strategy_54_7" id="StrategoLang-Strategy_78_67" title="Defined at line 54, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 72, 77, 78, 79">StrategoLang-Strategy</a> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">|</span>&lt;{StrategoLang-Term <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">)</span>&gt; {<span class="keyword">deprecated</span>("Dynamic calls are not supported")}
  <button class="modal-open" id="StrategoLang-Strategy_79_3" title="Multi-file references" data-urls="#StrategoLang-Strategy_26_4 line 26, 29, 60, 64, 65, 66, 67, 68, 69, 70, 75, 77, 78, 83, 84; ../../sugar/rules-namespaced.sdf3/#StrategoLang-Strategy_39_4 line 39, 41">StrategoLang-Strategy</button>.<span class="cons_Constructor"><span id="ImportTerm_79_25" title="Not referenced">ImportTerm</span></span> = &lt;<span class="cons_String">import-term(</span>&lt;<a href="../identifiers-namespaced.sdf3/#StrategoLang-ModName_8_3" id="StrategoLang-ModName_79_52" title="Defined at ../identifiers-namespaced.sdf3 line 8, 17, 18, 19, 20, 21">StrategoLang-ModName</a>&gt;<span class="cons_String">)</span>&gt; { }

<span class="keyword">context-free priorities</span>

  {<a href="#StrategoLang-Strategy_54_7" id="StrategoLang-Strategy_83_4" title="Defined at line 54, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 72, 77, 78, 79">StrategoLang-Strategy</a>.<span class="cons_Constructor"><a href="#Build_63_25" id="Build_83_26" title="Defined at line 63">Build</a></span>
   <a href="#StrategoLang-Strategy_54_7" id="StrategoLang-Strategy_84_4" title="Defined at line 54, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 72, 77, 78, 79">StrategoLang-Strategy</a>.<span class="cons_Constructor"><a href="#Match_62_25" id="Match_84_26" title="Defined at line 62">Match</a></span>} &gt; <a href="#StrategoLang-Strategy_54_7" id="StrategoLang-Strategy_84_35" title="Defined at line 54, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 72, 77, 78, 79">StrategoLang-Strategy</a>.<span class="cons_Constructor"><a href="#Seq_65_25" id="Seq_84_57" title="Defined at line 65">Seq</a></span> &gt; <a href="#StrategoLang-Strategy_54_7" id="StrategoLang-Strategy_84_63" title="Defined at line 54, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 72, 77, 78, 79">StrategoLang-Strategy</a>.<span class="cons_Constructor"><a href="#GuardedLChoice_66_25" id="GuardedLChoice_84_85" title="Defined at line 66">GuardedLChoice</a></span>

</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
