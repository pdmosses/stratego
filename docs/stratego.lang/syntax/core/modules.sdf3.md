---
title: modules.sdf3
hide:
  - toc
---

# `modules.sdf3`

:simple-github: [pdmosses/stratego/stratego.lang/syntax/core/modules.sdf3]

[pdmosses/stratego/stratego.lang/syntax/core/modules.sdf3]: https://github.com/pdmosses/stratego/blob/master/stratego.lang/syntax/core/modules.sdf3 "The source file on GitHub"

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
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <a href="../../sugar/modules.sdf3#core/modules_31_43" id="core/modules_7_19" title="Referenced at ../../sugar/modules.sdf3 line 3">core/modules</a>

<span class="keyword">imports</span>
  <a href="../identifiers.sdf3#core/identifiers_7_23" id="core/identifiers_31_47" title="Defined at ../identifiers.sdf3 line 1">core/identifiers</a>
  <a href="../layout.sdf3#core/layout_7_18" id="core/layout_50_61" title="Defined at ../layout.sdf3 line 1">core/layout</a>
  <a href="../signatures.sdf3#core/signatures_7_22" id="core/signatures_64_79" title="Defined at ../signatures.sdf3 line 1">core/signatures</a>
  <a href="../strategies.sdf3#core/strategies_7_22" id="core/strategies_82_97" title="Defined at ../strategies.sdf3 line 1">core/strategies</a>

<span class="keyword">context-free sorts</span> <a href="../../StrategoLang.sdf3#Module_104_110" id="Module_118_124" title="Referenced at ../../StrategoLang.sdf3 line 7; ../../gradual-types/internal.sdf3 line 15">Module</a>
<span class="keyword">context-free syntax</span>

  <a href="../../StrategoLang.sdf3#Module_104_110" id="Module_148_154" title="Referenced at ../../StrategoLang.sdf3 line 7; ../../gradual-types/internal.sdf3 line 15">Module</a>.<span class="cons_Constructor"><span id="Module_155_161" title="Not referenced locally, nor via imports">Module</span></span> =
&lt;<span class="cons_String">module</span> &lt;<a href="../identifiers.sdf3#ModName_39_46" id="ModName_173_180" title="Defined at ../identifiers.sdf3 line 3, 5, 10, 11, 12, 13, 14">ModName</a>&gt;

&lt;{<a href="#AnnoDecl_294_302" id="AnnoDecl_185_193" title="Defined at line 22, 38">AnnoDecl</a> <span class="cons_Lit">"\n\n"</span>}*&gt;&gt;

  <a href="../../StrategoLang.sdf3#Module_104_110" id="Module_208_214" title="Referenced at ../../StrategoLang.sdf3 line 7; ../../gradual-types/internal.sdf3 line 15">Module</a>.<span class="cons_Constructor"><span id="Specification_215_228" title="Not referenced locally, nor via imports">Specification</span></span> =
&lt;<span class="cons_String">specification</span>

&lt;{<a href="#AnnoDecl_294_302" id="AnnoDecl_249_257" title="Defined at line 22, 38">AnnoDecl</a> <span class="cons_Lit">"\n\n"</span>}*&gt;&gt;

<span class="keyword">context-free sorts</span> <a href="#Decl_491_495" id="Decl_289_293" title="Referenced at line 38">Decl</a> <a href="#AnnoDecl_249_257" id="AnnoDecl_294_302" title="Referenced at line 20">AnnoDecl</a>
<span class="keyword">context-free syntax</span>
  <a href="#Decl_491_495" id="Decl_325_329" title="Referenced at line 38">Decl</a>.<span class="cons_Constructor"><span id="Imports_330_337" title="Not referenced locally, nor via imports">Imports</span></span> =
&lt;<span class="cons_String">imports</span>

&lt;{<a href="#ImportModName_516_529" id="ImportModName_352_365" title="Defined at line 40, 42, 45">ImportModName</a> <span class="cons_Lit">"\n"</span>}*&gt;&gt;

  <a href="#Decl_491_495" id="Decl_378_382" title="Referenced at line 38">Decl</a>.<span class="cons_Constructor"><span id="Strategies_383_393" title="Not referenced locally, nor via imports">Strategies</span></span> = 
&lt;<span class="cons_String">strategies</span>

&lt;{<a href="../strategies.sdf3#Def_187_190" id="Def_412_415" title="Defined at ../strategies.sdf3 line 13, 15, 25">Def</a> <span class="cons_Lit">"\n\n"</span>}*&gt;&gt;

  <a href="#Decl_491_495" id="Decl_430_434" title="Referenced at line 38">Decl</a>.<span class="cons_Constructor"><span id="Signature_435_444" title="Not referenced locally, nor via imports">Signature</span></span> =
&lt;<span class="cons_String">signature</span>
&lt;{<a href="../signatures.sdf3#Sdecl_596_601" id="Sdecl_460_465" title="Defined at ../signatures.sdf3 line 20, 23, 26">Sdecl</a> <span class="cons_Lit">"\n\n"</span>}*&gt;&gt;

  <a href="#AnnoDecl_249_257" id="AnnoDecl_480_488" title="Referenced at line 20">AnnoDecl</a> = <a href="#Decl_289_293" id="Decl_491_495" title="Defined at line 22, 24, 29, 34">Decl</a>

<span class="keyword">context-free sorts</span> <a href="#ImportModName_352_365" id="ImportModName_516_529" title="Referenced at line 27">ImportModName</a>
<span class="keyword">context-free syntax</span>
  <a href="#ImportModName_352_365" id="ImportModName_552_565" title="Referenced at line 27">ImportModName</a>.<span class="cons_Constructor"><span id="Import_566_572" title="Not referenced locally, nor via imports">Import</span></span> = <a href="../identifiers.sdf3#ModName_39_46" id="ModName_575_582" title="Defined at ../identifiers.sdf3 line 3, 5, 10, 11, 12, 13, 14">ModName</a>

<span class="keyword">syntax</span>
  <a href="#ImportModName_352_365" id="ImportModName_593_606" title="Referenced at line 27">ImportModName</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="ImportWildcard_610_624" title="Not referenced locally, nor via imports">ImportWildcard</span></span> = <a href="../identifiers.sdf3#ModName_39_46" id="ModName_627_634" title="Defined at ../identifiers.sdf3 line 3, 5, 10, 11, 12, 13, 14">ModName</a><span class="keyword">-CF</span> <span class="cons_Lit">"/"</span> <span class="cons_Lit">"-"</span>


</code></pre></td></tr></tbody></table></div>