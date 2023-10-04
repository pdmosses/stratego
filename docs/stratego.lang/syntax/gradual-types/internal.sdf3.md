---
title: internal.sdf3
hide:
  - toc
---

# `internal.sdf3`

:simple-github: [pdmosses/stratego/stratego.lang/syntax/gradual-types/internal.sdf3]

[pdmosses/stratego/stratego.lang/syntax/gradual-types/internal.sdf3]: https://github.com/pdmosses/stratego/blob/master/stratego.lang/syntax/gradual-types/internal.sdf3 "The source file on GitHub"

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
92
93
94
95
96
97
98
99
100
101
102
103
104
105
106
107
108
109
110
111
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <span id="gradual-types/internal_7_29" title="Not referenced locally, nor via imports">gradual-types/internal</span>

<span class="keyword">imports</span>
  <a href="../../core/identifiers.sdf3#core/identifiers_7_23" id="core/identifiers_41_57" title="Defined at ../../core/identifiers.sdf3 line 1">core/identifiers</a>
  <a href="../../core/constants.sdf3#core/constants_7_21" id="core/constants_60_74" title="Defined at ../../core/constants.sdf3 line 1">core/constants</a>
  <a href="../../core/modules.sdf3#core/modules_7_19" id="core/modules_77_89" title="Defined at ../../core/modules.sdf3 line 1">core/modules</a>
  <a href="../../core/strategies.sdf3#core/strategies_7_22" id="core/strategies_92_107" title="Defined at ../../core/strategies.sdf3 line 1">core/strategies</a>
  <a href="../signatures.sdf3#gradual-types/signatures_7_31" id="gradual-types/signatures_110_134" title="Defined at ../signatures.sdf3 line 1">gradual-types/signatures</a>

<span class="keyword">context-free sorts</span> <span id="Str2Lib_155_162" title="Not referenced locally, nor via imports">Str2Lib</span> <a href="#Str2LibComponent_255_271" id="Str2LibComponent_163_179" title="Referenced at line 14">Str2LibComponent</a> <span id="Anno_180_184" title="Not referenced locally, nor via imports">Anno</span>
<span class="keyword">context-free syntax</span>

  <span id="Str2Lib_208_215" title="Not referenced locally, nor via imports">Str2Lib</span>.<span class="cons_Constructor"><span id="Str2Lib_216_223" title="Not referenced locally, nor via imports">Str2Lib</span></span> = [<span class="cons_String">library</span> [<a href="../../core/identifiers.sdf3#ModNamePart_47_58" id="ModNamePart_236_247" title="Defined at ../../core/identifiers.sdf3 line 3, 6">ModNamePart</a>]
    [{<a href="#Str2LibComponent_163_179" id="Str2LibComponent_255_271" title="Defined at line 10, 18, 19">Str2LibComponent</a> <span class="cons_Lit">"\n"</span>}+]
    [{<a href="../../core/modules.sdf3#Module_118_124" id="Module_286_292" title="Defined at ../../core/modules.sdf3 line 9, 12, 17">Module</a> <span class="cons_Lit">"\n\n"</span>}+]
  ]

  <a href="#Str2LibComponent_255_271" id="Str2LibComponent_310_326" title="Referenced at line 14">Str2LibComponent</a>.<span class="cons_Constructor"><span id="Maven_327_332" title="Not referenced locally, nor via imports">Maven</span></span> = [<span class="cons_String">maven</span> [<span class="cons_Unquoted"><span id="groupId_343_350" title="Not referenced locally, nor via imports">groupId</span></span>:<a href="#JavaId_539_545" id="JavaId_351_357" title="Defined at line 23, 30">JavaId</a>]<span class="cons_String">:</span>[<span class="cons_Unquoted"><span id="id_360_362" title="Not referenced locally, nor via imports">id</span></span>:<a href="#JavaId_539_545" id="JavaId_363_369" title="Defined at line 23, 30">JavaId</a>]<span class="cons_String">:</span>[<a href="#MavenVersion_514_526" id="MavenVersion_372_384" title="Defined at line 23, 26">MavenVersion</a>]]
  <a href="#Str2LibComponent_255_271" id="Str2LibComponent_389_405" title="Referenced at line 14">Str2LibComponent</a>.<span class="cons_Constructor"><span id="Package_406_413" title="Not referenced locally, nor via imports">Package</span></span> = [<span class="cons_String">package</span> [<a href="#PackageName_527_538" id="PackageName_426_437" title="Defined at line 23, 29">PackageName</a>]]

  <span id="Anno_443_447" title="Not referenced locally, nor via imports">Anno</span>.<span class="cons_Constructor"><span id="Overlay_448_455" title="Not referenced locally, nor via imports">Overlay</span></span> = [<span class="cons_String">overlay</span>]

<span class="keyword">lexical sorts</span> <a href="#VersionNumber_615_628" id="VersionNumber_483_496" title="Referenced at line 26">VersionNumber</a> <a href="#VersionQualifier_809_825" id="VersionQualifier_497_513" title="Referenced at line 34">VersionQualifier</a> <a href="#MavenVersion_372_384" id="MavenVersion_514_526" title="Referenced at line 18">MavenVersion</a> <a href="#PackageName_426_437" id="PackageName_527_538" title="Referenced at line 19">PackageName</a> <a href="#JavaId_730_736" id="JavaId_539_545" title="Referenced at line 29">JavaId</a>
<span class="keyword">lexical syntax</span>

  <a href="#MavenVersion_372_384" id="MavenVersion_564_576" title="Referenced at line 18">MavenVersion</a> = <a href="#VersionNumber_483_496" id="VersionNumber_579_592" title="Defined at line 23, 27">VersionNumber</a> <span class="cons_Lit">"."</span> <a href="#VersionNumber_483_496" id="VersionNumber_597_610" title="Defined at line 23, 27">VersionNumber</a> <span class="cons_Lit">"."</span> <a href="#VersionNumber_483_496" id="VersionNumber_615_628" title="Defined at line 23, 27">VersionNumber</a> <a href="#VersionQualifier_497_513" id="VersionQualifier_629_645" title="Defined at line 23, 28">VersionQualifier</a>
  <a href="#VersionNumber_615_628" id="VersionNumber_648_661" title="Referenced at line 26">VersionNumber</a> = [<span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>]+
  <a href="#VersionQualifier_809_825" id="VersionQualifier_673_689" title="Referenced at line 34">VersionQualifier</a> = <span class="cons_Lit">"-"</span> [<span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\-\.]+
  <a href="#PackageName_426_437" id="PackageName_715_726" title="Referenced at line 19">PackageName</a> = {<a href="#JavaId_539_545" id="JavaId_730_736" title="Defined at line 23, 30">JavaId</a> <span class="cons_Lit">"."</span>}+
  <a href="#JavaId_730_736" id="JavaId_745_751" title="Referenced at line 29">JavaId</a> = [<span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">a</span>-<span class="cons_Regular">z</span>\_\$] [<span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\_\$]+

<span class="keyword">lexical restrictions</span>

  <a href="#VersionQualifier_497_513" id="VersionQualifier_809_825" title="Defined at line 23, 28">VersionQualifier</a> -/- [<span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\-\.]

<span class="keyword">context-free sorts</span> <span id="ConstrType_866_876" title="Not referenced locally, nor via imports">ConstrType</span>
<span class="keyword">context-free syntax</span>

  <span id="Def_900_903" title="Not referenced locally, nor via imports">Def</span>.<span class="cons_Constructor"><span id="DefHasType_904_914" title="Not referenced locally, nor via imports">DefHasType</span></span> = [[<a href="../../core/strategies.sdf3#SId_686_689" id="SId_919_922" title="Defined at ../../core/strategies.sdf3 line 34, 37">SId</a>] <span class="cons_String">::</span> [<a href="../signatures.sdf3#SFunType_844_852" id="SFunType_928_936" title="Defined at ../signatures.sdf3 line 32, 40, 41, 42">SFunType</a>]]

  <a href="#Type_5469_5473" id="Type_942_946" title="Referenced at line 104">Type</a>.<span class="cons_Constructor"><span id="IllFormedTermT_947_961" title="Not referenced locally, nor via imports">IllFormedTermT</span></span> = [[<a href="../../core/identifiers.sdf3#Id_420_422" id="Id_966_968" title="Defined at ../../core/identifiers.sdf3 line 16, 21, 23, 43, 44, 45">Id</a>]<span class="cons_String">#(</span>[{<a href="#Type_942_946" id="Type_973_977" title="Defined at line 41, 42">Type</a> <span class="cons_Lit">", "</span>}*]<span class="cons_String">)</span>]
  <a href="#Type_5469_5473" id="Type_990_994" title="Referenced at line 104">Type</a>.<span class="cons_Constructor"><span id="EmptyT_995_1001" title="Not referenced locally, nor via imports">EmptyT</span></span> = [<span class="cons_String">empty</span>]
  <span id="Anno_1014_1018" title="Not referenced locally, nor via imports">Anno</span>.<span class="cons_Constructor"><span id="LocalDef_1019_1027" title="Not referenced locally, nor via imports">LocalDef</span></span> = [<span class="cons_String">localdef</span>]
  <span id="Anno_1043_1047" title="Not referenced locally, nor via imports">Anno</span>.<span class="cons_Constructor"><span id="AmbiguousStrategyResolution_1048_1075" title="Not referenced locally, nor via imports">AmbiguousStrategyResolution</span></span> = [<span class="cons_String">ambiguous</span> <span class="cons_String">strategy</span> <span class="cons_String">resolves</span> <span class="cons_String">to</span> <span class="cons_String">arities:</span> [<a href="../../core/constants.sdf3#Int_37_40" id="Int_1120_1123" title="Defined at ../../core/constants.sdf3 line 3, 5">Int</a>]<span class="cons_String">,</span> [<a href="../../core/constants.sdf3#Int_37_40" id="Int_1127_1130" title="Defined at ../../core/constants.sdf3 line 3, 5">Int</a>]]
  <a href="#SType_3332_3337" id="SType_1135_1140" title="Referenced at line 76">SType</a>.<span class="cons_Constructor"><span id="SEmptyT_1141_1148" title="Not referenced locally, nor via imports">SEmptyT</span></span> = [<span class="cons_String">s-empty</span>]
  <span id="Dyn_1163_1166" title="Not referenced locally, nor via imports">Dyn</span> = <a href="#Type_942_946" id="Type_1169_1173" title="Defined at line 41, 42">Type</a> <span class="layout">// to allow DynT(&lt;some type&gt;)</span>

  <span id="ConstrType_1207_1217" title="Not referenced locally, nor via imports">ConstrType</span>.<span class="cons_Constructor"><span id="ConstrType_1218_1228" title="Not referenced locally, nor via imports">ConstrType</span></span> = [[{<a href="#Type_942_946" id="Type_1234_1238" title="Defined at line 41, 42">Type</a> <span class="cons_Lit">" * "</span>}+] <span class="cons_String">-&gt;</span> [<a href="#Type_942_946" id="Type_1252_1256" title="Defined at line 41, 42">Type</a>]]

<span class="keyword">context-free sorts</span> <span id="ErrorDesc_1279_1288" title="Not referenced locally, nor via imports">ErrorDesc</span> <span id="MessageType_1289_1300" title="Not referenced locally, nor via imports">MessageType</span>
<span class="keyword">context-free syntax</span>
  <span id="MessageType_1323_1334" title="Not referenced locally, nor via imports">MessageType</span>.<span class="cons_Constructor"><span id="MTError_1335_1342" title="Not referenced locally, nor via imports">MTError</span></span> = [<span class="cons_String">error</span>]
  <span id="MessageType_1355_1366" title="Not referenced locally, nor via imports">MessageType</span>.<span class="cons_Constructor"><span id="MTWarning_1367_1376" title="Not referenced locally, nor via imports">MTWarning</span></span> = [<span class="cons_String">warning</span>]
  <span id="MessageType_1391_1402" title="Not referenced locally, nor via imports">MessageType</span>.<span class="cons_Constructor"><span id="MTNote_1403_1409" title="Not referenced locally, nor via imports">MTNote</span></span> = [<span class="cons_String">note</span>]

  <span id="ErrorDesc_1422_1431" title="Not referenced locally, nor via imports">ErrorDesc</span>.<span class="cons_Constructor"><span id="CallDynamicNotSupported_1432_1455" title="Not referenced locally, nor via imports">CallDynamicNotSupported</span></span> = [<span class="cons_String">The</span> <span class="cons_String">dynamic</span> <span class="cons_String">`call(name|sargs|targs)`</span> <span class="cons_String">construct</span> <span class="cons_String">is</span> <span class="cons_String">no</span> <span class="cons_String">longer</span> <span class="cons_String">supported.</span>]
  <span id="ErrorDesc_1533_1542" title="Not referenced locally, nor via imports">ErrorDesc</span>.<span class="cons_Constructor"><span id="TermVariableTypedWithStrategyType_1543_1576" title="Not referenced locally, nor via imports">TermVariableTypedWithStrategyType</span></span> = [<span class="cons_String">This</span> <span class="cons_String">term</span> <span class="cons_String">variable</span> <span class="cons_String">was</span> <span class="cons_String">given</span> <span class="cons_String">a</span> <span class="cons_String">strategy</span> <span class="cons_String">type.</span>]
  <span id="ErrorDesc_1629_1638" title="Not referenced locally, nor via imports">ErrorDesc</span>.<span class="cons_Constructor"><span id="StrategyVariableTypedWithTermType_1639_1672" title="Not referenced locally, nor via imports">StrategyVariableTypedWithTermType</span></span> = [<span class="cons_String">This</span> <span class="cons_String">strategy</span> <span class="cons_String">variable</span> <span class="cons_String">was</span> <span class="cons_String">given</span> <span class="cons_String">a</span> <span class="cons_String">term</span> <span class="cons_String">type.</span>]
  <span id="ErrorDesc_1725_1734" title="Not referenced locally, nor via imports">ErrorDesc</span>.<span class="cons_Constructor"><span id="DuplicateTypeDefinition_1735_1758" title="Not referenced locally, nor via imports">DuplicateTypeDefinition</span></span> = [<span class="cons_String">Duplicate</span> <span class="cons_String">type</span> <span class="cons_String">definition.</span>]
  <span id="ErrorDesc_1792_1801" title="Not referenced locally, nor via imports">ErrorDesc</span>.<span class="cons_Constructor"><span id="MissingDefinitionForTypeDefinition_1802_1836" title="Not referenced locally, nor via imports">MissingDefinitionForTypeDefinition</span></span> = [<span class="cons_String">Cannot</span> <span class="cons_String">find</span> <span class="cons_String">definition</span> <span class="cons_String">for</span> <span class="cons_String">this</span> <span class="cons_String">type</span> <span class="cons_String">definition.</span>]
  <span id="ErrorDesc_1892_1901" title="Not referenced locally, nor via imports">ErrorDesc</span>.<span class="cons_Constructor"><span id="ProceedWrongNumberOfArguments_1902_1931" title="Not referenced locally, nor via imports">ProceedWrongNumberOfArguments</span></span> = [<span class="cons_String">Wrong</span> <span class="cons_String">number</span> <span class="cons_String">of</span> <span class="cons_String">arguments</span> <span class="cons_String">to</span> <span class="cons_String">proceed:</span> <span class="cons_String">(</span>[<a href="../../core/constants.sdf3#Int_37_40" id="Int_1975_1978" title="Defined at ../../core/constants.sdf3 line 3, 5">Int</a>]<span class="cons_String">|</span>[<a href="../../core/constants.sdf3#Int_37_40" id="Int_1981_1984" title="Defined at ../../core/constants.sdf3 line 3, 5">Int</a>]<span class="cons_String">).</span>]
  <span id="ErrorDesc_1991_2000" title="Not referenced locally, nor via imports">ErrorDesc</span>.<span class="cons_Constructor"><span id="ProceedInNonExtendStrategy_2001_2027" title="Not referenced locally, nor via imports">ProceedInNonExtendStrategy</span></span> = [<span class="cons_String">Cannot</span> <span class="cons_String">call</span> <span class="cons_String">proceed</span> <span class="cons_String">in</span> <span class="cons_String">a</span> <span class="cons_String">strategy</span> <span class="cons_String">or</span> <span class="cons_String">rule</span> <span class="cons_String">defined</span> <span class="cons_String">without</span> <span class="cons_String">the</span> <span class="cons_String">`extend`</span> <span class="cons_String">keyword.</span>]
  <span id="ErrorDesc_2114_2123" title="Not referenced locally, nor via imports">ErrorDesc</span>.<span class="cons_Constructor"><span id="CallStrategyArgumentTakesParameters_2124_2159" title="Not referenced locally, nor via imports">CallStrategyArgumentTakesParameters</span></span> = [<span class="cons_String">This</span> <span class="cons_String">call</span> <span class="cons_String">takes</span> <span class="cons_String">parameters,</span> <span class="cons_String">it</span> <span class="cons_String">has</span> <span class="cons_String">type:</span> [<a href="../signatures.sdf3#SFunType_844_852" id="SFunType_2205_2213" title="Defined at ../signatures.sdf3 line 32, 40, 41, 42">SFunType</a>]<span class="cons_String">.</span>]
  <span id="ErrorDesc_2219_2228" title="Not referenced locally, nor via imports">ErrorDesc</span>.<span class="cons_Constructor"><span id="AmbiguousStrategyResolution_2229_2256" title="Not referenced locally, nor via imports">AmbiguousStrategyResolution</span></span> = [<span class="cons_String">Call</span> <span class="cons_String">to</span> <span class="cons_String">strategy</span> <span class="cons_String">was</span> <span class="cons_String">ambiguous,</span> <span class="cons_String">could</span> <span class="cons_String">resolve</span> <span class="cons_String">to</span> <span class="cons_String">the</span> <span class="cons_String">following:</span> [{<a href="../signatures.sdf3#SFunType_844_852" id="SFunType_2326_2334" title="Defined at ../signatures.sdf3 line 32, 40, 41, 42">SFunType</a> <span class="cons_Lit">", "</span>}+]<span class="cons_String">.</span>]

  <span id="ErrorDesc_2348_2357" title="Not referenced locally, nor via imports">ErrorDesc</span>.<span class="cons_Constructor"><span id="NormalDefinitionOverlapsWithExternal_2358_2394" title="Not referenced locally, nor via imports">NormalDefinitionOverlapsWithExternal</span></span> = [<span class="cons_String">Definition</span> <span class="cons_String">of</span> <span class="cons_String">strategy</span> <span class="cons_String">overlaps</span> <span class="cons_String">with</span> <span class="cons_String">definition</span> <span class="cons_String">of</span> <span class="cons_String">external</span> <span class="cons_String">strategy.</span>]
  <span id="ErrorDesc_2471_2480" title="Not referenced locally, nor via imports">ErrorDesc</span>.<span class="cons_Constructor"><span id="NormalDefinitionOverlapsWithInternal_2481_2517" title="Not referenced locally, nor via imports">NormalDefinitionOverlapsWithInternal</span></span> = [<span class="cons_String">Definition</span> <span class="cons_String">of</span> <span class="cons_String">strategy</span> <span class="cons_String">overlaps</span> <span class="cons_String">with</span> <span class="cons_String">definition</span> <span class="cons_String">of</span> <span class="cons_String">internal</span> <span class="cons_String">strategy.</span>]
  <span id="ErrorDesc_2594_2603" title="Not referenced locally, nor via imports">ErrorDesc</span>.<span class="cons_Constructor"><span id="OverrideDefinitionWithoutExternal_2604_2637" title="Not referenced locally, nor via imports">OverrideDefinitionWithoutExternal</span></span> = [<span class="cons_String">Cannot</span> <span class="cons_String">find</span> <span class="cons_String">external</span> <span class="cons_String">strategy</span> <span class="cons_String">to</span> <span class="cons_String">override.</span>]
  <span id="ErrorDesc_2687_2696" title="Not referenced locally, nor via imports">ErrorDesc</span>.<span class="cons_Constructor"><span id="ExtendDefinitionWithoutExternal_2697_2728" title="Not referenced locally, nor via imports">ExtendDefinitionWithoutExternal</span></span> = [<span class="cons_String">Cannot</span> <span class="cons_String">find</span> <span class="cons_String">external</span> <span class="cons_String">strategy</span> <span class="cons_String">to</span> <span class="cons_String">extend.</span>]

  <span id="ErrorDesc_2777_2786" title="Not referenced locally, nor via imports">ErrorDesc</span>.<span class="cons_Constructor"><span id="NoInjectionBetween_2787_2805" title="Not referenced locally, nor via imports">NoInjectionBetween</span></span> = [<span class="cons_String">Cannot</span> <span class="cons_String">convert</span> <span class="cons_String">from</span> [<a href="#Type_942_946" id="Type_2830_2834" title="Defined at line 41, 42">Type</a>] <span class="cons_String">to</span> [<a href="#Type_942_946" id="Type_2840_2844" title="Defined at line 41, 42">Type</a>] <span class="cons_String">automatically,</span> <span class="cons_String">no</span> <span class="cons_String">known</span> <span class="cons_String">injection.</span>]
  <span id="ErrorDesc_2884_2893" title="Not referenced locally, nor via imports">ErrorDesc</span>.<span class="cons_Constructor"><span id="CastInserted_2894_2906" title="Not referenced locally, nor via imports">CastInserted</span></span> = [<span class="cons_String">Converting</span> <span class="cons_String">from</span> [<a href="#Type_942_946" id="Type_2927_2931" title="Defined at line 41, 42">Type</a>] <span class="cons_String">to</span> [<a href="#Type_942_946" id="Type_2937_2941" title="Defined at line 41, 42">Type</a>] <span class="cons_String">with</span> <span class="cons_String">a</span> <span class="cons_String">cast.</span>]
  <span id="ErrorDesc_2959_2968" title="Not referenced locally, nor via imports">ErrorDesc</span>.<span class="cons_Constructor"><span id="SCastInserted_2969_2982" title="Not referenced locally, nor via imports">SCastInserted</span></span> = [<span class="cons_String">Converting</span> <span class="cons_String">from</span> [<a href="#SType_1135_1140" id="SType_3003_3008" title="Defined at line 45">SType</a>] <span class="cons_String">to</span> [<a href="#SType_1135_1140" id="SType_3014_3019" title="Defined at line 45">SType</a>] <span class="cons_String">with</span> <span class="cons_String">a</span> <span class="cons_String">cast.</span>]
  <span id="ErrorDesc_3037_3046" title="Not referenced locally, nor via imports">ErrorDesc</span>.<span class="cons_Constructor"><span id="VariableBoundToIncompatibleType_3047_3078" title="Not referenced locally, nor via imports">VariableBoundToIncompatibleType</span></span> = [<span class="cons_String">This</span> <span class="cons_String">variable</span> <span class="cons_String">has</span> <span class="cons_String">type</span> [<a href="#Type_942_946" id="Type_3106_3110" title="Defined at line 41, 42">Type</a>]<span class="cons_String">,</span> <span class="cons_String">which</span> <span class="cons_String">cannot</span> <span class="cons_String">be</span> <span class="cons_String">converted</span> <span class="cons_String">to</span> [<a href="#Type_942_946" id="Type_3143_3147" title="Defined at line 41, 42">Type</a>] <span class="cons_String">automatically.</span>]
  <span id="ErrorDesc_3167_3176" title="Not referenced locally, nor via imports">ErrorDesc</span>.<span class="cons_Constructor"><span id="NoLUBBetween_3177_3189" title="Not referenced locally, nor via imports">NoLUBBetween</span></span> = [<span class="cons_String">Expected</span> [<a href="#Type_942_946" id="Type_3203_3207" title="Defined at line 41, 42">Type</a>] <span class="cons_String">and</span> [<a href="#Type_942_946" id="Type_3214_3218" title="Defined at line 41, 42">Type</a>] <span class="cons_String">to</span> <span class="cons_String">have</span> <span class="cons_String">a</span> <span class="cons_String">shared</span> <span class="cons_String">least</span> <span class="cons_String">upper</span> <span class="cons_String">bound</span> <span class="cons_String">but</span> <span class="cons_String">none</span> <span class="cons_String">was</span> <span class="cons_String">found.</span>]
  <span id="ErrorDesc_3278_3287" title="Not referenced locally, nor via imports">ErrorDesc</span>.<span class="cons_Constructor"><span id="STypeMismatch_3288_3301" title="Not referenced locally, nor via imports">STypeMismatch</span></span> = [<span class="cons_String">Expected</span> [<a href="#SType_1135_1140" id="SType_3315_3320" title="Defined at line 45">SType</a>]<span class="cons_String">,</span> <span class="cons_String">but</span> <span class="cons_String">got</span> [<a href="#SType_1135_1140" id="SType_3332_3337" title="Defined at line 45">SType</a>]<span class="cons_String">.</span>]
  <span id="ErrorDesc_3343_3352" title="Not referenced locally, nor via imports">ErrorDesc</span>.<span class="cons_Constructor"><span id="UnresolvedLocal_3353_3368" title="Not referenced locally, nor via imports">UnresolvedLocal</span></span> = [<span class="cons_String">Undefined</span> <span class="cons_String">local</span> <span class="cons_String">variable.</span>]
  <span id="ErrorDesc_3401_3410" title="Not referenced locally, nor via imports">ErrorDesc</span>.<span class="cons_Constructor"><span id="UnresolvedSort_3411_3425" title="Not referenced locally, nor via imports">UnresolvedSort</span></span> = [<span class="cons_String">Undefined</span> <span class="cons_String">sort</span> <span class="cons_String">with</span> <span class="cons_String">arity</span> [<a href="../../core/constants.sdf3#Int_37_40" id="Int_3456_3459" title="Defined at ../../core/constants.sdf3 line 3, 5">Int</a>]<span class="cons_String">.</span>]
  <span id="ErrorDesc_3465_3474" title="Not referenced locally, nor via imports">ErrorDesc</span>.<span class="cons_Constructor"><span id="UnresolvedSortVar_3475_3492" title="Not referenced locally, nor via imports">UnresolvedSortVar</span></span> = [<span class="cons_String">Undefined</span> <span class="cons_String">sort</span> <span class="cons_String">variable.</span>]
  <span id="ErrorDesc_3524_3533" title="Not referenced locally, nor via imports">ErrorDesc</span>.<span class="cons_Constructor"><span id="UnresolvedConstructor_3534_3555" title="Not referenced locally, nor via imports">UnresolvedConstructor</span></span> = [<span class="cons_String">Undefined</span> <span class="cons_String">constructor</span> <span class="cons_String">with</span> <span class="cons_String">arity</span> [<a href="../../core/constants.sdf3#Int_37_40" id="Int_3593_3596" title="Defined at ../../core/constants.sdf3 line 3, 5">Int</a>] <span class="cons_String">and</span> <span class="cons_String">type</span> [<a href="#Type_942_946" id="Type_3608_3612" title="Defined at line 41, 42">Type</a>]<span class="cons_String">.</span>]
  <span id="ErrorDesc_3618_3627" title="Not referenced locally, nor via imports">ErrorDesc</span>.<span class="cons_Constructor"><span id="UnresolvedStrategy_3628_3646" title="Not referenced locally, nor via imports">UnresolvedStrategy</span></span> = [<span class="cons_String">Undefined</span> <span class="cons_String">strategy</span> <span class="cons_String">with</span> <span class="cons_String">arity</span> [<a href="../../core/constants.sdf3#Int_37_40" id="Int_3681_3684" title="Defined at ../../core/constants.sdf3 line 3, 5">Int</a>]<span class="cons_String">/</span>[<a href="../../core/constants.sdf3#Int_37_40" id="Int_3687_3690" title="Defined at ../../core/constants.sdf3 line 3, 5">Int</a>]<span class="cons_String">.</span>]
  <span id="ErrorDesc_3696_3705" title="Not referenced locally, nor via imports">ErrorDesc</span>.<span class="cons_Constructor"><span id="AmbiguousConstructorUse_3706_3729" title="Not referenced locally, nor via imports">AmbiguousConstructorUse</span></span> = [<span class="cons_String">Ambiguous</span> <span class="cons_String">use</span> <span class="cons_String">of</span> <span class="cons_String">constructor,</span> <span class="cons_String">could</span> <span class="cons_String">be</span> <span class="cons_String">the</span> <span class="cons_String">following</span> <span class="cons_String">types:</span> [{<a href="#Type_942_946" id="Type_3795_3799" title="Defined at line 41, 42">Type</a> <span class="cons_Lit">", "</span>}+]]
  <span id="ErrorDesc_3811_3820" title="Not referenced locally, nor via imports">ErrorDesc</span>.<span class="cons_Constructor"><span id="UnboundTypeVar_3821_3835" title="Not referenced locally, nor via imports">UnboundTypeVar</span></span> = [<span class="cons_String">No</span> <span class="cons_String">instantiation</span> <span class="cons_String">found</span> <span class="cons_String">for</span> <span class="cons_String">type</span> <span class="cons_String">variable</span> [<a href="../../core/constants.sdf3#String_46_52" id="String_3881_3887" title="Defined at ../../core/constants.sdf3 line 3, 9">String</a>]]
  <span id="ErrorDesc_3892_3901" title="Not referenced locally, nor via imports">ErrorDesc</span>.<span class="cons_Constructor"><span id="LiteralCastFail_3902_3917" title="Not referenced locally, nor via imports">LiteralCastFail</span></span> = [<span class="cons_String">Cannot</span> <span class="cons_String">compile</span> <span class="cons_String">literal</span> <span class="cons_String">failing</span> <span class="cons_String">cast</span>]
  <span id="ErrorDesc_3960_3969" title="Not referenced locally, nor via imports">ErrorDesc</span>.<span class="cons_Constructor"><span id="MissingParsingInfoOnStringQuotation_3970_4005" title="Not referenced locally, nor via imports">MissingParsingInfoOnStringQuotation</span></span> = [<span class="cons_String">String</span> <span class="cons_String">quotation</span> <span class="cons_String">does</span> <span class="cons_String">not</span> <span class="cons_String">have</span> <span class="cons_String">parser</span> <span class="cons_String">information</span> <span class="cons_String">required</span> <span class="cons_String">to</span> <span class="cons_String">figure</span> <span class="cons_String">out</span> <span class="cons_String">indentation.</span>]
  <span id="ErrorDesc_4098_4107" title="Not referenced locally, nor via imports">ErrorDesc</span>.<span class="cons_Constructor"><span id="StrategyCongruenceOverlap_4108_4133" title="Not referenced locally, nor via imports">StrategyCongruenceOverlap</span></span> = [<span class="cons_String">Strategy</span> <span class="cons_String">overlaps</span> <span class="cons_String">with</span> <span class="cons_String">congruence</span> <span class="cons_String">for</span> <span class="cons_String">constructor</span> <span class="cons_String">of</span> <span class="cons_String">same</span> <span class="cons_String">name.</span>]
  <span id="ErrorDesc_4204_4213" title="Not referenced locally, nor via imports">ErrorDesc</span>.<span class="cons_Constructor"><span id="GadtSort_4214_4222" title="Not referenced locally, nor via imports">GadtSort</span></span> = [<span class="cons_String">Must</span> <span class="cons_String">use</span> <span class="cons_String">all</span> <span class="cons_String">unique</span> <span class="cons_String">sort</span> <span class="cons_String">variables</span> <span class="cons_String">as</span> <span class="cons_String">sort</span> <span class="cons_String">arguments,</span> <span class="cons_String">GADTs</span> <span class="cons_String">are</span> <span class="cons_String">not</span> <span class="cons_String">supported.</span>]

  <span id="ErrorDesc_4309_4318" title="Not referenced locally, nor via imports">ErrorDesc</span>.<span class="cons_Constructor"><span id="AsInBuildTerm_4319_4332" title="Not referenced locally, nor via imports">AsInBuildTerm</span></span> = [<span class="cons_String">The</span> <span class="cons_String">@</span> <span class="cons_String">pattern</span> <span class="cons_String">may</span> <span class="cons_String">not</span> <span class="cons_String">be</span> <span class="cons_String">used</span> <span class="cons_String">in</span> <span class="cons_String">build</span> <span class="cons_String">context.</span>]
  <span id="ErrorDesc_4387_4396" title="Not referenced locally, nor via imports">ErrorDesc</span>.<span class="cons_Constructor"><span id="WldInBuildTerm_4397_4411" title="Not referenced locally, nor via imports">WldInBuildTerm</span></span> = [<span class="cons_String">The</span> <span class="cons_String">_</span> <span class="cons_String">pattern</span> <span class="cons_String">may</span> <span class="cons_String">not</span> <span class="cons_String">be</span> <span class="cons_String">used</span> <span class="cons_String">in</span> <span class="cons_String">build</span> <span class="cons_String">context.</span>]
  <span id="ErrorDesc_4466_4475" title="Not referenced locally, nor via imports">ErrorDesc</span>.<span class="cons_Constructor"><span id="BuildDefaultInBuildTerm_4476_4499" title="Not referenced locally, nor via imports">BuildDefaultInBuildTerm</span></span> = [<span class="cons_String">The</span> <span class="cons_String">_name</span> <span class="cons_String">pattern</span> <span class="cons_String">may</span> <span class="cons_String">not</span> <span class="cons_String">be</span> <span class="cons_String">used</span> <span class="cons_String">in</span> <span class="cons_String">build</span> <span class="cons_String">context.</span>]
  <span id="ErrorDesc_4558_4567" title="Not referenced locally, nor via imports">ErrorDesc</span>.<span class="cons_Constructor"><span id="BuildDefaultInMatchTerm_4568_4591" title="Not referenced locally, nor via imports">BuildDefaultInMatchTerm</span></span> = [<span class="cons_String">The</span> <span class="cons_String">_name</span> <span class="cons_String">pattern</span> <span class="cons_String">may</span> <span class="cons_String">not</span> <span class="cons_String">be</span> <span class="cons_String">used</span> <span class="cons_String">in</span> <span class="cons_String">match</span> <span class="cons_String">context.</span>]
  <span id="ErrorDesc_4650_4659" title="Not referenced locally, nor via imports">ErrorDesc</span>.<span class="cons_Constructor"><span id="StringQuotationInMatchTerm_4660_4686" title="Not referenced locally, nor via imports">StringQuotationInMatchTerm</span></span> = [<span class="cons_String">A</span> <span class="cons_String">string</span> <span class="cons_String">quotation</span> <span class="cons_String">pattern</span> <span class="cons_String">may</span> <span class="cons_String">not</span> <span class="cons_String">be</span> <span class="cons_String">used</span> <span class="cons_String">in</span> <span class="cons_String">match</span> <span class="cons_String">context.</span>]

  <span id="ErrorDesc_4755_4764" title="Not referenced locally, nor via imports">ErrorDesc</span>.<span class="cons_Constructor"><span id="NonStringOrListInExplodeConsPosition_4765_4801" title="Not referenced locally, nor via imports">NonStringOrListInExplodeConsPosition</span></span> = [<span class="cons_String">Expected</span> <span class="cons_String">type</span> <span class="cons_String">string</span> <span class="cons_String">or</span> <span class="cons_String">list,</span> <span class="cons_String">but</span> <span class="cons_String">got</span> [<a href="#Type_942_946" id="Type_4844_4848" title="Defined at line 41, 42">Type</a>]<span class="cons_String">.</span>]
  <span id="ErrorDesc_4854_4863" title="Not referenced locally, nor via imports">ErrorDesc</span>.<span class="cons_Constructor"><span id="NonListInAnno_4864_4877" title="Not referenced locally, nor via imports">NonListInAnno</span></span> = [<span class="cons_String">Expected</span> <span class="cons_String">list,</span> <span class="cons_String">but</span> <span class="cons_String">got</span> [<a href="#Type_942_946" id="Type_4905_4909" title="Defined at line 41, 42">Type</a>]<span class="cons_String">.</span>]
  <span id="ErrorDesc_4915_4924" title="Not referenced locally, nor via imports">ErrorDesc</span>.<span class="cons_Constructor"><span id="MultipleAppsInMatch_4925_4944" title="Not referenced locally, nor via imports">MultipleAppsInMatch</span></span> = [<span class="cons_String">Multiple</span> <span class="cons_String">projections</span> <span class="cons_String">in</span> <span class="cons_String">one</span> <span class="cons_String">pattern,</span> <span class="cons_String">only</span> <span class="cons_String">one</span> <span class="cons_String">is</span> <span class="cons_String">actually</span> <span class="cons_String">returned.</span> ]

  <span id="ErrorDesc_5021_5030" title="Not referenced locally, nor via imports">ErrorDesc</span>.<span class="cons_Constructor"><span id="MatchNotSpecificEnoughForTP_5031_5058" title="Not referenced locally, nor via imports">MatchNotSpecificEnoughForTP</span></span> = [<span class="cons_String">Cannot</span> <span class="cons_String">infer</span> <span class="cons_String">specific</span> <span class="cons_String">type</span> <span class="cons_String">for</span> <span class="cons_String">TP</span> <span class="cons_String">rule</span> <span class="cons_String">match.</span> <span class="cons_String">Found</span> <span class="cons_String">result:</span> [<a href="#Type_942_946" id="Type_5123_5127" title="Defined at line 41, 42">Type</a>]<span class="cons_String">.</span> ]

  <span id="ErrorDesc_5135_5144" title="Not referenced locally, nor via imports">ErrorDesc</span>.<span class="cons_Constructor"><span id="UnsupportedCastRequiredInDynamicRule_5145_5181" title="Not referenced locally, nor via imports">UnsupportedCastRequiredInDynamicRule</span></span> = [<span class="cons_String">Pattern</span> <span class="cons_String">induces</span> <span class="cons_String">cast,</span> <span class="cons_String">but</span> <span class="cons_String">cast</span> <span class="cons_String">is</span> <span class="cons_String">not</span> <span class="cons_String">supported</span> <span class="cons_String">in</span> <span class="cons_String">this</span> <span class="cons_String">position.</span> ]

  <span id="ErrorDesc_5256_5265" title="Not referenced locally, nor via imports">ErrorDesc</span>.<span class="cons_Constructor"><span id="DynRuleOverlapError_5266_5285" title="Not referenced locally, nor via imports">DynRuleOverlapError</span></span> = [<span class="cons_String">Overlapping</span> <span class="cons_String">left-hand-sides</span> <span class="cons_String">for</span> <span class="cons_String">dynamic</span> <span class="cons_String">rule</span> <span class="cons_String">'</span>[<a href="../../core/identifiers.sdf3#Id_420_422" id="Id_5336_5338" title="Defined at ../../core/identifiers.sdf3 line 16, 21, 23, 43, 44, 45">Id</a>]<span class="cons_String">':</span> [<a href="../../core/constants.sdf3#String_46_52" id="String_5343_5349" title="Defined at ../../core/constants.sdf3 line 3, 9">String</a>] <span class="cons_String">in</span> [<a href="../../core/constants.sdf3#String_46_52" id="String_5355_5361" title="Defined at ../../core/constants.sdf3 line 3, 9">String</a>] <span class="cons_String">overlaps</span> <span class="cons_String">with</span> [<a href="../../core/constants.sdf3#String_46_52" id="String_5378_5384" title="Defined at ../../core/constants.sdf3 line 3, 9">String</a>] <span class="cons_String">in</span> [<a href="../../core/constants.sdf3#String_46_52" id="String_5390_5396" title="Defined at ../../core/constants.sdf3 line 3, 9">String</a>]<span class="cons_String">.</span> ]
  <span id="ErrorDesc_5403_5412" title="Not referenced locally, nor via imports">ErrorDesc</span>.<span class="cons_Constructor"><span id="CannotCastToRigidTypeVar_5413_5437" title="Not referenced locally, nor via imports">CannotCastToRigidTypeVar</span></span> = [<span class="cons_String">Cannot</span> <span class="cons_String">cast</span> [<a href="#Type_942_946" id="Type_5454_5458" title="Defined at line 41, 42">Type</a>] <span class="cons_String">to</span> <span class="cons_String">type</span> [<a href="#Type_942_946" id="Type_5469_5473" title="Defined at line 41, 42">Type</a>]<span class="cons_String">,</span> <span class="cons_String">its</span> <span class="cons_String">type</span> <span class="cons_String">is</span> <span class="cons_String">not</span> <span class="cons_String">known</span> <span class="cons_String">at</span> <span class="cons_String">run-time</span> <span class="cons_String">in</span> <span class="cons_String">this</span> <span class="cons_String">position.</span> ]
  <span id="ErrorDesc_5532_5541" title="Not referenced locally, nor via imports">ErrorDesc</span>.<span class="cons_Constructor"><span id="WithClauseInDynRule_5542_5561" title="Not referenced locally, nor via imports">WithClauseInDynRule</span></span> = [<span class="cons_String">Cannot</span> <span class="cons_String">use</span> <span class="cons_String">with</span> <span class="cons_String">clauses</span> <span class="cons_String">in</span> <span class="cons_String">dynamic</span> <span class="cons_String">rules.</span> ]
  <span id="ErrorDesc_5611_5620" title="Not referenced locally, nor via imports">ErrorDesc</span>.<span class="cons_Constructor"><span id="ConstantCongruence_5621_5639" title="Not referenced locally, nor via imports">ConstantCongruence</span></span> = [<span class="cons_String">Simple</span> <span class="cons_String">matching</span> <span class="cons_String">congruence:</span> <span class="cons_String">prefix</span> <span class="cons_String">with</span> <span class="cons_String">'?'.</span> <span class="cons_String">Or</span> <span class="cons_String">with</span> <span class="cons_String">'!'</span> <span class="cons_String">if</span> <span class="cons_String">you</span> <span class="cons_String">meant</span> <span class="cons_String">to</span> <span class="cons_String">build.</span> ]

  <span id="ErrorDesc_5728_5737" title="Not referenced locally, nor via imports">ErrorDesc</span>.<span class="cons_Constructor"><span id="WldInOverlay_5738_5750" title="Not referenced locally, nor via imports">WldInOverlay</span></span> = [<span class="cons_String">Wildcard</span> <span class="cons_String">not</span> <span class="cons_String">allowed</span> <span class="cons_String">in</span> <span class="cons_String">overlay,</span> <span class="cons_String">add</span> <span class="cons_String">a</span> <span class="cons_String">default</span> <span class="cons_String">value</span> <span class="cons_String">after</span> <span class="cons_String">the</span> <span class="cons_String">underscore.</span> ]
  <span id="ErrorDesc_5833_5842" title="Not referenced locally, nor via imports">ErrorDesc</span>.<span class="cons_Constructor"><span id="AsInOverlay_5843_5854" title="Not referenced locally, nor via imports">AsInOverlay</span></span> = [<span class="cons_String">As</span> <span class="cons_String">pattern</span> <span class="cons_String">not</span> <span class="cons_String">allowed</span> <span class="cons_String">in</span> <span class="cons_String">overlay.</span> ]
  <span id="ErrorDesc_5897_5906" title="Not referenced locally, nor via imports">ErrorDesc</span>.<span class="cons_Constructor"><span id="StringQuotationInOverlay_5907_5931" title="Not referenced locally, nor via imports">StringQuotationInOverlay</span></span> = [<span class="cons_String">The</span> <span class="cons_String">string</span> <span class="cons_String">quotation</span> <span class="cons_String">pattern</span> <span class="cons_String">may</span> <span class="cons_String">not</span> <span class="cons_String">be</span> <span class="cons_String">used</span> <span class="cons_String">in</span> <span class="cons_String">overlay.</span> ]
  <span id="ErrorDesc_5996_6005" title="Not referenced locally, nor via imports">ErrorDesc</span>.<span class="cons_Constructor"><span id="MissingTypeDefinition_6006_6027" title="Not referenced locally, nor via imports">MissingTypeDefinition</span></span> = [<span class="cons_String">Missing</span> <span class="cons_String">type</span> <span class="cons_String">definition.</span> ]

</code></pre></td></tr></tbody></table></div>