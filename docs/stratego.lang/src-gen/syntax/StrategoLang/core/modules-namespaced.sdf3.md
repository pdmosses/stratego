---
title: modules-namespaced.sdf3
hide:
  - toc
---

# `modules-namespaced.sdf3`



[pdmosses/stratego/stratego.lang/src-gen/syntax/StrategoLang/core/modules-namespaced.sdf3]: https://github.com/pdmosses/stratego/blob/master/stratego.lang/src-gen/syntax/StrategoLang/core/modules-namespaced.sdf3 "The source file on GitHub"

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
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <button class="modal-open" id="StrategoLang/core/modules-namespaced_1_8" title="Multi-file references" data-urls="../main-namespaced.sdf3/#StrategoLang/core/modules-namespaced_10_3 line 10; ../../StrategoLang-namespaced.sdf3/#StrategoLang/core/modules-namespaced_5_3 line 5; ../../gradual-types/internal-namespaced.sdf3/#StrategoLang/core/modules-namespaced_6_3 line 6; ../../sugar/main-namespaced.sdf3/#StrategoLang/core/modules-namespaced_5_3 line 5; ../../sugar/modules-namespaced.sdf3/#StrategoLang/core/modules-namespaced_4_3 line 4">StrategoLang/core/modules-namespaced</button>

<span class="keyword">imports</span>
  <a href="../identifiers-namespaced.sdf3/#StrategoLang/core/identifiers-namespaced_1_8" id="StrategoLang/core/identifiers-namespaced_4_3" title="Defined at ../identifiers-namespaced.sdf3 line 1">StrategoLang/core/identifiers-namespaced</a>        
  <a href="../layout-namespaced.sdf3/#StrategoLang/core/layout-namespaced_1_8" id="StrategoLang/core/layout-namespaced_5_3" title="Defined at ../layout-namespaced.sdf3 line 1">StrategoLang/core/layout-namespaced</a>        
  <a href="../signatures-namespaced.sdf3/#StrategoLang/core/signatures-namespaced_1_8" id="StrategoLang/core/signatures-namespaced_6_3" title="Defined at ../signatures-namespaced.sdf3 line 1">StrategoLang/core/signatures-namespaced</a>        
  <a href="../strategies-namespaced.sdf3/#StrategoLang/core/strategies-namespaced_1_8" id="StrategoLang/core/strategies-namespaced_7_3" title="Defined at ../strategies-namespaced.sdf3 line 1">StrategoLang/core/strategies-namespaced</a>

<span class="keyword">sorts</span> <a href="../../gradual-types/internal-namespaced.sdf3/#StrategoLang-Module_16_7" id="StrategoLang-Module_9_7" title="Referenced at ../../gradual-types/internal-namespaced.sdf3 line 16">StrategoLang-Module</a>

<span class="keyword">context-free syntax</span>

  <a href="../../gradual-types/internal-namespaced.sdf3/#StrategoLang-Module_16_7" id="StrategoLang-Module_13_3" title="Referenced at ../../gradual-types/internal-namespaced.sdf3 line 16">StrategoLang-Module</a>.<span class="cons_Constructor"><span id="Module_13_23" title="Not referenced">Module</span></span> = &lt;<span class="cons_String">module</span> &lt;<a href="../identifiers-namespaced.sdf3/#StrategoLang-ModName_8_3" id="StrategoLang-ModName_13_41" title="Defined at ../identifiers-namespaced.sdf3 line 8, 17, 18, 19, 20, 21">StrategoLang-ModName</a>&gt;

&lt;{<a href="#StrategoLang-AnnoDecl_20_25" id="StrategoLang-AnnoDecl_15_3" title="Defined at line 20, 32">StrategoLang-AnnoDecl</a> <span class="cons_Lit">"\n\n"</span>}*&gt;&gt; { }
  <a href="../../gradual-types/internal-namespaced.sdf3/#StrategoLang-Module_16_7" id="StrategoLang-Module_16_3" title="Referenced at ../../gradual-types/internal-namespaced.sdf3 line 16">StrategoLang-Module</a>.<span class="cons_Constructor"><span id="Specification_16_23" title="Not referenced">Specification</span></span> = &lt;<span class="cons_String">specification</span>

&lt;{<a href="#StrategoLang-AnnoDecl_20_25" id="StrategoLang-AnnoDecl_18_3" title="Defined at line 20, 32">StrategoLang-AnnoDecl</a> <span class="cons_Lit">"\n\n"</span>}*&gt;&gt; { }

<span class="keyword">sorts</span> <a href="#StrategoLang-Decl_32_27" id="StrategoLang-Decl_20_7" title="Referenced at line 32">StrategoLang-Decl</a> <a href="#StrategoLang-AnnoDecl_15_3" id="StrategoLang-AnnoDecl_20_25" title="Referenced at line 15, 18">StrategoLang-AnnoDecl</a>

<span class="keyword">context-free syntax</span>

  <a href="#StrategoLang-Decl_32_27" id="StrategoLang-Decl_24_3" title="Referenced at line 32">StrategoLang-Decl</a>.<span class="cons_Constructor"><span id="Imports_24_21" title="Not referenced">Imports</span></span> = &lt;<span class="cons_String">imports</span>

&lt;{<a href="#StrategoLang-ImportModName_34_7" id="StrategoLang-ImportModName_26_3" title="Defined at line 34, 38, 42">StrategoLang-ImportModName</a> <span class="cons_Lit">"\n"</span>}*&gt;&gt; { }
  <a href="#StrategoLang-Decl_32_27" id="StrategoLang-Decl_27_3" title="Referenced at line 32">StrategoLang-Decl</a>.<span class="cons_Constructor"><span id="Strategies_27_21" title="Not referenced">Strategies</span></span> = &lt;<span class="cons_String">strategies</span>

&lt;{StrategoLang-Def <span class="cons_Lit">"\n\n"</span>}*&gt;&gt; { }
  <a href="#StrategoLang-Decl_32_27" id="StrategoLang-Decl_30_3" title="Referenced at line 32">StrategoLang-Decl</a>.<span class="cons_Constructor"><span id="Signature_30_21" title="Not referenced">Signature</span></span> = &lt;<span class="cons_String">signature</span>
&lt;{StrategoLang-Sdecl <span class="cons_Lit">"\n\n"</span>}*&gt;&gt; { }
  <a href="#StrategoLang-AnnoDecl_15_3" id="StrategoLang-AnnoDecl_32_3" title="Referenced at line 15, 18">StrategoLang-AnnoDecl</a> = <a href="#StrategoLang-Decl_20_7" id="StrategoLang-Decl_32_27" title="Defined at line 20, 24, 27, 30">StrategoLang-Decl</a> { }

<span class="keyword">sorts</span> <a href="#StrategoLang-ImportModName_26_3" id="StrategoLang-ImportModName_34_7" title="Referenced at line 26">StrategoLang-ImportModName</a>

<span class="keyword">context-free syntax</span>

  <a href="#StrategoLang-ImportModName_26_3" id="StrategoLang-ImportModName_38_3" title="Referenced at line 26">StrategoLang-ImportModName</a>.<span class="cons_Constructor"><span id="Import_38_30" title="Not referenced">Import</span></span> = <a href="../identifiers-namespaced.sdf3/#StrategoLang-ModName_8_3" id="StrategoLang-ModName_38_39" title="Defined at ../identifiers-namespaced.sdf3 line 8, 17, 18, 19, 20, 21">StrategoLang-ModName</a> { }

<span class="keyword">syntax</span>

  <a href="#StrategoLang-ImportModName_26_3" id="StrategoLang-ImportModName_42_3" title="Referenced at line 26">StrategoLang-ImportModName</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="ImportWildcard_42_33" title="Not referenced">ImportWildcard</span></span> = <a href="../identifiers-namespaced.sdf3/#StrategoLang-ModName_8_3" id="StrategoLang-ModName_42_50" title="Defined at ../identifiers-namespaced.sdf3 line 8, 17, 18, 19, 20, 21">StrategoLang-ModName</a><span class="keyword">-CF</span> <span class="cons_Lit">"/"</span> <span class="cons_Lit">"-"</span> { }

</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
