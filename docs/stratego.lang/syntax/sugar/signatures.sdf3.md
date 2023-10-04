---
title: signatures.sdf3
hide:
  - toc
---

# `signatures.sdf3`

:simple-github: [pdmosses/stratego/stratego.lang/syntax/sugar/signatures.sdf3]

[pdmosses/stratego/stratego.lang/syntax/sugar/signatures.sdf3]: https://github.com/pdmosses/stratego/blob/master/stratego.lang/syntax/sugar/signatures.sdf3 "The source file on GitHub"

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
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <a href="../strategies.sdf3#sugar/signatures_147_163" id="sugar/signatures_7_23" title="Referenced at ../strategies.sdf3 line 10">sugar/signatures</a>

<span class="keyword">imports</span>
  <a href="../../core/signatures.sdf3#core/signatures_7_22" id="core/signatures_35_50" title="Defined at ../../core/signatures.sdf3 line 1">core/signatures</a>
  <a href="../constants.sdf3#sugar/constants_7_22" id="sugar/constants_53_68" title="Defined at ../constants.sdf3 line 1">sugar/constants</a>
  <a href="../../core/identifiers.sdf3#core/identifiers_7_23" id="core/identifiers_71_87" title="Defined at ../../core/identifiers.sdf3 line 1">core/identifiers</a>

<span class="keyword">context-free syntax</span>
  <a href="#Sort_364_368" id="Sort_111_115" title="Referenced at line 11">Sort</a>.<span class="cons_Constructor"><span id="SortList_116_124" title="Not referenced locally, nor via imports">SortList</span></span>   = &lt;<span class="cons_String">[</span>&lt;{<a href="#Sort_111_115" id="Sort_133_137" title="Defined at line 9, 10, 11">Sort</a> <span class="cons_Lit">", "</span>}*&gt; <span class="cons_String">]</span>&gt; {<span class="keyword">deprecated</span>("This syntax never had real meaning and will be dropped")}
  <a href="#Sort_364_368" id="Sort_222_226" title="Referenced at line 11">Sort</a>.<span class="cons_Constructor"><span id="SortListTl_227_237" title="Not referenced locally, nor via imports">SortListTl</span></span> = &lt;<span class="cons_String">[</span>&lt;{<a href="#Sort_111_115" id="Sort_244_248" title="Defined at line 9, 10, 11">Sort</a> <span class="cons_Lit">", "</span>}*&gt; <span class="cons_String">|</span> &lt;<a href="#Sort_111_115" id="Sort_260_264" title="Defined at line 9, 10, 11">Sort</a>&gt; <span class="cons_String">]</span>&gt; {<span class="keyword">deprecated</span>("This syntax never had real meaning and will be dropped")}
  <a href="#Sort_364_368" id="Sort_342_346" title="Referenced at line 11">Sort</a>.<span class="cons_Constructor"><span id="SortTuple_347_356" title="Not referenced locally, nor via imports">SortTuple</span></span>  = &lt;<span class="cons_String">(</span>&lt;{<a href="#Sort_111_115" id="Sort_364_368" title="Defined at line 9, 10, 11">Sort</a> <span class="cons_Lit">", "</span>}*&gt; <span class="cons_String">)</span>&gt; {<span class="keyword">deprecated</span>("This syntax is being replaced")}

</code></pre></td></tr></tbody></table></div>