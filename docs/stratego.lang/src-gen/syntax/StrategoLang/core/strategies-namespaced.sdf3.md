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
<td class="code"><pre><code><span class="keyword">module</span> <a href="../../sugar/strategies-namespaced.sdf3#StrategoLang/core/strategies-namespaced_145_184" id="StrategoLang/core/strategies-namespaced_7_46" title="Referenced at ../../sugar/strategies-namespaced.sdf3 line 6">StrategoLang/core/strategies-namespaced</a>

<span class="keyword">imports</span>
  <a href="../terms-namespaced.sdf3#StrategoLang/core/terms-namespaced_7_41" id="StrategoLang/core/terms-namespaced_58_92" title="Defined at ../terms-namespaced.sdf3 line 1">StrategoLang/core/terms-namespaced</a>        
  <a href="../constants-namespaced.sdf3#StrategoLang/core/constants-namespaced_7_45" id="StrategoLang/core/constants-namespaced_96_134" title="Defined at ../constants-namespaced.sdf3 line 1">StrategoLang/core/constants-namespaced</a>        
  <a href="../signatures-namespaced.sdf3#StrategoLang/core/signatures-namespaced_7_46" id="StrategoLang/core/signatures-namespaced_138_177" title="Defined at ../signatures-namespaced.sdf3 line 1">StrategoLang/core/signatures-namespaced</a>        
  <a href="../identifiers-namespaced.sdf3#StrategoLang/core/identifiers-namespaced_7_47" id="StrategoLang/core/identifiers-namespaced_181_221" title="Defined at ../identifiers-namespaced.sdf3 line 1">StrategoLang/core/identifiers-namespaced</a>

<span class="keyword">template options</span>

  <span class="keyword">keyword</span> -/- [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\'\-\_]
  <span class="keyword">tokenize</span> : ")(|"

<span class="keyword">sorts</span> <a href="#StrategoLang-Def_2696_2712" id="StrategoLang-Def_299_315" title="Referenced at line 73">StrategoLang-Def</a>

<span class="keyword">context-free syntax</span>

  <a href="#StrategoLang-Def_2696_2712" id="StrategoLang-Def_340_356" title="Referenced at line 73">StrategoLang-Def</a> = <a href="#StrategoLang-StrategyDef_395_419" id="StrategoLang-StrategyDef_359_383" title="Defined at line 20, 24, 28, 30">StrategoLang-StrategyDef</a> { }

<span class="keyword">sorts</span> <a href="#StrategoLang-StrategyDef_712_736" id="StrategoLang-StrategyDef_395_419" title="Referenced at line 27">StrategoLang-StrategyDef</a> <a href="#StrategoLang-SDefT_490_508" id="StrategoLang-SDefT_420_438" title="Referenced at line 24; ../../sugar/strategies-namespaced.sdf3 line 28">StrategoLang-SDefT</a>

<span class="keyword">context-free syntax</span>

  <a href="#StrategoLang-StrategyDef_712_736" id="StrategoLang-StrategyDef_463_487" title="Referenced at line 27">StrategoLang-StrategyDef</a> = <a href="#StrategoLang-SDefT_420_438" id="StrategoLang-SDefT_490_508" title="Defined at line 20, 25">StrategoLang-SDefT</a> { }
  <a href="#StrategoLang-SDefT_490_508" id="StrategoLang-SDefT_515_533" title="Referenced at line 24; ../../sugar/strategies-namespaced.sdf3 line 28">StrategoLang-SDefT</a>.<span class="cons_Constructor"><span id="SDefT_534_539" title="Not referenced locally, nor via imports">SDefT</span></span> = &lt;&lt;<a href="#StrategoLang-SId_1108_1124" id="StrategoLang-SId_544_560" title="Defined at line 36">StrategoLang-SId</a>&gt;<span class="cons_String">(</span>&lt;{<a href="#StrategoLang-Typedid_1422_1442" id="StrategoLang-Typedid_564_584" title="Defined at line 48, 52">StrategoLang-Typedid</a> <span class="cons_Lit">", "</span>}*&gt; <span class="cons_String">|</span> &lt;{<a href="#StrategoLang-Typedid_1422_1442" id="StrategoLang-Typedid_597_617" title="Defined at line 48, 52">StrategoLang-Typedid</a> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">)</span> <span class="cons_String">=</span>
  &lt;<a href="#StrategoLang-Strategy_1553_1574" id="StrategoLang-Strategy_632_653" title="Defined at line 54, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 72, 77, 78, 79">StrategoLang-Strategy</a>&gt;&gt; { }
  <a href="#StrategoLang-Def_2696_2712" id="StrategoLang-Def_662_678" title="Referenced at line 73">StrategoLang-Def</a>.<span class="cons_Constructor"><span id="AnnoDef_679_686" title="Not referenced locally, nor via imports">AnnoDef</span></span> = &lt;&lt;<a href="#StrategoLang-Anno_1241_1258" id="StrategoLang-Anno_691_708" title="Defined at line 40, 44, 45, 46">StrategoLang-Anno</a>+&gt; &lt;<a href="#StrategoLang-StrategyDef_395_419" id="StrategoLang-StrategyDef_712_736" title="Defined at line 20, 24, 28, 30">StrategoLang-StrategyDef</a>&gt;&gt; { }
  <a href="#StrategoLang-StrategyDef_712_736" id="StrategoLang-StrategyDef_745_769" title="Referenced at line 27">StrategoLang-StrategyDef</a>.<span class="cons_Constructor"><span id="ExtSDefInl_770_780" title="Not referenced locally, nor via imports">ExtSDefInl</span></span> = &lt;<span class="cons_String">external</span> &lt;<a href="#StrategoLang-SId_1108_1124" id="StrategoLang-SId_794_810" title="Defined at line 36">StrategoLang-SId</a>&gt;<span class="cons_String">(</span>&lt;{<a href="#StrategoLang-Typedid_1422_1442" id="StrategoLang-Typedid_814_834" title="Defined at line 48, 52">StrategoLang-Typedid</a> <span class="cons_Lit">", "</span>}*&gt; <span class="cons_String">|</span> &lt;{<a href="#StrategoLang-Typedid_1422_1442" id="StrategoLang-Typedid_847_867" title="Defined at line 48, 52">StrategoLang-Typedid</a> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">)</span> <span class="cons_String">=</span>
  &lt;<a href="#StrategoLang-Strategy_1553_1574" id="StrategoLang-Strategy_882_903" title="Defined at line 54, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 72, 77, 78, 79">StrategoLang-Strategy</a>&gt;&gt; { }
  <a href="#StrategoLang-StrategyDef_712_736" id="StrategoLang-StrategyDef_912_936" title="Referenced at line 27">StrategoLang-StrategyDef</a>.<span class="cons_Constructor"><span id="ExtSDef_937_944" title="Not referenced locally, nor via imports">ExtSDef</span></span> = &lt;<span class="cons_String">external</span> &lt;<a href="#StrategoLang-MaybeEmptySId_1149_1175" id="StrategoLang-MaybeEmptySId_958_984" title="Defined at line 37, 38">StrategoLang-MaybeEmptySId</a>&gt;<span class="cons_String">(</span>&lt;{<a href="#StrategoLang-Typedid_1422_1442" id="StrategoLang-Typedid_988_1008" title="Defined at line 48, 52">StrategoLang-Typedid</a> <span class="cons_Lit">", "</span>}*&gt; <span class="cons_String">|</span> &lt;{<a href="#StrategoLang-Typedid_1422_1442" id="StrategoLang-Typedid_1021_1041" title="Defined at line 48, 52">StrategoLang-Typedid</a> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">)</span>&gt; { }

<span class="keyword">sorts</span> <span id="SId_1063_1066" title="Not referenced locally, nor via imports">SId</span><span class="keyword">-LEX</span> <span id="MaybeEmptySId_1071_1084" title="Not referenced locally, nor via imports">MaybeEmptySId</span><span class="keyword">-LEX</span>

<span class="keyword">lexical syntax</span>

  <a href="#StrategoLang-SId_2636_2652" id="StrategoLang-SId_1108_1124" title="Referenced at line 71; ../../gradual-types/internal-namespaced.sdf3 line 40; ../../gradual-types/modules-namespaced.sdf3 line 12; ../../sugar/dynamic-rules-namespaced.sdf3 line 56; ../../sugar/rules-namespaced.sdf3 line 28; ../../sugar/strategies-namespaced.sdf3 line 44">StrategoLang-SId</a> = <a href="../identifiers-namespaced.sdf3#StrategoLang-Id_645_660" id="StrategoLang-Id_1127_1142" title="Defined at ../identifiers-namespaced.sdf3 line 27, 29, 49, 50, 51">StrategoLang-Id</a> { }
  <a href="#StrategoLang-MaybeEmptySId_958_984" id="StrategoLang-MaybeEmptySId_1149_1175" title="Referenced at line 30; ../../gradual-types/strategies-namespaced.sdf3 line 36">StrategoLang-MaybeEmptySId</a> = { }
  <a href="#StrategoLang-MaybeEmptySId_958_984" id="StrategoLang-MaybeEmptySId_1184_1210" title="Referenced at line 30; ../../gradual-types/strategies-namespaced.sdf3 line 36">StrategoLang-MaybeEmptySId</a> = <a href="#StrategoLang-SId_1108_1124" id="StrategoLang-SId_1213_1229" title="Defined at line 36">StrategoLang-SId</a> { }

<span class="keyword">sorts</span> <a href="#StrategoLang-Anno_691_708" id="StrategoLang-Anno_1241_1258" title="Referenced at line 27; ../../deduplicated-namespaced.sdf3 line 35; ../../sugar/rules-namespaced.sdf3 line 21">StrategoLang-Anno</a>

<span class="keyword">context-free syntax</span>

  <a href="#StrategoLang-Anno_691_708" id="StrategoLang-Anno_1283_1300" title="Referenced at line 27; ../../deduplicated-namespaced.sdf3 line 35; ../../sugar/rules-namespaced.sdf3 line 21">StrategoLang-Anno</a>.<span class="cons_Constructor"><span id="Extend_1301_1307" title="Not referenced locally, nor via imports">Extend</span></span> = &lt;<span class="cons_String">extend</span>&gt; { }
  <a href="#StrategoLang-Anno_691_708" id="StrategoLang-Anno_1325_1342" title="Referenced at line 27; ../../deduplicated-namespaced.sdf3 line 35; ../../sugar/rules-namespaced.sdf3 line 21">StrategoLang-Anno</a>.<span class="cons_Constructor"><span id="Override_1343_1351" title="Not referenced locally, nor via imports">Override</span></span> = &lt;<span class="cons_String">override</span>&gt; { }
  <a href="#StrategoLang-Anno_691_708" id="StrategoLang-Anno_1371_1388" title="Referenced at line 27; ../../deduplicated-namespaced.sdf3 line 35; ../../sugar/rules-namespaced.sdf3 line 21">StrategoLang-Anno</a>.<span class="cons_Constructor"><span id="Internal_1389_1397" title="Not referenced locally, nor via imports">Internal</span></span> = &lt;<span class="cons_String">internal</span>&gt; { }

<span class="keyword">sorts</span> <a href="#StrategoLang-Typedid_1021_1041" id="StrategoLang-Typedid_1422_1442" title="Referenced at line 30; ../../sugar/dynamic-rules-namespaced.sdf3 line 50; ../../sugar/rules-namespaced.sdf3 line 28">StrategoLang-Typedid</a>

<span class="keyword">context-free syntax</span>

  <a href="#StrategoLang-Typedid_1021_1041" id="StrategoLang-Typedid_1467_1487" title="Referenced at line 30; ../../sugar/dynamic-rules-namespaced.sdf3 line 50; ../../sugar/rules-namespaced.sdf3 line 28">StrategoLang-Typedid</a>.<span class="cons_Constructor"><span id="VarDec_1488_1494" title="Not referenced locally, nor via imports">VarDec</span></span> = &lt;&lt;StrategoLang-ID&gt; <span class="cons_String">:</span> &lt;<a href="../signatures-namespaced.sdf3#StrategoLang-OldType_1897_1917" id="StrategoLang-OldType_1519_1539" title="Defined at ../signatures-namespaced.sdf3 line 52, 62, 63">StrategoLang-OldType</a>&gt;&gt; { }

<span class="keyword">sorts</span> <a href="#StrategoLang-Strategy_3250_3271" id="StrategoLang-Strategy_1553_1574" title="Referenced at line 84; ../../sugar/rules-namespaced.sdf3 line 41">StrategoLang-Strategy</a> <a href="#StrategoLang-SVar_2793_2810" id="StrategoLang-SVar_1575_1592" title="Referenced at line 77; ../../sugar/strategies-namespaced.sdf3 line 72">StrategoLang-SVar</a>

<span class="keyword">context-free syntax</span>

  <a href="#StrategoLang-Strategy_3250_3271" id="StrategoLang-Strategy_1617_1638" title="Referenced at line 84; ../../sugar/rules-namespaced.sdf3 line 41">StrategoLang-Strategy</a>.<span class="cons_Constructor"><span id="Fail_1639_1643" title="Not referenced locally, nor via imports">Fail</span></span> = &lt;<span class="cons_String">fail</span>&gt; { }
  <a href="#StrategoLang-Strategy_3250_3271" id="StrategoLang-Strategy_1659_1680" title="Referenced at line 84; ../../sugar/rules-namespaced.sdf3 line 41">StrategoLang-Strategy</a>.<span class="cons_Constructor"><span id="Id_1681_1683" title="Not referenced locally, nor via imports">Id</span></span> = &lt;<span class="cons_String">id</span>&gt; { }
  <a href="#StrategoLang-Strategy_3250_3271" id="StrategoLang-Strategy_1697_1718" title="Referenced at line 84; ../../sugar/rules-namespaced.sdf3 line 41">StrategoLang-Strategy</a>.<span class="cons_Constructor"><span id="ProceedT_1719_1727" title="Not referenced locally, nor via imports">ProceedT</span></span> = &lt;<span class="cons_String">proceed(</span>&lt;{<a href="#StrategoLang-Strategy_1553_1574" id="StrategoLang-Strategy_1741_1762" title="Defined at line 54, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 72, 77, 78, 79">StrategoLang-Strategy</a> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">|</span>&lt;{StrategoLang-Term <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">)</span>&gt; { }
  <a href="#StrategoLang-Strategy_3250_3271" id="StrategoLang-Strategy_1807_1828" title="Referenced at line 84; ../../sugar/rules-namespaced.sdf3 line 41">StrategoLang-Strategy</a>.<span class="cons_Constructor"><span id="ProceedNoArgs_1829_1842" title="Not referenced locally, nor via imports">ProceedNoArgs</span></span> = &lt;<span class="cons_String">proceed</span>&gt; { }
  <a href="#StrategoLang-Strategy_3250_3271" id="StrategoLang-Strategy_1861_1882" title="Referenced at line 84; ../../sugar/rules-namespaced.sdf3 line 41">StrategoLang-Strategy</a>.<span class="cons_Constructor"><a href="#Match_3213_3218" id="Match_1883_1888" title="Referenced at line 84; ../../sugar/strategies-namespaced.sdf3 line 113">Match</a></span> = &lt;<span class="cons_String">?</span>&lt;StrategoLang-Term&gt;&gt; { }
  <a href="#StrategoLang-Strategy_3250_3271" id="StrategoLang-Strategy_1920_1941" title="Referenced at line 84; ../../sugar/rules-namespaced.sdf3 line 41">StrategoLang-Strategy</a>.<span class="cons_Constructor"><a href="#Build_3182_3187" id="Build_1942_1947" title="Referenced at line 83; ../../sugar/strategies-namespaced.sdf3 line 114">Build</a></span> = &lt;<span class="cons_String">!</span>&lt;StrategoLang-Term&gt;&gt; { }
  <a href="#StrategoLang-Strategy_3250_3271" id="StrategoLang-Strategy_1979_2000" title="Referenced at line 84; ../../sugar/rules-namespaced.sdf3 line 41">StrategoLang-Strategy</a>.<span class="cons_Constructor"><span id="Scope_2001_2006" title="Not referenced locally, nor via imports">Scope</span></span> = &lt;<span class="cons_String">{</span>&lt;{StrategoLang-ID <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">:</span> &lt;<a href="#StrategoLang-Strategy_1553_1574" id="StrategoLang-Strategy_2039_2060" title="Defined at line 54, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 72, 77, 78, 79">StrategoLang-Strategy</a>&gt; <span class="cons_String">}</span>&gt; { }
  <a href="#StrategoLang-Strategy_3250_3271" id="StrategoLang-Strategy_2071_2092" title="Referenced at line 84; ../../sugar/rules-namespaced.sdf3 line 41">StrategoLang-Strategy</a>.<span class="cons_Constructor"><a href="#Seq_3244_3247" id="Seq_2093_2096" title="Referenced at line 84; ../../sugar/dynamic-rules-namespaced.sdf3 line 76; ../../sugar/strategies-namespaced.sdf3 line 100">Seq</a></span> = &lt;&lt;<a href="#StrategoLang-Strategy_1553_1574" id="StrategoLang-Strategy_2101_2122" title="Defined at line 54, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 72, 77, 78, 79">StrategoLang-Strategy</a>&gt;<span class="cons_String">;</span> &lt;<a href="#StrategoLang-Strategy_1553_1574" id="StrategoLang-Strategy_2126_2147" title="Defined at line 54, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 72, 77, 78, 79">StrategoLang-Strategy</a>&gt;&gt; {<span class="keyword">right</span>}
  <a href="#StrategoLang-Strategy_3250_3271" id="StrategoLang-Strategy_2160_2181" title="Referenced at line 84; ../../sugar/rules-namespaced.sdf3 line 41">StrategoLang-Strategy</a>.<span class="cons_Constructor"><a href="#GuardedLChoice_3272_3286" id="GuardedLChoice_2182_2196" title="Referenced at line 84; ../../sugar/strategies-namespaced.sdf3 line 121">GuardedLChoice</a></span> = [[<a href="#StrategoLang-Strategy_1553_1574" id="StrategoLang-Strategy_2201_2222" title="Defined at line 54, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 72, 77, 78, 79">StrategoLang-Strategy</a>] <span class="cons_String">&lt;</span> [<a href="#StrategoLang-Strategy_1553_1574" id="StrategoLang-Strategy_2227_2248" title="Defined at line 54, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 72, 77, 78, 79">StrategoLang-Strategy</a>] <span class="cons_String">+</span> [<a href="#StrategoLang-Strategy_1553_1574" id="StrategoLang-Strategy_2253_2274" title="Defined at line 54, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 72, 77, 78, 79">StrategoLang-Strategy</a>]] {<span class="keyword">right</span>}
  <a href="#StrategoLang-Strategy_3250_3271" id="StrategoLang-Strategy_2287_2308" title="Referenced at line 84; ../../sugar/rules-namespaced.sdf3 line 41">StrategoLang-Strategy</a>.<span class="cons_Constructor"><span id="PrimT_2309_2314" title="Not referenced locally, nor via imports">PrimT</span></span> = &lt;<span class="cons_String">prim(</span>&lt;<a href="../constants-namespaced.sdf3#StrategoLang-String_202_221" id="StrategoLang-String_2324_2343" title="Defined at ../constants-namespaced.sdf3 line 10">StrategoLang-String</a>&gt;<span class="cons_String">,</span> &lt;{<a href="#StrategoLang-Strategy_1553_1574" id="StrategoLang-Strategy_2348_2369" title="Defined at line 54, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 72, 77, 78, 79">StrategoLang-Strategy</a> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">|</span>&lt;{StrategoLang-Term <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">)</span>&gt; { }
  <a href="#StrategoLang-Strategy_3250_3271" id="StrategoLang-Strategy_2414_2435" title="Referenced at line 84; ../../sugar/rules-namespaced.sdf3 line 41">StrategoLang-Strategy</a>.<span class="cons_Constructor"><span id="Some_2436_2440" title="Not referenced locally, nor via imports">Some</span></span> = &lt;<span class="cons_String">some(</span>&lt;<a href="#StrategoLang-Strategy_1553_1574" id="StrategoLang-Strategy_2450_2471" title="Defined at line 54, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 72, 77, 78, 79">StrategoLang-Strategy</a>&gt;<span class="cons_String">)</span>&gt; { }
  <a href="#StrategoLang-Strategy_3250_3271" id="StrategoLang-Strategy_2481_2502" title="Referenced at line 84; ../../sugar/rules-namespaced.sdf3 line 41">StrategoLang-Strategy</a>.<span class="cons_Constructor"><span id="One_2503_2506" title="Not referenced locally, nor via imports">One</span></span> = &lt;<span class="cons_String">one(</span>&lt;<a href="#StrategoLang-Strategy_1553_1574" id="StrategoLang-Strategy_2515_2536" title="Defined at line 54, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 72, 77, 78, 79">StrategoLang-Strategy</a>&gt;<span class="cons_String">)</span>&gt; { }
  <a href="#StrategoLang-Strategy_3250_3271" id="StrategoLang-Strategy_2546_2567" title="Referenced at line 84; ../../sugar/rules-namespaced.sdf3 line 41">StrategoLang-Strategy</a>.<span class="cons_Constructor"><span id="All_2568_2571" title="Not referenced locally, nor via imports">All</span></span> = &lt;<span class="cons_String">all(</span>&lt;<a href="#StrategoLang-Strategy_1553_1574" id="StrategoLang-Strategy_2580_2601" title="Defined at line 54, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 72, 77, 78, 79">StrategoLang-Strategy</a>&gt;<span class="cons_String">)</span>&gt; { }
  <a href="#StrategoLang-SVar_2793_2810" id="StrategoLang-SVar_2611_2628" title="Referenced at line 77; ../../sugar/strategies-namespaced.sdf3 line 72">StrategoLang-SVar</a>.<span class="cons_Constructor"><span id="SVar_2629_2633" title="Not referenced locally, nor via imports">SVar</span></span> = <a href="#StrategoLang-SId_1108_1124" id="StrategoLang-SId_2636_2652" title="Defined at line 36">StrategoLang-SId</a> { }
  <a href="#StrategoLang-Strategy_3250_3271" id="StrategoLang-Strategy_2659_2680" title="Referenced at line 84; ../../sugar/rules-namespaced.sdf3 line 41">StrategoLang-Strategy</a>.<span class="cons_Constructor"><span id="Let_2681_2684" title="Not referenced locally, nor via imports">Let</span></span> = &lt;<span class="cons_String">let</span>
  &lt;{<a href="#StrategoLang-Def_299_315" id="StrategoLang-Def_2696_2712" title="Defined at line 14, 18, 27">StrategoLang-Def</a> <span class="cons_Lit">"\n"</span>}*&gt;
<span class="cons_String">in</span>
  &lt;<a href="#StrategoLang-Strategy_1553_1574" id="StrategoLang-Strategy_2727_2748" title="Defined at line 54, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 72, 77, 78, 79">StrategoLang-Strategy</a>&gt;
<span class="cons_String">end</span>&gt; { }
  <a href="#StrategoLang-Strategy_3250_3271" id="StrategoLang-Strategy_2761_2782" title="Referenced at line 84; ../../sugar/rules-namespaced.sdf3 line 41">StrategoLang-Strategy</a>.<span class="cons_Constructor"><span id="CallT_2783_2788" title="Not referenced locally, nor via imports">CallT</span></span> = &lt;&lt;<a href="#StrategoLang-SVar_1575_1592" id="StrategoLang-SVar_2793_2810" title="Defined at line 54, 71">StrategoLang-SVar</a>&gt;<span class="cons_String">(</span>&lt;{<a href="#StrategoLang-Strategy_1553_1574" id="StrategoLang-Strategy_2814_2835" title="Defined at line 54, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 72, 77, 78, 79">StrategoLang-Strategy</a> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">|</span>&lt;{StrategoLang-Term <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">)</span>&gt; { }
  <a href="#StrategoLang-Strategy_3250_3271" id="StrategoLang-Strategy_2880_2901" title="Referenced at line 84; ../../sugar/rules-namespaced.sdf3 line 41">StrategoLang-Strategy</a>.<span class="cons_Constructor"><span id="CallDynamic_2902_2913" title="Not referenced locally, nor via imports">CallDynamic</span></span> = &lt;<span class="cons_String">call(</span>&lt;StrategoLang-Term&gt;<span class="cons_String">|</span>&lt;{<a href="#StrategoLang-Strategy_1553_1574" id="StrategoLang-Strategy_2944_2965" title="Defined at line 54, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 72, 77, 78, 79">StrategoLang-Strategy</a> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">|</span>&lt;{StrategoLang-Term <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">)</span>&gt; {<span class="keyword">deprecated</span>("Dynamic calls are not supported")}
  <a href="#StrategoLang-Strategy_3250_3271" id="StrategoLang-Strategy_3054_3075" title="Referenced at line 84; ../../sugar/rules-namespaced.sdf3 line 41">StrategoLang-Strategy</a>.<span class="cons_Constructor"><span id="ImportTerm_3076_3086" title="Not referenced locally, nor via imports">ImportTerm</span></span> = &lt;<span class="cons_String">import-term(</span>&lt;<a href="../identifiers-namespaced.sdf3#StrategoLang-ModName_103_123" id="StrategoLang-ModName_3103_3123" title="Defined at ../identifiers-namespaced.sdf3 line 8, 17, 18, 19, 20, 21">StrategoLang-ModName</a>&gt;<span class="cons_String">)</span>&gt; { }

<span class="keyword">context-free priorities</span>

  {<a href="#StrategoLang-Strategy_1553_1574" id="StrategoLang-Strategy_3160_3181" title="Defined at line 54, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 72, 77, 78, 79">StrategoLang-Strategy</a>.<span class="cons_Constructor"><a href="#Build_1942_1947" id="Build_3182_3187" title="Defined at line 63">Build</a></span>
   <a href="#StrategoLang-Strategy_1553_1574" id="StrategoLang-Strategy_3191_3212" title="Defined at line 54, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 72, 77, 78, 79">StrategoLang-Strategy</a>.<span class="cons_Constructor"><a href="#Match_1883_1888" id="Match_3213_3218" title="Defined at line 62">Match</a></span>} &gt; <a href="#StrategoLang-Strategy_1553_1574" id="StrategoLang-Strategy_3222_3243" title="Defined at line 54, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 72, 77, 78, 79">StrategoLang-Strategy</a>.<span class="cons_Constructor"><a href="#Seq_2093_2096" id="Seq_3244_3247" title="Defined at line 65">Seq</a></span> &gt; <a href="#StrategoLang-Strategy_1553_1574" id="StrategoLang-Strategy_3250_3271" title="Defined at line 54, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 72, 77, 78, 79">StrategoLang-Strategy</a>.<span class="cons_Constructor"><a href="#GuardedLChoice_2182_2196" id="GuardedLChoice_3272_3286" title="Defined at line 66">GuardedLChoice</a></span>

</code></pre></td></tr></tbody></table></div>