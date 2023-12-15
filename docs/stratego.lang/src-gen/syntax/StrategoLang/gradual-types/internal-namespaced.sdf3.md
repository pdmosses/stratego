---
title: internal-namespaced.sdf3
hide:
  - toc
---

# `internal-namespaced.sdf3`



[pdmosses/stratego/stratego.lang/src-gen/syntax/StrategoLang/gradual-types/internal-namespaced.sdf3]: https://github.com/pdmosses/stratego/blob/master/stratego.lang/src-gen/syntax/StrategoLang/gradual-types/internal-namespaced.sdf3 "The source file on GitHub"

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
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <span id="StrategoLang/gradual-types/internal-namespaced_1_8" title="Not referenced">StrategoLang/gradual-types/internal-namespaced</span>

<span class="keyword">imports</span>
  <a href="../../core/identifiers-namespaced.sdf3/#StrategoLang/core/identifiers-namespaced_1_8" id="StrategoLang/core/identifiers-namespaced_4_3" title="Defined at ../../core/identifiers-namespaced.sdf3 line 1">StrategoLang/core/identifiers-namespaced</a>        
  <a href="../../core/constants-namespaced.sdf3/#StrategoLang/core/constants-namespaced_1_8" id="StrategoLang/core/constants-namespaced_5_3" title="Defined at ../../core/constants-namespaced.sdf3 line 1">StrategoLang/core/constants-namespaced</a>        
  <a href="../../core/modules-namespaced.sdf3/#StrategoLang/core/modules-namespaced_1_8" id="StrategoLang/core/modules-namespaced_6_3" title="Defined at ../../core/modules-namespaced.sdf3 line 1">StrategoLang/core/modules-namespaced</a>        
  <a href="../../core/strategies-namespaced.sdf3/#StrategoLang/core/strategies-namespaced_1_8" id="StrategoLang/core/strategies-namespaced_7_3" title="Defined at ../../core/strategies-namespaced.sdf3 line 1">StrategoLang/core/strategies-namespaced</a>        
  <a href="../signatures-namespaced.sdf3/#StrategoLang/gradual-types/signatures-namespaced_1_8" id="StrategoLang/gradual-types/signatures-namespaced_8_3" title="Defined at ../signatures-namespaced.sdf3 line 1">StrategoLang/gradual-types/signatures-namespaced</a>

<span class="keyword">sorts</span> <span id="StrategoLang-Str2Lib_10_7" title="Not referenced">StrategoLang-Str2Lib</span> <a href="#StrategoLang-Str2LibComponent_15_7" id="StrategoLang-Str2LibComponent_10_28" title="Referenced at line 15">StrategoLang-Str2LibComponent</a> <span id="StrategoLang-Anno_10_58" title="Not referenced">StrategoLang-Anno</span>

<span class="keyword">context-free syntax</span>

  <span id="StrategoLang-Str2Lib_14_3" title="Not referenced">StrategoLang-Str2Lib</span>.<span class="cons_Constructor"><span id="Str2Lib_14_24" title="Not referenced">Str2Lib</span></span> = [<span class="cons_String">library</span> [<a href="../../core/identifiers-namespaced.sdf3/#StrategoLang-ModNamePart_9_3" id="StrategoLang-ModNamePart_14_44" title="Defined at ../../core/identifiers-namespaced.sdf3 line 9">StrategoLang-ModNamePart</a>]
    [{<a href="#StrategoLang-Str2LibComponent_10_28" id="StrategoLang-Str2LibComponent_15_7" title="Defined at line 10, 18, 19">StrategoLang-Str2LibComponent</a> <span class="cons_Lit">"\n"</span>}+]
    [{<a href="../../core/modules-namespaced.sdf3/#StrategoLang-Module_9_7" id="StrategoLang-Module_16_7" title="Defined at ../../core/modules-namespaced.sdf3 line 9, 13, 16">StrategoLang-Module</a> <span class="cons_Lit">"\n\n"</span>}+]
  ] { }
  <a href="#StrategoLang-Str2LibComponent_15_7" id="StrategoLang-Str2LibComponent_18_3" title="Referenced at line 15">StrategoLang-Str2LibComponent</a>.<span class="cons_Constructor"><span id="Maven_18_33" title="Not referenced">Maven</span></span> = [<span class="cons_String">maven</span> [<span class="cons_Unquoted"><span id="groupId_18_49" title="Not referenced">groupId</span></span>:<a href="#StrategoLang-JavaId_30_3" id="StrategoLang-JavaId_18_57" title="Defined at line 30">StrategoLang-JavaId</a>]<span class="cons_String">:</span>[<span class="cons_Unquoted"><span id="id_18_79" title="Not referenced">id</span></span>:<a href="#StrategoLang-JavaId_30_3" id="StrategoLang-JavaId_18_82" title="Defined at line 30">StrategoLang-JavaId</a>]<span class="cons_String">:</span>[<a href="#StrategoLang-MavenVersion_26_3" id="StrategoLang-MavenVersion_18_104" title="Defined at line 26">StrategoLang-MavenVersion</a>]] { }
  <a href="#StrategoLang-Str2LibComponent_15_7" id="StrategoLang-Str2LibComponent_19_3" title="Referenced at line 15">StrategoLang-Str2LibComponent</a>.<span class="cons_Constructor"><span id="Package_19_33" title="Not referenced">Package</span></span> = [<span class="cons_String">package</span> [<a href="#StrategoLang-PackageName_29_3" id="StrategoLang-PackageName_19_53" title="Defined at line 29">StrategoLang-PackageName</a>]] { }
  <span id="StrategoLang-Anno_20_3" title="Not referenced">StrategoLang-Anno</span>.<span class="cons_Constructor"><span id="Overlay_20_21" title="Not referenced">Overlay</span></span> = [<span class="cons_String">overlay</span>] { }

<span class="keyword">sorts</span> <span id="VersionNumber_22_7" title="Not referenced">VersionNumber</span><span class="keyword">-LEX</span> <span id="VersionQualifier_22_25" title="Not referenced">VersionQualifier</span><span class="keyword">-LEX</span> <span id="MavenVersion_22_46" title="Not referenced">MavenVersion</span><span class="keyword">-LEX</span> <span id="PackageName_22_63" title="Not referenced">PackageName</span><span class="keyword">-LEX</span> <span id="JavaId_22_79" title="Not referenced">JavaId</span><span class="keyword">-LEX</span>

<span class="keyword">lexical syntax</span>

  <a href="#StrategoLang-MavenVersion_18_104" id="StrategoLang-MavenVersion_26_3" title="Referenced at line 18">StrategoLang-MavenVersion</a> = <a href="#StrategoLang-VersionNumber_27_3" id="StrategoLang-VersionNumber_26_31" title="Defined at line 27">StrategoLang-VersionNumber</a> <span class="cons_Lit">"."</span> <a href="#StrategoLang-VersionNumber_27_3" id="StrategoLang-VersionNumber_26_62" title="Defined at line 27">StrategoLang-VersionNumber</a> <span class="cons_Lit">"."</span> <a href="#StrategoLang-VersionNumber_27_3" id="StrategoLang-VersionNumber_26_93" title="Defined at line 27">StrategoLang-VersionNumber</a> <a href="#StrategoLang-VersionQualifier_28_3" id="StrategoLang-VersionQualifier_26_120" title="Defined at line 28">StrategoLang-VersionQualifier</a> { }
  <a href="#StrategoLang-VersionNumber_26_31" id="StrategoLang-VersionNumber_27_3" title="Referenced at line 26">StrategoLang-VersionNumber</a> = [<span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>]+ { }
  <a href="#StrategoLang-VersionQualifier_26_120" id="StrategoLang-VersionQualifier_28_3" title="Referenced at line 26, 34">StrategoLang-VersionQualifier</a> = <span class="cons_Lit">"-"</span> [<span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\-\.]+ { }
  <a href="#StrategoLang-PackageName_19_53" id="StrategoLang-PackageName_29_3" title="Referenced at line 19">StrategoLang-PackageName</a> = {<a href="#StrategoLang-JavaId_30_3" id="StrategoLang-JavaId_29_31" title="Defined at line 30">StrategoLang-JavaId</a> <span class="cons_Lit">"."</span>}+ { }
  <a href="#StrategoLang-JavaId_18_57" id="StrategoLang-JavaId_30_3" title="Referenced at line 18, 29">StrategoLang-JavaId</a> = [<span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">a</span>-<span class="cons_Regular">z</span>\_\$] [<span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\_\$]+ { }

<span class="keyword">lexical restrictions</span>

  <a href="#StrategoLang-VersionQualifier_28_3" id="StrategoLang-VersionQualifier_34_3" title="Defined at line 28">StrategoLang-VersionQualifier</a> -/- [<span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\-\.]

<span class="keyword">sorts</span> <span id="StrategoLang-ConstrType_36_7" title="Not referenced">StrategoLang-ConstrType</span>

<span class="keyword">context-free syntax</span>

  <span id="StrategoLang-Def_40_3" title="Not referenced">StrategoLang-Def</span>.<span class="cons_Constructor"><span id="DefHasType_40_20" title="Not referenced">DefHasType</span></span> = [[<a href="../../core/strategies-namespaced.sdf3/#StrategoLang-SId_36_3" id="StrategoLang-SId_40_35" title="Defined at ../../core/strategies-namespaced.sdf3 line 36">StrategoLang-SId</a>] <span class="cons_String">::</span> [StrategoLang-SFunType]] { }
  <a href="#StrategoLang-Type_41_60" id="StrategoLang-Type_41_3" title="Referenced at line 41, 46, 47, 69, 70, 72, 73, 78, 80, 91, 92, 94, 97">StrategoLang-Type</a>.<span class="cons_Constructor"><span id="IllFormedTermT_41_21" title="Not referenced">IllFormedTermT</span></span> = [[<a href="../../core/identifiers-namespaced.sdf3/#StrategoLang-Id_27_3" id="StrategoLang-Id_41_40" title="Defined at ../../core/identifiers-namespaced.sdf3 line 27, 29, 49, 50, 51">StrategoLang-Id</a>]<span class="cons_String">#(</span>[{<a href="#StrategoLang-Type_41_3" id="StrategoLang-Type_41_60" title="Defined at line 41, 42">StrategoLang-Type</a> <span class="cons_Lit">", "</span>}*]<span class="cons_String">)</span>] { }
  <a href="#StrategoLang-Type_41_60" id="StrategoLang-Type_42_3" title="Referenced at line 41, 46, 47, 69, 70, 72, 73, 78, 80, 91, 92, 94, 97">StrategoLang-Type</a>.<span class="cons_Constructor"><span id="EmptyT_42_21" title="Not referenced">EmptyT</span></span> = [<span class="cons_String">empty</span>] { }
  <span id="StrategoLang-Anno_43_3" title="Not referenced">StrategoLang-Anno</span>.<span class="cons_Constructor"><span id="LocalDef_43_21" title="Not referenced">LocalDef</span></span> = [<span class="cons_String">localdef</span>] { }
  <span id="StrategoLang-Anno_44_3" title="Not referenced">StrategoLang-Anno</span>.<span class="cons_Constructor"><span id="AmbiguousStrategyResolution_44_21" title="Not referenced">AmbiguousStrategyResolution</span></span> = [<span class="cons_String">ambiguous</span> <span class="cons_String">strategy</span> <span class="cons_String">resolves</span> <span class="cons_String">to</span> <span class="cons_String">arities:</span> [<a href="../../core/constants-namespaced.sdf3/#StrategoLang-Int_8_3" id="StrategoLang-Int_44_93" title="Defined at ../../core/constants-namespaced.sdf3 line 8">StrategoLang-Int</a>]<span class="cons_String">,</span> [<a href="../../core/constants-namespaced.sdf3/#StrategoLang-Int_8_3" id="StrategoLang-Int_44_113" title="Defined at ../../core/constants-namespaced.sdf3 line 8">StrategoLang-Int</a>]] { }
  <a href="#StrategoLang-SType_71_60" id="StrategoLang-SType_45_3" title="Referenced at line 71, 74">StrategoLang-SType</a>.<span class="cons_Constructor"><span id="SEmptyT_45_22" title="Not referenced">SEmptyT</span></span> = [<span class="cons_String">s-empty</span>] { }
  <span id="StrategoLang-Dyn_46_3" title="Not referenced">StrategoLang-Dyn</span> = <a href="#StrategoLang-Type_41_3" id="StrategoLang-Type_46_22" title="Defined at line 41, 42">StrategoLang-Type</a> { }
  <span id="StrategoLang-ConstrType_47_3" title="Not referenced">StrategoLang-ConstrType</span>.<span class="cons_Constructor"><span id="ConstrType_47_27" title="Not referenced">ConstrType</span></span> = [[{<a href="#StrategoLang-Type_41_3" id="StrategoLang-Type_47_43" title="Defined at line 41, 42">StrategoLang-Type</a> <span class="cons_Lit">" * "</span>}+] <span class="cons_String">-&gt;</span> [<a href="#StrategoLang-Type_41_3" id="StrategoLang-Type_47_74" title="Defined at line 41, 42">StrategoLang-Type</a>]] { }

<span class="keyword">sorts</span> <span id="StrategoLang-ErrorDesc_49_7" title="Not referenced">StrategoLang-ErrorDesc</span> <span id="StrategoLang-MessageType_49_30" title="Not referenced">StrategoLang-MessageType</span>

<span class="keyword">context-free syntax</span>

  <span id="StrategoLang-MessageType_53_3" title="Not referenced">StrategoLang-MessageType</span>.<span class="cons_Constructor"><span id="MTError_53_28" title="Not referenced">MTError</span></span> = [<span class="cons_String">error</span>] { }
  <span id="StrategoLang-MessageType_54_3" title="Not referenced">StrategoLang-MessageType</span>.<span class="cons_Constructor"><span id="MTWarning_54_28" title="Not referenced">MTWarning</span></span> = [<span class="cons_String">warning</span>] { }
  <span id="StrategoLang-MessageType_55_3" title="Not referenced">StrategoLang-MessageType</span>.<span class="cons_Constructor"><span id="MTNote_55_28" title="Not referenced">MTNote</span></span> = [<span class="cons_String">note</span>] { }
  <span id="StrategoLang-ErrorDesc_56_3" title="Not referenced">StrategoLang-ErrorDesc</span>.<span class="cons_Constructor"><span id="CallDynamicNotSupported_56_26" title="Not referenced">CallDynamicNotSupported</span></span> = [<span class="cons_String">The</span> <span class="cons_String">dynamic</span> <span class="cons_String">`call(name|sargs|targs)`</span> <span class="cons_String">construct</span> <span class="cons_String">is</span> <span class="cons_String">no</span> <span class="cons_String">longer</span> <span class="cons_String">supported.</span>] { }
  <span id="StrategoLang-ErrorDesc_57_3" title="Not referenced">StrategoLang-ErrorDesc</span>.<span class="cons_Constructor"><span id="TermVariableTypedWithStrategyType_57_26" title="Not referenced">TermVariableTypedWithStrategyType</span></span> = [<span class="cons_String">This</span> <span class="cons_String">term</span> <span class="cons_String">variable</span> <span class="cons_String">was</span> <span class="cons_String">given</span> <span class="cons_String">a</span> <span class="cons_String">strategy</span> <span class="cons_String">type.</span>] { }
  <span id="StrategoLang-ErrorDesc_58_3" title="Not referenced">StrategoLang-ErrorDesc</span>.<span class="cons_Constructor"><span id="StrategyVariableTypedWithTermType_58_26" title="Not referenced">StrategyVariableTypedWithTermType</span></span> = [<span class="cons_String">This</span> <span class="cons_String">strategy</span> <span class="cons_String">variable</span> <span class="cons_String">was</span> <span class="cons_String">given</span> <span class="cons_String">a</span> <span class="cons_String">term</span> <span class="cons_String">type.</span>] { }
  <span id="StrategoLang-ErrorDesc_59_3" title="Not referenced">StrategoLang-ErrorDesc</span>.<span class="cons_Constructor"><span id="DuplicateTypeDefinition_59_26" title="Not referenced">DuplicateTypeDefinition</span></span> = [<span class="cons_String">Duplicate</span> <span class="cons_String">type</span> <span class="cons_String">definition.</span>] { }
  <span id="StrategoLang-ErrorDesc_60_3" title="Not referenced">StrategoLang-ErrorDesc</span>.<span class="cons_Constructor"><span id="MissingDefinitionForTypeDefinition_60_26" title="Not referenced">MissingDefinitionForTypeDefinition</span></span> = [<span class="cons_String">Cannot</span> <span class="cons_String">find</span> <span class="cons_String">definition</span> <span class="cons_String">for</span> <span class="cons_String">this</span> <span class="cons_String">type</span> <span class="cons_String">definition.</span>] { }
  <span id="StrategoLang-ErrorDesc_61_3" title="Not referenced">StrategoLang-ErrorDesc</span>.<span class="cons_Constructor"><span id="ProceedWrongNumberOfArguments_61_26" title="Not referenced">ProceedWrongNumberOfArguments</span></span> = [<span class="cons_String">Wrong</span> <span class="cons_String">number</span> <span class="cons_String">of</span> <span class="cons_String">arguments</span> <span class="cons_String">to</span> <span class="cons_String">proceed:</span> <span class="cons_String">(</span>[<a href="../../core/constants-namespaced.sdf3/#StrategoLang-Int_8_3" id="StrategoLang-Int_61_99" title="Defined at ../../core/constants-namespaced.sdf3 line 8">StrategoLang-Int</a>]<span class="cons_String">|</span>[<a href="../../core/constants-namespaced.sdf3/#StrategoLang-Int_8_3" id="StrategoLang-Int_61_118" title="Defined at ../../core/constants-namespaced.sdf3 line 8">StrategoLang-Int</a>]<span class="cons_String">).</span>] { }
  <span id="StrategoLang-ErrorDesc_62_3" title="Not referenced">StrategoLang-ErrorDesc</span>.<span class="cons_Constructor"><span id="ProceedInNonExtendStrategy_62_26" title="Not referenced">ProceedInNonExtendStrategy</span></span> = [<span class="cons_String">Cannot</span> <span class="cons_String">call</span> <span class="cons_String">proceed</span> <span class="cons_String">in</span> <span class="cons_String">a</span> <span class="cons_String">strategy</span> <span class="cons_String">or</span> <span class="cons_String">rule</span> <span class="cons_String">defined</span> <span class="cons_String">without</span> <span class="cons_String">the</span> <span class="cons_String">`extend`</span> <span class="cons_String">keyword.</span>] { }
  <span id="StrategoLang-ErrorDesc_63_3" title="Not referenced">StrategoLang-ErrorDesc</span>.<span class="cons_Constructor"><span id="CallStrategyArgumentTakesParameters_63_26" title="Not referenced">CallStrategyArgumentTakesParameters</span></span> = [<span class="cons_String">This</span> <span class="cons_String">call</span> <span class="cons_String">takes</span> <span class="cons_String">parameters,</span> <span class="cons_String">it</span> <span class="cons_String">has</span> <span class="cons_String">type:</span> [StrategoLang-SFunType]<span class="cons_String">.</span>] { }
  <span id="StrategoLang-ErrorDesc_64_3" title="Not referenced">StrategoLang-ErrorDesc</span>.<span class="cons_Constructor"><span id="AmbiguousStrategyResolution_64_26" title="Not referenced">AmbiguousStrategyResolution</span></span> = [<span class="cons_String">Call</span> <span class="cons_String">to</span> <span class="cons_String">strategy</span> <span class="cons_String">was</span> <span class="cons_String">ambiguous,</span> <span class="cons_String">could</span> <span class="cons_String">resolve</span> <span class="cons_String">to</span> <span class="cons_String">the</span> <span class="cons_String">following:</span> [{StrategoLang-SFunType <span class="cons_Lit">", "</span>}+]<span class="cons_String">.</span>] { }
  <span id="StrategoLang-ErrorDesc_65_3" title="Not referenced">StrategoLang-ErrorDesc</span>.<span class="cons_Constructor"><span id="NormalDefinitionOverlapsWithExternal_65_26" title="Not referenced">NormalDefinitionOverlapsWithExternal</span></span> = [<span class="cons_String">Definition</span> <span class="cons_String">of</span> <span class="cons_String">strategy</span> <span class="cons_String">overlaps</span> <span class="cons_String">with</span> <span class="cons_String">definition</span> <span class="cons_String">of</span> <span class="cons_String">external</span> <span class="cons_String">strategy.</span>] { }
  <span id="StrategoLang-ErrorDesc_66_3" title="Not referenced">StrategoLang-ErrorDesc</span>.<span class="cons_Constructor"><span id="NormalDefinitionOverlapsWithInternal_66_26" title="Not referenced">NormalDefinitionOverlapsWithInternal</span></span> = [<span class="cons_String">Definition</span> <span class="cons_String">of</span> <span class="cons_String">strategy</span> <span class="cons_String">overlaps</span> <span class="cons_String">with</span> <span class="cons_String">definition</span> <span class="cons_String">of</span> <span class="cons_String">internal</span> <span class="cons_String">strategy.</span>] { }
  <span id="StrategoLang-ErrorDesc_67_3" title="Not referenced">StrategoLang-ErrorDesc</span>.<span class="cons_Constructor"><span id="OverrideDefinitionWithoutExternal_67_26" title="Not referenced">OverrideDefinitionWithoutExternal</span></span> = [<span class="cons_String">Cannot</span> <span class="cons_String">find</span> <span class="cons_String">external</span> <span class="cons_String">strategy</span> <span class="cons_String">to</span> <span class="cons_String">override.</span>] { }
  <span id="StrategoLang-ErrorDesc_68_3" title="Not referenced">StrategoLang-ErrorDesc</span>.<span class="cons_Constructor"><span id="ExtendDefinitionWithoutExternal_68_26" title="Not referenced">ExtendDefinitionWithoutExternal</span></span> = [<span class="cons_String">Cannot</span> <span class="cons_String">find</span> <span class="cons_String">external</span> <span class="cons_String">strategy</span> <span class="cons_String">to</span> <span class="cons_String">extend.</span>] { }
  <span id="StrategoLang-ErrorDesc_69_3" title="Not referenced">StrategoLang-ErrorDesc</span>.<span class="cons_Constructor"><span id="NoInjectionBetween_69_26" title="Not referenced">NoInjectionBetween</span></span> = [<span class="cons_String">Cannot</span> <span class="cons_String">convert</span> <span class="cons_String">from</span> [<a href="#StrategoLang-Type_41_3" id="StrategoLang-Type_69_69" title="Defined at line 41, 42">StrategoLang-Type</a>] <span class="cons_String">to</span> [<a href="#StrategoLang-Type_41_3" id="StrategoLang-Type_69_92" title="Defined at line 41, 42">StrategoLang-Type</a>] <span class="cons_String">automatically,</span> <span class="cons_String">no</span> <span class="cons_String">known</span> <span class="cons_String">injection.</span>] { }
  <span id="StrategoLang-ErrorDesc_70_3" title="Not referenced">StrategoLang-ErrorDesc</span>.<span class="cons_Constructor"><span id="CastInserted_70_26" title="Not referenced">CastInserted</span></span> = [<span class="cons_String">Converting</span> <span class="cons_String">from</span> [<a href="#StrategoLang-Type_41_3" id="StrategoLang-Type_70_59" title="Defined at line 41, 42">StrategoLang-Type</a>] <span class="cons_String">to</span> [<a href="#StrategoLang-Type_41_3" id="StrategoLang-Type_70_82" title="Defined at line 41, 42">StrategoLang-Type</a>] <span class="cons_String">with</span> <span class="cons_String">a</span> <span class="cons_String">cast.</span>] { }
  <span id="StrategoLang-ErrorDesc_71_3" title="Not referenced">StrategoLang-ErrorDesc</span>.<span class="cons_Constructor"><span id="SCastInserted_71_26" title="Not referenced">SCastInserted</span></span> = [<span class="cons_String">Converting</span> <span class="cons_String">from</span> [<a href="#StrategoLang-SType_45_3" id="StrategoLang-SType_71_60" title="Defined at line 45">StrategoLang-SType</a>] <span class="cons_String">to</span> [<a href="#StrategoLang-SType_45_3" id="StrategoLang-SType_71_84" title="Defined at line 45">StrategoLang-SType</a>] <span class="cons_String">with</span> <span class="cons_String">a</span> <span class="cons_String">cast.</span>] { }
  <span id="StrategoLang-ErrorDesc_72_3" title="Not referenced">StrategoLang-ErrorDesc</span>.<span class="cons_Constructor"><span id="VariableBoundToIncompatibleType_72_26" title="Not referenced">VariableBoundToIncompatibleType</span></span> = [<span class="cons_String">This</span> <span class="cons_String">variable</span> <span class="cons_String">has</span> <span class="cons_String">type</span> [<a href="#StrategoLang-Type_41_3" id="StrategoLang-Type_72_85" title="Defined at line 41, 42">StrategoLang-Type</a>]<span class="cons_String">,</span> <span class="cons_String">which</span> <span class="cons_String">cannot</span> <span class="cons_String">be</span> <span class="cons_String">converted</span> <span class="cons_String">to</span> [<a href="#StrategoLang-Type_41_3" id="StrategoLang-Type_72_135" title="Defined at line 41, 42">StrategoLang-Type</a>] <span class="cons_String">automatically.</span>] { }
  <span id="StrategoLang-ErrorDesc_73_3" title="Not referenced">StrategoLang-ErrorDesc</span>.<span class="cons_Constructor"><span id="NoLUBBetween_73_26" title="Not referenced">NoLUBBetween</span></span> = [<span class="cons_String">Expected</span> [<a href="#StrategoLang-Type_41_3" id="StrategoLang-Type_73_52" title="Defined at line 41, 42">StrategoLang-Type</a>] <span class="cons_String">and</span> [<a href="#StrategoLang-Type_41_3" id="StrategoLang-Type_73_76" title="Defined at line 41, 42">StrategoLang-Type</a>] <span class="cons_String">to</span> <span class="cons_String">have</span> <span class="cons_String">a</span> <span class="cons_String">shared</span> <span class="cons_String">least</span> <span class="cons_String">upper</span> <span class="cons_String">bound</span> <span class="cons_String">but</span> <span class="cons_String">none</span> <span class="cons_String">was</span> <span class="cons_String">found.</span>] { }
  <span id="StrategoLang-ErrorDesc_74_3" title="Not referenced">StrategoLang-ErrorDesc</span>.<span class="cons_Constructor"><span id="STypeMismatch_74_26" title="Not referenced">STypeMismatch</span></span> = [<span class="cons_String">Expected</span> [<a href="#StrategoLang-SType_45_3" id="StrategoLang-SType_74_53" title="Defined at line 45">StrategoLang-SType</a>]<span class="cons_String">,</span> <span class="cons_String">but</span> <span class="cons_String">got</span> [<a href="#StrategoLang-SType_45_3" id="StrategoLang-SType_74_83" title="Defined at line 45">StrategoLang-SType</a>]<span class="cons_String">.</span>] { }
  <span id="StrategoLang-ErrorDesc_75_3" title="Not referenced">StrategoLang-ErrorDesc</span>.<span class="cons_Constructor"><span id="UnresolvedLocal_75_26" title="Not referenced">UnresolvedLocal</span></span> = [<span class="cons_String">Undefined</span> <span class="cons_String">local</span> <span class="cons_String">variable.</span>] { }
  <span id="StrategoLang-ErrorDesc_76_3" title="Not referenced">StrategoLang-ErrorDesc</span>.<span class="cons_Constructor"><span id="UnresolvedSort_76_26" title="Not referenced">UnresolvedSort</span></span> = [<span class="cons_String">Undefined</span> <span class="cons_String">sort</span> <span class="cons_String">with</span> <span class="cons_String">arity</span> [<a href="../../core/constants-namespaced.sdf3/#StrategoLang-Int_8_3" id="StrategoLang-Int_76_71" title="Defined at ../../core/constants-namespaced.sdf3 line 8">StrategoLang-Int</a>]<span class="cons_String">.</span>] { }
  <span id="StrategoLang-ErrorDesc_77_3" title="Not referenced">StrategoLang-ErrorDesc</span>.<span class="cons_Constructor"><span id="UnresolvedSortVar_77_26" title="Not referenced">UnresolvedSortVar</span></span> = [<span class="cons_String">Undefined</span> <span class="cons_String">sort</span> <span class="cons_String">variable.</span>] { }
  <span id="StrategoLang-ErrorDesc_78_3" title="Not referenced">StrategoLang-ErrorDesc</span>.<span class="cons_Constructor"><span id="UnresolvedConstructor_78_26" title="Not referenced">UnresolvedConstructor</span></span> = [<span class="cons_String">Undefined</span> <span class="cons_String">constructor</span> <span class="cons_String">with</span> <span class="cons_String">arity</span> [<a href="../../core/constants-namespaced.sdf3/#StrategoLang-Int_8_3" id="StrategoLang-Int_78_85" title="Defined at ../../core/constants-namespaced.sdf3 line 8">StrategoLang-Int</a>] <span class="cons_String">and</span> <span class="cons_String">type</span> [<a href="#StrategoLang-Type_41_3" id="StrategoLang-Type_78_113" title="Defined at line 41, 42">StrategoLang-Type</a>]<span class="cons_String">.</span>] { }
  <span id="StrategoLang-ErrorDesc_79_3" title="Not referenced">StrategoLang-ErrorDesc</span>.<span class="cons_Constructor"><span id="UnresolvedStrategy_79_26" title="Not referenced">UnresolvedStrategy</span></span> = [<span class="cons_String">Undefined</span> <span class="cons_String">strategy</span> <span class="cons_String">with</span> <span class="cons_String">arity</span> [<a href="../../core/constants-namespaced.sdf3/#StrategoLang-Int_8_3" id="StrategoLang-Int_79_79" title="Defined at ../../core/constants-namespaced.sdf3 line 8">StrategoLang-Int</a>]<span class="cons_String">/</span>[<a href="../../core/constants-namespaced.sdf3/#StrategoLang-Int_8_3" id="StrategoLang-Int_79_98" title="Defined at ../../core/constants-namespaced.sdf3 line 8">StrategoLang-Int</a>]<span class="cons_String">.</span>] { }
  <span id="StrategoLang-ErrorDesc_80_3" title="Not referenced">StrategoLang-ErrorDesc</span>.<span class="cons_Constructor"><span id="AmbiguousConstructorUse_80_26" title="Not referenced">AmbiguousConstructorUse</span></span> = [<span class="cons_String">Ambiguous</span> <span class="cons_String">use</span> <span class="cons_String">of</span> <span class="cons_String">constructor,</span> <span class="cons_String">could</span> <span class="cons_String">be</span> <span class="cons_String">the</span> <span class="cons_String">following</span> <span class="cons_String">types:</span> [{<a href="#StrategoLang-Type_41_3" id="StrategoLang-Type_80_115" title="Defined at line 41, 42">StrategoLang-Type</a> <span class="cons_Lit">", "</span>}+]] { }
  <span id="StrategoLang-ErrorDesc_81_3" title="Not referenced">StrategoLang-ErrorDesc</span>.<span class="cons_Constructor"><span id="UnboundTypeVar_81_26" title="Not referenced">UnboundTypeVar</span></span> = [<span class="cons_String">No</span> <span class="cons_String">instantiation</span> <span class="cons_String">found</span> <span class="cons_String">for</span> <span class="cons_String">type</span> <span class="cons_String">variable</span> [<a href="../../core/constants-namespaced.sdf3/#StrategoLang-String_10_3" id="StrategoLang-String_81_86" title="Defined at ../../core/constants-namespaced.sdf3 line 10">StrategoLang-String</a>]] { }
  <span id="StrategoLang-ErrorDesc_82_3" title="Not referenced">StrategoLang-ErrorDesc</span>.<span class="cons_Constructor"><span id="LiteralCastFail_82_26" title="Not referenced">LiteralCastFail</span></span> = [<span class="cons_String">Cannot</span> <span class="cons_String">compile</span> <span class="cons_String">literal</span> <span class="cons_String">failing</span> <span class="cons_String">cast</span>] { }
  <span id="StrategoLang-ErrorDesc_83_3" title="Not referenced">StrategoLang-ErrorDesc</span>.<span class="cons_Constructor"><span id="MissingParsingInfoOnStringQuotation_83_26" title="Not referenced">MissingParsingInfoOnStringQuotation</span></span> = [<span class="cons_String">String</span> <span class="cons_String">quotation</span> <span class="cons_String">does</span> <span class="cons_String">not</span> <span class="cons_String">have</span> <span class="cons_String">parser</span> <span class="cons_String">information</span> <span class="cons_String">required</span> <span class="cons_String">to</span> <span class="cons_String">figure</span> <span class="cons_String">out</span> <span class="cons_String">indentation.</span>] { }
  <span id="StrategoLang-ErrorDesc_84_3" title="Not referenced">StrategoLang-ErrorDesc</span>.<span class="cons_Constructor"><span id="StrategyCongruenceOverlap_84_26" title="Not referenced">StrategyCongruenceOverlap</span></span> = [<span class="cons_String">Strategy</span> <span class="cons_String">overlaps</span> <span class="cons_String">with</span> <span class="cons_String">congruence</span> <span class="cons_String">for</span> <span class="cons_String">constructor</span> <span class="cons_String">of</span> <span class="cons_String">same</span> <span class="cons_String">name.</span>] { }
  <span id="StrategoLang-ErrorDesc_85_3" title="Not referenced">StrategoLang-ErrorDesc</span>.<span class="cons_Constructor"><span id="GadtSort_85_26" title="Not referenced">GadtSort</span></span> = [<span class="cons_String">Must</span> <span class="cons_String">use</span> <span class="cons_String">all</span> <span class="cons_String">unique</span> <span class="cons_String">sort</span> <span class="cons_String">variables</span> <span class="cons_String">as</span> <span class="cons_String">sort</span> <span class="cons_String">arguments,</span> <span class="cons_String">GADTs</span> <span class="cons_String">are</span> <span class="cons_String">not</span> <span class="cons_String">supported.</span>] { }
  <span id="StrategoLang-ErrorDesc_86_3" title="Not referenced">StrategoLang-ErrorDesc</span>.<span class="cons_Constructor"><span id="AsInBuildTerm_86_26" title="Not referenced">AsInBuildTerm</span></span> = [<span class="cons_String">The</span> <span class="cons_String">@</span> <span class="cons_String">pattern</span> <span class="cons_String">may</span> <span class="cons_String">not</span> <span class="cons_String">be</span> <span class="cons_String">used</span> <span class="cons_String">in</span> <span class="cons_String">build</span> <span class="cons_String">context.</span>] { }
  <span id="StrategoLang-ErrorDesc_87_3" title="Not referenced">StrategoLang-ErrorDesc</span>.<span class="cons_Constructor"><span id="WldInBuildTerm_87_26" title="Not referenced">WldInBuildTerm</span></span> = [<span class="cons_String">The</span> <span class="cons_String">_</span> <span class="cons_String">pattern</span> <span class="cons_String">may</span> <span class="cons_String">not</span> <span class="cons_String">be</span> <span class="cons_String">used</span> <span class="cons_String">in</span> <span class="cons_String">build</span> <span class="cons_String">context.</span>] { }
  <span id="StrategoLang-ErrorDesc_88_3" title="Not referenced">StrategoLang-ErrorDesc</span>.<span class="cons_Constructor"><span id="BuildDefaultInBuildTerm_88_26" title="Not referenced">BuildDefaultInBuildTerm</span></span> = [<span class="cons_String">The</span> <span class="cons_String">_name</span> <span class="cons_String">pattern</span> <span class="cons_String">may</span> <span class="cons_String">not</span> <span class="cons_String">be</span> <span class="cons_String">used</span> <span class="cons_String">in</span> <span class="cons_String">build</span> <span class="cons_String">context.</span>] { }
  <span id="StrategoLang-ErrorDesc_89_3" title="Not referenced">StrategoLang-ErrorDesc</span>.<span class="cons_Constructor"><span id="BuildDefaultInMatchTerm_89_26" title="Not referenced">BuildDefaultInMatchTerm</span></span> = [<span class="cons_String">The</span> <span class="cons_String">_name</span> <span class="cons_String">pattern</span> <span class="cons_String">may</span> <span class="cons_String">not</span> <span class="cons_String">be</span> <span class="cons_String">used</span> <span class="cons_String">in</span> <span class="cons_String">match</span> <span class="cons_String">context.</span>] { }
  <span id="StrategoLang-ErrorDesc_90_3" title="Not referenced">StrategoLang-ErrorDesc</span>.<span class="cons_Constructor"><span id="StringQuotationInMatchTerm_90_26" title="Not referenced">StringQuotationInMatchTerm</span></span> = [<span class="cons_String">A</span> <span class="cons_String">string</span> <span class="cons_String">quotation</span> <span class="cons_String">pattern</span> <span class="cons_String">may</span> <span class="cons_String">not</span> <span class="cons_String">be</span> <span class="cons_String">used</span> <span class="cons_String">in</span> <span class="cons_String">match</span> <span class="cons_String">context.</span>] { }
  <span id="StrategoLang-ErrorDesc_91_3" title="Not referenced">StrategoLang-ErrorDesc</span>.<span class="cons_Constructor"><span id="NonStringOrListInExplodeConsPosition_91_26" title="Not referenced">NonStringOrListInExplodeConsPosition</span></span> = [<span class="cons_String">Expected</span> <span class="cons_String">type</span> <span class="cons_String">string</span> <span class="cons_String">or</span> <span class="cons_String">list,</span> <span class="cons_String">but</span> <span class="cons_String">got</span> [<a href="#StrategoLang-Type_41_3" id="StrategoLang-Type_91_105" title="Defined at line 41, 42">StrategoLang-Type</a>]<span class="cons_String">.</span>] { }
  <span id="StrategoLang-ErrorDesc_92_3" title="Not referenced">StrategoLang-ErrorDesc</span>.<span class="cons_Constructor"><span id="NonListInAnno_92_26" title="Not referenced">NonListInAnno</span></span> = [<span class="cons_String">Expected</span> <span class="cons_String">list,</span> <span class="cons_String">but</span> <span class="cons_String">got</span> [<a href="#StrategoLang-Type_41_3" id="StrategoLang-Type_92_67" title="Defined at line 41, 42">StrategoLang-Type</a>]<span class="cons_String">.</span>] { }
  <span id="StrategoLang-ErrorDesc_93_3" title="Not referenced">StrategoLang-ErrorDesc</span>.<span class="cons_Constructor"><span id="MultipleAppsInMatch_93_26" title="Not referenced">MultipleAppsInMatch</span></span> = [<span class="cons_String">Multiple</span> <span class="cons_String">projections</span> <span class="cons_String">in</span> <span class="cons_String">one</span> <span class="cons_String">pattern,</span> <span class="cons_String">only</span> <span class="cons_String">one</span> <span class="cons_String">is</span> <span class="cons_String">actually</span> <span class="cons_String">returned.</span> ] { }
  <span id="StrategoLang-ErrorDesc_94_3" title="Not referenced">StrategoLang-ErrorDesc</span>.<span class="cons_Constructor"><span id="MatchNotSpecificEnoughForTP_94_26" title="Not referenced">MatchNotSpecificEnoughForTP</span></span> = [<span class="cons_String">Cannot</span> <span class="cons_String">infer</span> <span class="cons_String">specific</span> <span class="cons_String">type</span> <span class="cons_String">for</span> <span class="cons_String">TP</span> <span class="cons_String">rule</span> <span class="cons_String">match.</span> <span class="cons_String">Found</span> <span class="cons_String">result:</span> [<a href="#StrategoLang-Type_41_3" id="StrategoLang-Type_94_118" title="Defined at line 41, 42">StrategoLang-Type</a>]<span class="cons_String">.</span> ] { }
  <span id="StrategoLang-ErrorDesc_95_3" title="Not referenced">StrategoLang-ErrorDesc</span>.<span class="cons_Constructor"><span id="UnsupportedCastRequiredInDynamicRule_95_26" title="Not referenced">UnsupportedCastRequiredInDynamicRule</span></span> = [<span class="cons_String">Pattern</span> <span class="cons_String">induces</span> <span class="cons_String">cast,</span> <span class="cons_String">but</span> <span class="cons_String">cast</span> <span class="cons_String">is</span> <span class="cons_String">not</span> <span class="cons_String">supported</span> <span class="cons_String">in</span> <span class="cons_String">this</span> <span class="cons_String">position.</span> ] { }
  <span id="StrategoLang-ErrorDesc_96_3" title="Not referenced">StrategoLang-ErrorDesc</span>.<span class="cons_Constructor"><span id="DynRuleOverlapError_96_26" title="Not referenced">DynRuleOverlapError</span></span> = [<span class="cons_String">Overlapping</span> <span class="cons_String">left-hand-sides</span> <span class="cons_String">for</span> <span class="cons_String">dynamic</span> <span class="cons_String">rule</span> <span class="cons_String">'</span>[<a href="../../core/identifiers-namespaced.sdf3/#StrategoLang-Id_27_3" id="StrategoLang-Id_96_96" title="Defined at ../../core/identifiers-namespaced.sdf3 line 27, 29, 49, 50, 51">StrategoLang-Id</a>]<span class="cons_String">':</span> [<a href="../../core/constants-namespaced.sdf3/#StrategoLang-String_10_3" id="StrategoLang-String_96_116" title="Defined at ../../core/constants-namespaced.sdf3 line 10">StrategoLang-String</a>] <span class="cons_String">in</span> [<a href="../../core/constants-namespaced.sdf3/#StrategoLang-String_10_3" id="StrategoLang-String_96_141" title="Defined at ../../core/constants-namespaced.sdf3 line 10">StrategoLang-String</a>] <span class="cons_String">overlaps</span> <span class="cons_String">with</span> [<a href="../../core/constants-namespaced.sdf3/#StrategoLang-String_10_3" id="StrategoLang-String_96_177" title="Defined at ../../core/constants-namespaced.sdf3 line 10">StrategoLang-String</a>] <span class="cons_String">in</span> [<a href="../../core/constants-namespaced.sdf3/#StrategoLang-String_10_3" id="StrategoLang-String_96_202" title="Defined at ../../core/constants-namespaced.sdf3 line 10">StrategoLang-String</a>]<span class="cons_String">.</span> ] { }
  <span id="StrategoLang-ErrorDesc_97_3" title="Not referenced">StrategoLang-ErrorDesc</span>.<span class="cons_Constructor"><span id="CannotCastToRigidTypeVar_97_26" title="Not referenced">CannotCastToRigidTypeVar</span></span> = [<span class="cons_String">Cannot</span> <span class="cons_String">cast</span> [<a href="#StrategoLang-Type_41_3" id="StrategoLang-Type_97_67" title="Defined at line 41, 42">StrategoLang-Type</a>] <span class="cons_String">to</span> <span class="cons_String">type</span> [<a href="#StrategoLang-Type_41_3" id="StrategoLang-Type_97_95" title="Defined at line 41, 42">StrategoLang-Type</a>]<span class="cons_String">,</span> <span class="cons_String">its</span> <span class="cons_String">type</span> <span class="cons_String">is</span> <span class="cons_String">not</span> <span class="cons_String">known</span> <span class="cons_String">at</span> <span class="cons_String">run-time</span> <span class="cons_String">in</span> <span class="cons_String">this</span> <span class="cons_String">position.</span> ] { }
  <span id="StrategoLang-ErrorDesc_98_3" title="Not referenced">StrategoLang-ErrorDesc</span>.<span class="cons_Constructor"><span id="WithClauseInDynRule_98_26" title="Not referenced">WithClauseInDynRule</span></span> = [<span class="cons_String">Cannot</span> <span class="cons_String">use</span> <span class="cons_String">with</span> <span class="cons_String">clauses</span> <span class="cons_String">in</span> <span class="cons_String">dynamic</span> <span class="cons_String">rules.</span> ] { }
  <span id="StrategoLang-ErrorDesc_99_3" title="Not referenced">StrategoLang-ErrorDesc</span>.<span class="cons_Constructor"><span id="ConstantCongruence_99_26" title="Not referenced">ConstantCongruence</span></span> = [<span class="cons_String">Simple</span> <span class="cons_String">matching</span> <span class="cons_String">congruence:</span> <span class="cons_String">prefix</span> <span class="cons_String">with</span> <span class="cons_String">'?'.</span> <span class="cons_String">Or</span> <span class="cons_String">with</span> <span class="cons_String">'!'</span> <span class="cons_String">if</span> <span class="cons_String">you</span> <span class="cons_String">meant</span> <span class="cons_String">to</span> <span class="cons_String">build.</span> ] { }
  <span id="StrategoLang-ErrorDesc_100_3" title="Not referenced">StrategoLang-ErrorDesc</span>.<span class="cons_Constructor"><span id="WldInOverlay_100_26" title="Not referenced">WldInOverlay</span></span> = [<span class="cons_String">Wildcard</span> <span class="cons_String">not</span> <span class="cons_String">allowed</span> <span class="cons_String">in</span> <span class="cons_String">overlay,</span> <span class="cons_String">add</span> <span class="cons_String">a</span> <span class="cons_String">default</span> <span class="cons_String">value</span> <span class="cons_String">after</span> <span class="cons_String">the</span> <span class="cons_String">underscore.</span> ] { }
  <span id="StrategoLang-ErrorDesc_101_3" title="Not referenced">StrategoLang-ErrorDesc</span>.<span class="cons_Constructor"><span id="AsInOverlay_101_26" title="Not referenced">AsInOverlay</span></span> = [<span class="cons_String">As</span> <span class="cons_String">pattern</span> <span class="cons_String">not</span> <span class="cons_String">allowed</span> <span class="cons_String">in</span> <span class="cons_String">overlay.</span> ] { }
  <span id="StrategoLang-ErrorDesc_102_3" title="Not referenced">StrategoLang-ErrorDesc</span>.<span class="cons_Constructor"><span id="StringQuotationInOverlay_102_26" title="Not referenced">StringQuotationInOverlay</span></span> = [<span class="cons_String">The</span> <span class="cons_String">string</span> <span class="cons_String">quotation</span> <span class="cons_String">pattern</span> <span class="cons_String">may</span> <span class="cons_String">not</span> <span class="cons_String">be</span> <span class="cons_String">used</span> <span class="cons_String">in</span> <span class="cons_String">overlay.</span> ] { }
  <span id="StrategoLang-ErrorDesc_103_3" title="Not referenced">StrategoLang-ErrorDesc</span>.<span class="cons_Constructor"><span id="MissingTypeDefinition_103_26" title="Not referenced">MissingTypeDefinition</span></span> = [<span class="cons_String">Missing</span> <span class="cons_String">type</span> <span class="cons_String">definition.</span> ] { }

</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
