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
<td class="code"><pre><code><span class="keyword">module</span> <span id="gradual-types/internal_1_8" title="Not referenced">gradual-types/internal</span>

<span class="keyword">imports</span>
  <a href="../../core/identifiers.sdf3/#core/identifiers_1_8" id="core/identifiers_4_3" title="Defined at ../../core/identifiers.sdf3 line 1">core/identifiers</a>
  <a href="../../core/constants.sdf3/#core/constants_1_8" id="core/constants_5_3" title="Defined at ../../core/constants.sdf3 line 1">core/constants</a>
  <a href="../../core/modules.sdf3/#core/modules_1_8" id="core/modules_6_3" title="Defined at ../../core/modules.sdf3 line 1">core/modules</a>
  <a href="../../core/strategies.sdf3/#core/strategies_1_8" id="core/strategies_7_3" title="Defined at ../../core/strategies.sdf3 line 1">core/strategies</a>
  <a href="../signatures.sdf3/#gradual-types/signatures_1_8" id="gradual-types/signatures_8_3" title="Defined at ../signatures.sdf3 line 1">gradual-types/signatures</a>

<span class="keyword">context-free sorts</span> <span id="Str2Lib_10_20" title="Not referenced">Str2Lib</span> <a href="#Str2LibComponent_14_7" id="Str2LibComponent_10_28" title="Referenced at line 14">Str2LibComponent</a> <span id="Anno_10_45" title="Not referenced">Anno</span>
<span class="keyword">context-free syntax</span>

  <span id="Str2Lib_13_3" title="Not referenced">Str2Lib</span>.<span class="cons_Constructor"><span id="Str2Lib_13_11" title="Not referenced">Str2Lib</span></span> = [<span class="cons_String">library</span> [<a href="../../core/identifiers.sdf3/#ModNamePart_3_23" id="ModNamePart_13_31" title="Defined at ../../core/identifiers.sdf3 line 3, 6">ModNamePart</a>]
    [{<a href="#Str2LibComponent_10_28" id="Str2LibComponent_14_7" title="Defined at line 10, 18, 19">Str2LibComponent</a> <span class="cons_Lit">"\n"</span>}+]
    [{<a href="../../core/modules.sdf3/#Module_9_20" id="Module_15_7" title="Defined at ../../core/modules.sdf3 line 9, 12, 17">Module</a> <span class="cons_Lit">"\n\n"</span>}+]
  ]

  <a href="#Str2LibComponent_14_7" id="Str2LibComponent_18_3" title="Referenced at line 14">Str2LibComponent</a>.<span class="cons_Constructor"><span id="Maven_18_20" title="Not referenced">Maven</span></span> = [<span class="cons_String">maven</span> [<span class="cons_Unquoted"><span id="groupId_18_36" title="Not referenced">groupId</span></span>:<a href="#JavaId_23_71" id="JavaId_18_44" title="Defined at line 23, 30">JavaId</a>]<span class="cons_String">:</span>[<span class="cons_Unquoted"><span id="id_18_53" title="Not referenced">id</span></span>:<a href="#JavaId_23_71" id="JavaId_18_56" title="Defined at line 23, 30">JavaId</a>]<span class="cons_String">:</span>[<a href="#MavenVersion_23_46" id="MavenVersion_18_65" title="Defined at line 23, 26">MavenVersion</a>]]
  <a href="#Str2LibComponent_14_7" id="Str2LibComponent_19_3" title="Referenced at line 14">Str2LibComponent</a>.<span class="cons_Constructor"><span id="Package_19_20" title="Not referenced">Package</span></span> = [<span class="cons_String">package</span> [<a href="#PackageName_23_59" id="PackageName_19_40" title="Defined at line 23, 29">PackageName</a>]]

  <span id="Anno_21_3" title="Not referenced">Anno</span>.<span class="cons_Constructor"><span id="Overlay_21_8" title="Not referenced">Overlay</span></span> = [<span class="cons_String">overlay</span>]

<span class="keyword">lexical sorts</span> <a href="#VersionNumber_26_18" id="VersionNumber_23_15" title="Referenced at line 26">VersionNumber</a> <a href="#VersionQualifier_26_68" id="VersionQualifier_23_29" title="Referenced at line 26, 34">VersionQualifier</a> <a href="#MavenVersion_18_65" id="MavenVersion_23_46" title="Referenced at line 18">MavenVersion</a> <a href="#PackageName_19_40" id="PackageName_23_59" title="Referenced at line 19">PackageName</a> <a href="#JavaId_18_44" id="JavaId_23_71" title="Referenced at line 18, 29">JavaId</a>
<span class="keyword">lexical syntax</span>

  <a href="#MavenVersion_18_65" id="MavenVersion_26_3" title="Referenced at line 18">MavenVersion</a> = <a href="#VersionNumber_23_15" id="VersionNumber_26_18" title="Defined at line 23, 27">VersionNumber</a> <span class="cons_Lit">"."</span> <a href="#VersionNumber_23_15" id="VersionNumber_26_36" title="Defined at line 23, 27">VersionNumber</a> <span class="cons_Lit">"."</span> <a href="#VersionNumber_23_15" id="VersionNumber_26_54" title="Defined at line 23, 27">VersionNumber</a> <a href="#VersionQualifier_23_29" id="VersionQualifier_26_68" title="Defined at line 23, 28">VersionQualifier</a>
  <a href="#VersionNumber_26_18" id="VersionNumber_27_3" title="Referenced at line 26">VersionNumber</a> = [<span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>]+
  <a href="#VersionQualifier_26_68" id="VersionQualifier_28_3" title="Referenced at line 26, 34">VersionQualifier</a> = <span class="cons_Lit">"-"</span> [<span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\-\.]+
  <a href="#PackageName_19_40" id="PackageName_29_3" title="Referenced at line 19">PackageName</a> = {<a href="#JavaId_23_71" id="JavaId_29_18" title="Defined at line 23, 30">JavaId</a> <span class="cons_Lit">"."</span>}+
  <a href="#JavaId_18_44" id="JavaId_30_3" title="Referenced at line 18, 29">JavaId</a> = [<span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">a</span>-<span class="cons_Regular">z</span>\_\$] [<span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\_\$]+

<span class="keyword">lexical restrictions</span>

  <a href="#VersionQualifier_23_29" id="VersionQualifier_34_3" title="Defined at line 23, 28">VersionQualifier</a> -/- [<span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\-\.]

<span class="keyword">context-free sorts</span> <span id="ConstrType_36_20" title="Not referenced">ConstrType</span>
<span class="keyword">context-free syntax</span>

  <span id="Def_39_3" title="Not referenced">Def</span>.<span class="cons_Constructor"><span id="DefHasType_39_7" title="Not referenced">DefHasType</span></span> = [[<a href="../../core/strategies.sdf3/#SId_34_15" id="SId_39_22" title="Defined at ../../core/strategies.sdf3 line 34, 37">SId</a>] <span class="cons_String">::</span> [<a href="../signatures.sdf3/#SFunType_32_26" id="SFunType_39_31" title="Defined at ../signatures.sdf3 line 32, 40, 41, 42">SFunType</a>]]

  <a href="#Type_41_34" id="Type_41_3" title="Referenced at line 41, 46, 48, 71, 72, 74, 75, 80, 82, 95, 96, 99, 104">Type</a>.<span class="cons_Constructor"><span id="IllFormedTermT_41_8" title="Not referenced">IllFormedTermT</span></span> = [[<a href="../../core/identifiers.sdf3/#Id_16_15" id="Id_41_27" title="Defined at ../../core/identifiers.sdf3 line 16, 21, 23, 43, 44, 45">Id</a>]<span class="cons_String">#(</span>[{<a href="#Type_41_3" id="Type_41_34" title="Defined at line 41, 42">Type</a> <span class="cons_Lit">", "</span>}*]<span class="cons_String">)</span>]
  <a href="#Type_41_34" id="Type_42_3" title="Referenced at line 41, 46, 48, 71, 72, 74, 75, 80, 82, 95, 96, 99, 104">Type</a>.<span class="cons_Constructor"><span id="EmptyT_42_8" title="Not referenced">EmptyT</span></span> = [<span class="cons_String">empty</span>]
  <span id="Anno_43_3" title="Not referenced">Anno</span>.<span class="cons_Constructor"><span id="LocalDef_43_8" title="Not referenced">LocalDef</span></span> = [<span class="cons_String">localdef</span>]
  <span id="Anno_44_3" title="Not referenced">Anno</span>.<span class="cons_Constructor"><span id="AmbiguousStrategyResolution_44_8" title="Not referenced">AmbiguousStrategyResolution</span></span> = [<span class="cons_String">ambiguous</span> <span class="cons_String">strategy</span> <span class="cons_String">resolves</span> <span class="cons_String">to</span> <span class="cons_String">arities:</span> [<a href="../../core/constants.sdf3/#Int_3_15" id="Int_44_80" title="Defined at ../../core/constants.sdf3 line 3, 5">Int</a>]<span class="cons_String">,</span> [<a href="../../core/constants.sdf3/#Int_3_15" id="Int_44_87" title="Defined at ../../core/constants.sdf3 line 3, 5">Int</a>]]
  <a href="#SType_73_47" id="SType_45_3" title="Referenced at line 73, 76">SType</a>.<span class="cons_Constructor"><span id="SEmptyT_45_9" title="Not referenced">SEmptyT</span></span> = [<span class="cons_String">s-empty</span>]
  <span id="Dyn_46_3" title="Not referenced">Dyn</span> = <a href="#Type_41_3" id="Type_46_9" title="Defined at line 41, 42">Type</a> <span class="layout">// to allow DynT(&lt;some type&gt;)</span>

  <span id="ConstrType_48_3" title="Not referenced">ConstrType</span>.<span class="cons_Constructor"><span id="ConstrType_48_14" title="Not referenced">ConstrType</span></span> = [[{<a href="#Type_41_3" id="Type_48_30" title="Defined at line 41, 42">Type</a> <span class="cons_Lit">" * "</span>}+] <span class="cons_String">-&gt;</span> [<a href="#Type_41_3" id="Type_48_48" title="Defined at line 41, 42">Type</a>]]

<span class="keyword">context-free sorts</span> <span id="ErrorDesc_50_20" title="Not referenced">ErrorDesc</span> <span id="MessageType_50_30" title="Not referenced">MessageType</span>
<span class="keyword">context-free syntax</span>
  <span id="MessageType_52_3" title="Not referenced">MessageType</span>.<span class="cons_Constructor"><span id="MTError_52_15" title="Not referenced">MTError</span></span> = [<span class="cons_String">error</span>]
  <span id="MessageType_53_3" title="Not referenced">MessageType</span>.<span class="cons_Constructor"><span id="MTWarning_53_15" title="Not referenced">MTWarning</span></span> = [<span class="cons_String">warning</span>]
  <span id="MessageType_54_3" title="Not referenced">MessageType</span>.<span class="cons_Constructor"><span id="MTNote_54_15" title="Not referenced">MTNote</span></span> = [<span class="cons_String">note</span>]

  <span id="ErrorDesc_56_3" title="Not referenced">ErrorDesc</span>.<span class="cons_Constructor"><span id="CallDynamicNotSupported_56_13" title="Not referenced">CallDynamicNotSupported</span></span> = [<span class="cons_String">The</span> <span class="cons_String">dynamic</span> <span class="cons_String">`call(name|sargs|targs)`</span> <span class="cons_String">construct</span> <span class="cons_String">is</span> <span class="cons_String">no</span> <span class="cons_String">longer</span> <span class="cons_String">supported.</span>]
  <span id="ErrorDesc_57_3" title="Not referenced">ErrorDesc</span>.<span class="cons_Constructor"><span id="TermVariableTypedWithStrategyType_57_13" title="Not referenced">TermVariableTypedWithStrategyType</span></span> = [<span class="cons_String">This</span> <span class="cons_String">term</span> <span class="cons_String">variable</span> <span class="cons_String">was</span> <span class="cons_String">given</span> <span class="cons_String">a</span> <span class="cons_String">strategy</span> <span class="cons_String">type.</span>]
  <span id="ErrorDesc_58_3" title="Not referenced">ErrorDesc</span>.<span class="cons_Constructor"><span id="StrategyVariableTypedWithTermType_58_13" title="Not referenced">StrategyVariableTypedWithTermType</span></span> = [<span class="cons_String">This</span> <span class="cons_String">strategy</span> <span class="cons_String">variable</span> <span class="cons_String">was</span> <span class="cons_String">given</span> <span class="cons_String">a</span> <span class="cons_String">term</span> <span class="cons_String">type.</span>]
  <span id="ErrorDesc_59_3" title="Not referenced">ErrorDesc</span>.<span class="cons_Constructor"><span id="DuplicateTypeDefinition_59_13" title="Not referenced">DuplicateTypeDefinition</span></span> = [<span class="cons_String">Duplicate</span> <span class="cons_String">type</span> <span class="cons_String">definition.</span>]
  <span id="ErrorDesc_60_3" title="Not referenced">ErrorDesc</span>.<span class="cons_Constructor"><span id="MissingDefinitionForTypeDefinition_60_13" title="Not referenced">MissingDefinitionForTypeDefinition</span></span> = [<span class="cons_String">Cannot</span> <span class="cons_String">find</span> <span class="cons_String">definition</span> <span class="cons_String">for</span> <span class="cons_String">this</span> <span class="cons_String">type</span> <span class="cons_String">definition.</span>]
  <span id="ErrorDesc_61_3" title="Not referenced">ErrorDesc</span>.<span class="cons_Constructor"><span id="ProceedWrongNumberOfArguments_61_13" title="Not referenced">ProceedWrongNumberOfArguments</span></span> = [<span class="cons_String">Wrong</span> <span class="cons_String">number</span> <span class="cons_String">of</span> <span class="cons_String">arguments</span> <span class="cons_String">to</span> <span class="cons_String">proceed:</span> <span class="cons_String">(</span>[<a href="../../core/constants.sdf3/#Int_3_15" id="Int_61_86" title="Defined at ../../core/constants.sdf3 line 3, 5">Int</a>]<span class="cons_String">|</span>[<a href="../../core/constants.sdf3/#Int_3_15" id="Int_61_92" title="Defined at ../../core/constants.sdf3 line 3, 5">Int</a>]<span class="cons_String">).</span>]
  <span id="ErrorDesc_62_3" title="Not referenced">ErrorDesc</span>.<span class="cons_Constructor"><span id="ProceedInNonExtendStrategy_62_13" title="Not referenced">ProceedInNonExtendStrategy</span></span> = [<span class="cons_String">Cannot</span> <span class="cons_String">call</span> <span class="cons_String">proceed</span> <span class="cons_String">in</span> <span class="cons_String">a</span> <span class="cons_String">strategy</span> <span class="cons_String">or</span> <span class="cons_String">rule</span> <span class="cons_String">defined</span> <span class="cons_String">without</span> <span class="cons_String">the</span> <span class="cons_String">`extend`</span> <span class="cons_String">keyword.</span>]
  <span id="ErrorDesc_63_3" title="Not referenced">ErrorDesc</span>.<span class="cons_Constructor"><span id="CallStrategyArgumentTakesParameters_63_13" title="Not referenced">CallStrategyArgumentTakesParameters</span></span> = [<span class="cons_String">This</span> <span class="cons_String">call</span> <span class="cons_String">takes</span> <span class="cons_String">parameters,</span> <span class="cons_String">it</span> <span class="cons_String">has</span> <span class="cons_String">type:</span> [<a href="../signatures.sdf3/#SFunType_32_26" id="SFunType_63_94" title="Defined at ../signatures.sdf3 line 32, 40, 41, 42">SFunType</a>]<span class="cons_String">.</span>]
  <span id="ErrorDesc_64_3" title="Not referenced">ErrorDesc</span>.<span class="cons_Constructor"><span id="AmbiguousStrategyResolution_64_13" title="Not referenced">AmbiguousStrategyResolution</span></span> = [<span class="cons_String">Call</span> <span class="cons_String">to</span> <span class="cons_String">strategy</span> <span class="cons_String">was</span> <span class="cons_String">ambiguous,</span> <span class="cons_String">could</span> <span class="cons_String">resolve</span> <span class="cons_String">to</span> <span class="cons_String">the</span> <span class="cons_String">following:</span> [{<a href="../signatures.sdf3/#SFunType_32_26" id="SFunType_64_110" title="Defined at ../signatures.sdf3 line 32, 40, 41, 42">SFunType</a> <span class="cons_Lit">", "</span>}+]<span class="cons_String">.</span>]

  <span id="ErrorDesc_66_3" title="Not referenced">ErrorDesc</span>.<span class="cons_Constructor"><span id="NormalDefinitionOverlapsWithExternal_66_13" title="Not referenced">NormalDefinitionOverlapsWithExternal</span></span> = [<span class="cons_String">Definition</span> <span class="cons_String">of</span> <span class="cons_String">strategy</span> <span class="cons_String">overlaps</span> <span class="cons_String">with</span> <span class="cons_String">definition</span> <span class="cons_String">of</span> <span class="cons_String">external</span> <span class="cons_String">strategy.</span>]
  <span id="ErrorDesc_67_3" title="Not referenced">ErrorDesc</span>.<span class="cons_Constructor"><span id="NormalDefinitionOverlapsWithInternal_67_13" title="Not referenced">NormalDefinitionOverlapsWithInternal</span></span> = [<span class="cons_String">Definition</span> <span class="cons_String">of</span> <span class="cons_String">strategy</span> <span class="cons_String">overlaps</span> <span class="cons_String">with</span> <span class="cons_String">definition</span> <span class="cons_String">of</span> <span class="cons_String">internal</span> <span class="cons_String">strategy.</span>]
  <span id="ErrorDesc_68_3" title="Not referenced">ErrorDesc</span>.<span class="cons_Constructor"><span id="OverrideDefinitionWithoutExternal_68_13" title="Not referenced">OverrideDefinitionWithoutExternal</span></span> = [<span class="cons_String">Cannot</span> <span class="cons_String">find</span> <span class="cons_String">external</span> <span class="cons_String">strategy</span> <span class="cons_String">to</span> <span class="cons_String">override.</span>]
  <span id="ErrorDesc_69_3" title="Not referenced">ErrorDesc</span>.<span class="cons_Constructor"><span id="ExtendDefinitionWithoutExternal_69_13" title="Not referenced">ExtendDefinitionWithoutExternal</span></span> = [<span class="cons_String">Cannot</span> <span class="cons_String">find</span> <span class="cons_String">external</span> <span class="cons_String">strategy</span> <span class="cons_String">to</span> <span class="cons_String">extend.</span>]

  <span id="ErrorDesc_71_3" title="Not referenced">ErrorDesc</span>.<span class="cons_Constructor"><span id="NoInjectionBetween_71_13" title="Not referenced">NoInjectionBetween</span></span> = [<span class="cons_String">Cannot</span> <span class="cons_String">convert</span> <span class="cons_String">from</span> [<a href="#Type_41_3" id="Type_71_56" title="Defined at line 41, 42">Type</a>] <span class="cons_String">to</span> [<a href="#Type_41_3" id="Type_71_66" title="Defined at line 41, 42">Type</a>] <span class="cons_String">automatically,</span> <span class="cons_String">no</span> <span class="cons_String">known</span> <span class="cons_String">injection.</span>]
  <span id="ErrorDesc_72_3" title="Not referenced">ErrorDesc</span>.<span class="cons_Constructor"><span id="CastInserted_72_13" title="Not referenced">CastInserted</span></span> = [<span class="cons_String">Converting</span> <span class="cons_String">from</span> [<a href="#Type_41_3" id="Type_72_46" title="Defined at line 41, 42">Type</a>] <span class="cons_String">to</span> [<a href="#Type_41_3" id="Type_72_56" title="Defined at line 41, 42">Type</a>] <span class="cons_String">with</span> <span class="cons_String">a</span> <span class="cons_String">cast.</span>]
  <span id="ErrorDesc_73_3" title="Not referenced">ErrorDesc</span>.<span class="cons_Constructor"><span id="SCastInserted_73_13" title="Not referenced">SCastInserted</span></span> = [<span class="cons_String">Converting</span> <span class="cons_String">from</span> [<a href="#SType_45_3" id="SType_73_47" title="Defined at line 45">SType</a>] <span class="cons_String">to</span> [<a href="#SType_45_3" id="SType_73_58" title="Defined at line 45">SType</a>] <span class="cons_String">with</span> <span class="cons_String">a</span> <span class="cons_String">cast.</span>]
  <span id="ErrorDesc_74_3" title="Not referenced">ErrorDesc</span>.<span class="cons_Constructor"><span id="VariableBoundToIncompatibleType_74_13" title="Not referenced">VariableBoundToIncompatibleType</span></span> = [<span class="cons_String">This</span> <span class="cons_String">variable</span> <span class="cons_String">has</span> <span class="cons_String">type</span> [<a href="#Type_41_3" id="Type_74_72" title="Defined at line 41, 42">Type</a>]<span class="cons_String">,</span> <span class="cons_String">which</span> <span class="cons_String">cannot</span> <span class="cons_String">be</span> <span class="cons_String">converted</span> <span class="cons_String">to</span> [<a href="#Type_41_3" id="Type_74_109" title="Defined at line 41, 42">Type</a>] <span class="cons_String">automatically.</span>]
  <span id="ErrorDesc_75_3" title="Not referenced">ErrorDesc</span>.<span class="cons_Constructor"><span id="NoLUBBetween_75_13" title="Not referenced">NoLUBBetween</span></span> = [<span class="cons_String">Expected</span> [<a href="#Type_41_3" id="Type_75_39" title="Defined at line 41, 42">Type</a>] <span class="cons_String">and</span> [<a href="#Type_41_3" id="Type_75_50" title="Defined at line 41, 42">Type</a>] <span class="cons_String">to</span> <span class="cons_String">have</span> <span class="cons_String">a</span> <span class="cons_String">shared</span> <span class="cons_String">least</span> <span class="cons_String">upper</span> <span class="cons_String">bound</span> <span class="cons_String">but</span> <span class="cons_String">none</span> <span class="cons_String">was</span> <span class="cons_String">found.</span>]
  <span id="ErrorDesc_76_3" title="Not referenced">ErrorDesc</span>.<span class="cons_Constructor"><span id="STypeMismatch_76_13" title="Not referenced">STypeMismatch</span></span> = [<span class="cons_String">Expected</span> [<a href="#SType_45_3" id="SType_76_40" title="Defined at line 45">SType</a>]<span class="cons_String">,</span> <span class="cons_String">but</span> <span class="cons_String">got</span> [<a href="#SType_45_3" id="SType_76_57" title="Defined at line 45">SType</a>]<span class="cons_String">.</span>]
  <span id="ErrorDesc_77_3" title="Not referenced">ErrorDesc</span>.<span class="cons_Constructor"><span id="UnresolvedLocal_77_13" title="Not referenced">UnresolvedLocal</span></span> = [<span class="cons_String">Undefined</span> <span class="cons_String">local</span> <span class="cons_String">variable.</span>]
  <span id="ErrorDesc_78_3" title="Not referenced">ErrorDesc</span>.<span class="cons_Constructor"><span id="UnresolvedSort_78_13" title="Not referenced">UnresolvedSort</span></span> = [<span class="cons_String">Undefined</span> <span class="cons_String">sort</span> <span class="cons_String">with</span> <span class="cons_String">arity</span> [<a href="../../core/constants.sdf3/#Int_3_15" id="Int_78_58" title="Defined at ../../core/constants.sdf3 line 3, 5">Int</a>]<span class="cons_String">.</span>]
  <span id="ErrorDesc_79_3" title="Not referenced">ErrorDesc</span>.<span class="cons_Constructor"><span id="UnresolvedSortVar_79_13" title="Not referenced">UnresolvedSortVar</span></span> = [<span class="cons_String">Undefined</span> <span class="cons_String">sort</span> <span class="cons_String">variable.</span>]
  <span id="ErrorDesc_80_3" title="Not referenced">ErrorDesc</span>.<span class="cons_Constructor"><span id="UnresolvedConstructor_80_13" title="Not referenced">UnresolvedConstructor</span></span> = [<span class="cons_String">Undefined</span> <span class="cons_String">constructor</span> <span class="cons_String">with</span> <span class="cons_String">arity</span> [<a href="../../core/constants.sdf3/#Int_3_15" id="Int_80_72" title="Defined at ../../core/constants.sdf3 line 3, 5">Int</a>] <span class="cons_String">and</span> <span class="cons_String">type</span> [<a href="#Type_41_3" id="Type_80_87" title="Defined at line 41, 42">Type</a>]<span class="cons_String">.</span>]
  <span id="ErrorDesc_81_3" title="Not referenced">ErrorDesc</span>.<span class="cons_Constructor"><span id="UnresolvedStrategy_81_13" title="Not referenced">UnresolvedStrategy</span></span> = [<span class="cons_String">Undefined</span> <span class="cons_String">strategy</span> <span class="cons_String">with</span> <span class="cons_String">arity</span> [<a href="../../core/constants.sdf3/#Int_3_15" id="Int_81_66" title="Defined at ../../core/constants.sdf3 line 3, 5">Int</a>]<span class="cons_String">/</span>[<a href="../../core/constants.sdf3/#Int_3_15" id="Int_81_72" title="Defined at ../../core/constants.sdf3 line 3, 5">Int</a>]<span class="cons_String">.</span>]
  <span id="ErrorDesc_82_3" title="Not referenced">ErrorDesc</span>.<span class="cons_Constructor"><span id="AmbiguousConstructorUse_82_13" title="Not referenced">AmbiguousConstructorUse</span></span> = [<span class="cons_String">Ambiguous</span> <span class="cons_String">use</span> <span class="cons_String">of</span> <span class="cons_String">constructor,</span> <span class="cons_String">could</span> <span class="cons_String">be</span> <span class="cons_String">the</span> <span class="cons_String">following</span> <span class="cons_String">types:</span> [{<a href="#Type_41_3" id="Type_82_102" title="Defined at line 41, 42">Type</a> <span class="cons_Lit">", "</span>}+]]
  <span id="ErrorDesc_83_3" title="Not referenced">ErrorDesc</span>.<span class="cons_Constructor"><span id="UnboundTypeVar_83_13" title="Not referenced">UnboundTypeVar</span></span> = [<span class="cons_String">No</span> <span class="cons_String">instantiation</span> <span class="cons_String">found</span> <span class="cons_String">for</span> <span class="cons_String">type</span> <span class="cons_String">variable</span> [<a href="../../core/constants.sdf3/#String_3_24" id="String_83_73" title="Defined at ../../core/constants.sdf3 line 3, 9">String</a>]]
  <span id="ErrorDesc_84_3" title="Not referenced">ErrorDesc</span>.<span class="cons_Constructor"><span id="LiteralCastFail_84_13" title="Not referenced">LiteralCastFail</span></span> = [<span class="cons_String">Cannot</span> <span class="cons_String">compile</span> <span class="cons_String">literal</span> <span class="cons_String">failing</span> <span class="cons_String">cast</span>]
  <span id="ErrorDesc_85_3" title="Not referenced">ErrorDesc</span>.<span class="cons_Constructor"><span id="MissingParsingInfoOnStringQuotation_85_13" title="Not referenced">MissingParsingInfoOnStringQuotation</span></span> = [<span class="cons_String">String</span> <span class="cons_String">quotation</span> <span class="cons_String">does</span> <span class="cons_String">not</span> <span class="cons_String">have</span> <span class="cons_String">parser</span> <span class="cons_String">information</span> <span class="cons_String">required</span> <span class="cons_String">to</span> <span class="cons_String">figure</span> <span class="cons_String">out</span> <span class="cons_String">indentation.</span>]
  <span id="ErrorDesc_86_3" title="Not referenced">ErrorDesc</span>.<span class="cons_Constructor"><span id="StrategyCongruenceOverlap_86_13" title="Not referenced">StrategyCongruenceOverlap</span></span> = [<span class="cons_String">Strategy</span> <span class="cons_String">overlaps</span> <span class="cons_String">with</span> <span class="cons_String">congruence</span> <span class="cons_String">for</span> <span class="cons_String">constructor</span> <span class="cons_String">of</span> <span class="cons_String">same</span> <span class="cons_String">name.</span>]
  <span id="ErrorDesc_87_3" title="Not referenced">ErrorDesc</span>.<span class="cons_Constructor"><span id="GadtSort_87_13" title="Not referenced">GadtSort</span></span> = [<span class="cons_String">Must</span> <span class="cons_String">use</span> <span class="cons_String">all</span> <span class="cons_String">unique</span> <span class="cons_String">sort</span> <span class="cons_String">variables</span> <span class="cons_String">as</span> <span class="cons_String">sort</span> <span class="cons_String">arguments,</span> <span class="cons_String">GADTs</span> <span class="cons_String">are</span> <span class="cons_String">not</span> <span class="cons_String">supported.</span>]

  <span id="ErrorDesc_89_3" title="Not referenced">ErrorDesc</span>.<span class="cons_Constructor"><span id="AsInBuildTerm_89_13" title="Not referenced">AsInBuildTerm</span></span> = [<span class="cons_String">The</span> <span class="cons_String">@</span> <span class="cons_String">pattern</span> <span class="cons_String">may</span> <span class="cons_String">not</span> <span class="cons_String">be</span> <span class="cons_String">used</span> <span class="cons_String">in</span> <span class="cons_String">build</span> <span class="cons_String">context.</span>]
  <span id="ErrorDesc_90_3" title="Not referenced">ErrorDesc</span>.<span class="cons_Constructor"><span id="WldInBuildTerm_90_13" title="Not referenced">WldInBuildTerm</span></span> = [<span class="cons_String">The</span> <span class="cons_String">_</span> <span class="cons_String">pattern</span> <span class="cons_String">may</span> <span class="cons_String">not</span> <span class="cons_String">be</span> <span class="cons_String">used</span> <span class="cons_String">in</span> <span class="cons_String">build</span> <span class="cons_String">context.</span>]
  <span id="ErrorDesc_91_3" title="Not referenced">ErrorDesc</span>.<span class="cons_Constructor"><span id="BuildDefaultInBuildTerm_91_13" title="Not referenced">BuildDefaultInBuildTerm</span></span> = [<span class="cons_String">The</span> <span class="cons_String">_name</span> <span class="cons_String">pattern</span> <span class="cons_String">may</span> <span class="cons_String">not</span> <span class="cons_String">be</span> <span class="cons_String">used</span> <span class="cons_String">in</span> <span class="cons_String">build</span> <span class="cons_String">context.</span>]
  <span id="ErrorDesc_92_3" title="Not referenced">ErrorDesc</span>.<span class="cons_Constructor"><span id="BuildDefaultInMatchTerm_92_13" title="Not referenced">BuildDefaultInMatchTerm</span></span> = [<span class="cons_String">The</span> <span class="cons_String">_name</span> <span class="cons_String">pattern</span> <span class="cons_String">may</span> <span class="cons_String">not</span> <span class="cons_String">be</span> <span class="cons_String">used</span> <span class="cons_String">in</span> <span class="cons_String">match</span> <span class="cons_String">context.</span>]
  <span id="ErrorDesc_93_3" title="Not referenced">ErrorDesc</span>.<span class="cons_Constructor"><span id="StringQuotationInMatchTerm_93_13" title="Not referenced">StringQuotationInMatchTerm</span></span> = [<span class="cons_String">A</span> <span class="cons_String">string</span> <span class="cons_String">quotation</span> <span class="cons_String">pattern</span> <span class="cons_String">may</span> <span class="cons_String">not</span> <span class="cons_String">be</span> <span class="cons_String">used</span> <span class="cons_String">in</span> <span class="cons_String">match</span> <span class="cons_String">context.</span>]

  <span id="ErrorDesc_95_3" title="Not referenced">ErrorDesc</span>.<span class="cons_Constructor"><span id="NonStringOrListInExplodeConsPosition_95_13" title="Not referenced">NonStringOrListInExplodeConsPosition</span></span> = [<span class="cons_String">Expected</span> <span class="cons_String">type</span> <span class="cons_String">string</span> <span class="cons_String">or</span> <span class="cons_String">list,</span> <span class="cons_String">but</span> <span class="cons_String">got</span> [<a href="#Type_41_3" id="Type_95_92" title="Defined at line 41, 42">Type</a>]<span class="cons_String">.</span>]
  <span id="ErrorDesc_96_3" title="Not referenced">ErrorDesc</span>.<span class="cons_Constructor"><span id="NonListInAnno_96_13" title="Not referenced">NonListInAnno</span></span> = [<span class="cons_String">Expected</span> <span class="cons_String">list,</span> <span class="cons_String">but</span> <span class="cons_String">got</span> [<a href="#Type_41_3" id="Type_96_54" title="Defined at line 41, 42">Type</a>]<span class="cons_String">.</span>]
  <span id="ErrorDesc_97_3" title="Not referenced">ErrorDesc</span>.<span class="cons_Constructor"><span id="MultipleAppsInMatch_97_13" title="Not referenced">MultipleAppsInMatch</span></span> = [<span class="cons_String">Multiple</span> <span class="cons_String">projections</span> <span class="cons_String">in</span> <span class="cons_String">one</span> <span class="cons_String">pattern,</span> <span class="cons_String">only</span> <span class="cons_String">one</span> <span class="cons_String">is</span> <span class="cons_String">actually</span> <span class="cons_String">returned.</span> ]

  <span id="ErrorDesc_99_3" title="Not referenced">ErrorDesc</span>.<span class="cons_Constructor"><span id="MatchNotSpecificEnoughForTP_99_13" title="Not referenced">MatchNotSpecificEnoughForTP</span></span> = [<span class="cons_String">Cannot</span> <span class="cons_String">infer</span> <span class="cons_String">specific</span> <span class="cons_String">type</span> <span class="cons_String">for</span> <span class="cons_String">TP</span> <span class="cons_String">rule</span> <span class="cons_String">match.</span> <span class="cons_String">Found</span> <span class="cons_String">result:</span> [<a href="#Type_41_3" id="Type_99_105" title="Defined at line 41, 42">Type</a>]<span class="cons_String">.</span> ]

  <span id="ErrorDesc_101_3" title="Not referenced">ErrorDesc</span>.<span class="cons_Constructor"><span id="UnsupportedCastRequiredInDynamicRule_101_13" title="Not referenced">UnsupportedCastRequiredInDynamicRule</span></span> = [<span class="cons_String">Pattern</span> <span class="cons_String">induces</span> <span class="cons_String">cast,</span> <span class="cons_String">but</span> <span class="cons_String">cast</span> <span class="cons_String">is</span> <span class="cons_String">not</span> <span class="cons_String">supported</span> <span class="cons_String">in</span> <span class="cons_String">this</span> <span class="cons_String">position.</span> ]

  <span id="ErrorDesc_103_3" title="Not referenced">ErrorDesc</span>.<span class="cons_Constructor"><span id="DynRuleOverlapError_103_13" title="Not referenced">DynRuleOverlapError</span></span> = [<span class="cons_String">Overlapping</span> <span class="cons_String">left-hand-sides</span> <span class="cons_String">for</span> <span class="cons_String">dynamic</span> <span class="cons_String">rule</span> <span class="cons_String">'</span>[<a href="../../core/identifiers.sdf3/#Id_16_15" id="Id_103_83" title="Defined at ../../core/identifiers.sdf3 line 16, 21, 23, 43, 44, 45">Id</a>]<span class="cons_String">':</span> [<a href="../../core/constants.sdf3/#String_3_24" id="String_103_90" title="Defined at ../../core/constants.sdf3 line 3, 9">String</a>] <span class="cons_String">in</span> [<a href="../../core/constants.sdf3/#String_3_24" id="String_103_102" title="Defined at ../../core/constants.sdf3 line 3, 9">String</a>] <span class="cons_String">overlaps</span> <span class="cons_String">with</span> [<a href="../../core/constants.sdf3/#String_3_24" id="String_103_125" title="Defined at ../../core/constants.sdf3 line 3, 9">String</a>] <span class="cons_String">in</span> [<a href="../../core/constants.sdf3/#String_3_24" id="String_103_137" title="Defined at ../../core/constants.sdf3 line 3, 9">String</a>]<span class="cons_String">.</span> ]
  <span id="ErrorDesc_104_3" title="Not referenced">ErrorDesc</span>.<span class="cons_Constructor"><span id="CannotCastToRigidTypeVar_104_13" title="Not referenced">CannotCastToRigidTypeVar</span></span> = [<span class="cons_String">Cannot</span> <span class="cons_String">cast</span> [<a href="#Type_41_3" id="Type_104_54" title="Defined at line 41, 42">Type</a>] <span class="cons_String">to</span> <span class="cons_String">type</span> [<a href="#Type_41_3" id="Type_104_69" title="Defined at line 41, 42">Type</a>]<span class="cons_String">,</span> <span class="cons_String">its</span> <span class="cons_String">type</span> <span class="cons_String">is</span> <span class="cons_String">not</span> <span class="cons_String">known</span> <span class="cons_String">at</span> <span class="cons_String">run-time</span> <span class="cons_String">in</span> <span class="cons_String">this</span> <span class="cons_String">position.</span> ]
  <span id="ErrorDesc_105_3" title="Not referenced">ErrorDesc</span>.<span class="cons_Constructor"><span id="WithClauseInDynRule_105_13" title="Not referenced">WithClauseInDynRule</span></span> = [<span class="cons_String">Cannot</span> <span class="cons_String">use</span> <span class="cons_String">with</span> <span class="cons_String">clauses</span> <span class="cons_String">in</span> <span class="cons_String">dynamic</span> <span class="cons_String">rules.</span> ]
  <span id="ErrorDesc_106_3" title="Not referenced">ErrorDesc</span>.<span class="cons_Constructor"><span id="ConstantCongruence_106_13" title="Not referenced">ConstantCongruence</span></span> = [<span class="cons_String">Simple</span> <span class="cons_String">matching</span> <span class="cons_String">congruence:</span> <span class="cons_String">prefix</span> <span class="cons_String">with</span> <span class="cons_String">'?'.</span> <span class="cons_String">Or</span> <span class="cons_String">with</span> <span class="cons_String">'!'</span> <span class="cons_String">if</span> <span class="cons_String">you</span> <span class="cons_String">meant</span> <span class="cons_String">to</span> <span class="cons_String">build.</span> ]

  <span id="ErrorDesc_108_3" title="Not referenced">ErrorDesc</span>.<span class="cons_Constructor"><span id="WldInOverlay_108_13" title="Not referenced">WldInOverlay</span></span> = [<span class="cons_String">Wildcard</span> <span class="cons_String">not</span> <span class="cons_String">allowed</span> <span class="cons_String">in</span> <span class="cons_String">overlay,</span> <span class="cons_String">add</span> <span class="cons_String">a</span> <span class="cons_String">default</span> <span class="cons_String">value</span> <span class="cons_String">after</span> <span class="cons_String">the</span> <span class="cons_String">underscore.</span> ]
  <span id="ErrorDesc_109_3" title="Not referenced">ErrorDesc</span>.<span class="cons_Constructor"><span id="AsInOverlay_109_13" title="Not referenced">AsInOverlay</span></span> = [<span class="cons_String">As</span> <span class="cons_String">pattern</span> <span class="cons_String">not</span> <span class="cons_String">allowed</span> <span class="cons_String">in</span> <span class="cons_String">overlay.</span> ]
  <span id="ErrorDesc_110_3" title="Not referenced">ErrorDesc</span>.<span class="cons_Constructor"><span id="StringQuotationInOverlay_110_13" title="Not referenced">StringQuotationInOverlay</span></span> = [<span class="cons_String">The</span> <span class="cons_String">string</span> <span class="cons_String">quotation</span> <span class="cons_String">pattern</span> <span class="cons_String">may</span> <span class="cons_String">not</span> <span class="cons_String">be</span> <span class="cons_String">used</span> <span class="cons_String">in</span> <span class="cons_String">overlay.</span> ]
  <span id="ErrorDesc_111_3" title="Not referenced">ErrorDesc</span>.<span class="cons_Constructor"><span id="MissingTypeDefinition_111_13" title="Not referenced">MissingTypeDefinition</span></span> = [<span class="cons_String">Missing</span> <span class="cons_String">type</span> <span class="cons_String">definition.</span> ]

</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
