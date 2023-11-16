package com.projeto.falefacensserver.service;

import com.projeto.falefacensserver.model.Categoria;
import com.projeto.falefacensserver.model.Contato;
import com.projeto.falefacensserver.repositoy.CategoriaRepository;
import com.projeto.falefacensserver.repositoy.ContatoRepositoy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class InicializadorBanco implements CommandLineRunner {

    @Autowired
    private CategoriaRepository categoriaRepository;

    @Autowired
    private ContatoRepositoy contatoRepository;
    @Override
    public void run(String... args) throws Exception {
        this.createCategoria();
        this.createContato();
        this.vinculateContatoOnCategoria();
    }

    private void createCategoria(){
        Categoria analiseDesenvolvimentoSistemas = new Categoria();
        analiseDesenvolvimentoSistemas.setId(1L);
        analiseDesenvolvimentoSistemas.setNome("Análise e Desenvolvimento de Sistemas");
        analiseDesenvolvimentoSistemas.setContato(null);

        categoriaRepository.save(analiseDesenvolvimentoSistemas);

        Categoria bancoDados = new Categoria();
        bancoDados.setId(2L);
        bancoDados.setNome("Tecnologia em Banco de Dados");
        bancoDados.setContato(null);

        categoriaRepository.save(bancoDados);

        Categoria engenhariaProducao = new Categoria();
        engenhariaProducao.setId(3L);
        engenhariaProducao.setNome("Engenharia de Produção");
        engenhariaProducao.setContato(null);

        categoriaRepository.save(engenhariaProducao);

        Categoria engenhariaQuimica = new Categoria();
        engenhariaQuimica.setId(4L);
        engenhariaQuimica.setNome("Engenharia Química");
        engenhariaQuimica.setContato(null);

        categoriaRepository.save(engenhariaQuimica);

        Categoria engenhariaComputacao = new Categoria();
        engenhariaComputacao.setId(5L);
        engenhariaComputacao.setNome("Engenharia da Computação");
        engenhariaComputacao.setContato(null);

        categoriaRepository.save(engenhariaComputacao);

        Categoria engenhariaCivil = new Categoria();
        engenhariaCivil.setId(6L);
        engenhariaCivil.setNome("Engenharia Civil");
        engenhariaCivil.setContato(null);

        categoriaRepository.save(engenhariaCivil);

        Categoria engenhariaMecanica = new Categoria();
        engenhariaMecanica.setId(7L);
        engenhariaMecanica.setNome("Engenharia Mecânica");
        engenhariaMecanica.setContato(null);

        categoriaRepository.save(engenhariaMecanica);

        Categoria engenhariaEletrica = new Categoria();
        engenhariaEletrica.setId(8L);
        engenhariaEletrica.setNome("Engenharia Elétrica");
        engenhariaEletrica.setContato(null);

        categoriaRepository.save(engenhariaEletrica);

        Categoria engenhariaMecatronica = new Categoria();
        engenhariaMecatronica.setId(9L);
        engenhariaMecatronica.setNome("Engenharia Mecatrônica");
        engenhariaMecatronica.setContato(null);

        categoriaRepository.save(engenhariaMecatronica);

        Categoria engenhariaAlimentos = new Categoria();
        engenhariaAlimentos.setId(10L);
        engenhariaAlimentos.setNome("Engenharia de Alimentos");
        engenhariaAlimentos.setContato(null);

        categoriaRepository.save(engenhariaAlimentos);

        Categoria jogosDigitais = new Categoria();
        jogosDigitais.setId(11L);
        jogosDigitais.setNome("Tecnologia em Jogos Digitais");
        jogosDigitais.setContato(null);

        categoriaRepository.save(jogosDigitais);

        Categoria engenhariaAgronomica = new Categoria();
        engenhariaAgronomica.setId(12L);
        engenhariaAgronomica.setNome("Engenharia Agronômica");
        engenhariaAgronomica.setContato(null);

        categoriaRepository.save(engenhariaAgronomica);

        Categoria arquiteturaUrbanismo = new Categoria();
        arquiteturaUrbanismo.setId(13L);
        arquiteturaUrbanismo.setNome("Arquitetura e Urbanismo");
        arquiteturaUrbanismo.setContato(null);

        categoriaRepository.save(arquiteturaUrbanismo);

        Categoria psicologia = new Categoria();
        psicologia.setId(14L);
        psicologia.setNome("Psicologia");
        psicologia.setContato(null);

        categoriaRepository.save(psicologia);

        Categoria biomedicina = new Categoria();
        biomedicina.setId(15L);
        biomedicina.setNome("Biomedicina");
        biomedicina.setContato(null);

        categoriaRepository.save(biomedicina);

        Categoria odontologia = new Categoria();
        odontologia.setId(16L);
        odontologia.setNome("Odontologia");
        odontologia.setContato(null);

        categoriaRepository.save(odontologia);

        Categoria tecnologia = new Categoria();
        tecnologia.setId(17L);
        tecnologia.setNome("Tecnologia");
        tecnologia.setContato(null);

        categoriaRepository.save(tecnologia);
    }

    private void createContato() {
        Contato contatoEliney = new Contato(); // cursos de TI
        contatoEliney.setId(1L);
        contatoEliney.setNome("Eliney Sabino");
        contatoEliney.setEmail("eliney.sabino@facens.br");
        contatoEliney.setTelefone(null);

        contatoRepository.save(contatoEliney);

        Contato contatoAndrea = new Contato(); // computação e mecatrônica
        contatoAndrea.setId(2L);
        contatoAndrea.setNome("Andrea Lucia Braga Vieira Rodrigues");
        contatoAndrea.setEmail("andrea.braga@facens.br");
        contatoAndrea.setTelefone(null);

        contatoRepository.save(contatoAndrea);

        Contato contatoMarceloAguiar = new Contato(); // engenharia mecânica
        contatoMarceloAguiar.setId(3L);
        contatoMarceloAguiar.setNome("Marcelo Mendes de Aguiar");
        contatoMarceloAguiar.setEmail("marcelo.aguiar@facens.br");
        contatoMarceloAguiar.setTelefone(null);

        contatoRepository.save(contatoMarceloAguiar);

        Contato contatoGiovana = new Contato(); // arquitetura e urbanismo
        contatoGiovana.setId(4L);
        contatoGiovana.setNome("Giovanna Tomczinski Novellini Brígitte");
        contatoGiovana.setEmail("giovanna.novellini@facens.br");
        contatoGiovana.setTelefone(null);

        contatoRepository.save(contatoGiovana);

        Contato contatoCarla = new Contato(); // engenharia agronômica
        contatoCarla.setId(5L);
        contatoCarla.setNome("Carla Segatto Strini Paixão Voltarelli");
        contatoCarla.setEmail("carla.voltarelli@facens.br");
        contatoCarla.setTelefone(null);

        contatoRepository.save(contatoCarla);

        Contato contatoAna = new Contato(); // engenharia alimentos
        contatoAna.setId(6L);
        contatoAna.setNome("Ana Laura Tiberio De Jesus");
        contatoAna.setEmail("ana.tiberio@facens.br");
        contatoAna.setTelefone(null);

        contatoRepository.save(contatoAna);

        Contato contatoRodrigo = new Contato(); // engenharia civil
        contatoRodrigo.setId(7L);
        contatoRodrigo.setNome("Rodrigo Geraldo");
        contatoRodrigo.setEmail("rodrigo.geraldo@facens.br");
        contatoRodrigo.setTelefone(null);

        contatoRepository.save(contatoRodrigo);

        Contato contatoRodrigoLuiz = new Contato(); // engenharia produção
        contatoRodrigoLuiz.setId(8L);
        contatoRodrigoLuiz.setNome("Rodrigo Luiz Gigante");
        contatoRodrigoLuiz.setEmail("rodrigo.geraldo@facens.br");
        contatoRodrigoLuiz.setTelefone(null);

        contatoRepository.save(contatoRodrigoLuiz);

        Contato contatoJoao = new Contato(); // engenharia química
        contatoJoao.setId(9L);
        contatoJoao.setNome("João Guilherme Pereira Vicente");
        contatoJoao.setEmail("joao.vicente@facens.br");
        contatoJoao.setTelefone(null);

        contatoRepository.save(contatoJoao);

        Contato contatoDiego = new Contato(); // odontologia
        contatoDiego.setId(10L);
        contatoDiego.setNome("Diego Garcia Diniz");
        contatoDiego.setEmail("diego.garcia@facens.br");
        contatoDiego.setTelefone(null);

        contatoRepository.save(contatoDiego);

        Contato contatoCarolina = new Contato(); // psicologia
        contatoCarolina.setId(11L);
        contatoCarolina.setNome("Carolina Antonelli dos Santos");
        contatoCarolina.setEmail("carolina.antonelli@facens.br");
        contatoCarolina.setTelefone(null);

        contatoRepository.save(contatoCarolina);

        Contato contatoMarcelo = new Contato(); // biomedicina
        contatoMarcelo.setId(12L);
        contatoMarcelo.setNome("Marcelo Andreetta Corral");
        contatoMarcelo.setEmail("Marcelo.andreetta@facens.br");
        contatoMarcelo.setTelefone(null);

        contatoRepository.save(contatoMarcelo);

        Contato contatoHeverton = new Contato(); // engenharia eletrica
        contatoHeverton.setId(13L);
        contatoHeverton.setNome("Heverton Bacca Sanches");
        contatoHeverton.setEmail("heverton.sanches@facens.br");
        contatoHeverton.setTelefone(null);

        contatoRepository.save(contatoHeverton);
    }

    private void vinculateContatoOnCategoria(){
        // Análise e Desenvolvimento de Sistemas

        Categoria categoriaAnaliseDesenvolvimento = categoriaRepository.findById(1L).get();

        Contato contatoEliney = contatoRepository.findById(1L).get();
        contatoEliney.setCategoria(categoriaAnaliseDesenvolvimento);

        List<Contato> contatoTecnologiaList = new ArrayList<>();
        contatoTecnologiaList.add(contatoEliney);

        categoriaAnaliseDesenvolvimento.setContato(contatoTecnologiaList);

        categoriaRepository.save(categoriaAnaliseDesenvolvimento);
        contatoRepository.save(contatoEliney);

        // Tecnologia em Banco de Dados

        Categoria categoriaBancoDados = categoriaRepository.findById(2L).get();

        List<Contato> contatoCategoriaBancoDadosList = new ArrayList<>();
        contatoCategoriaBancoDadosList.add(contatoEliney);

        categoriaBancoDados.setContato(contatoCategoriaBancoDadosList);

        categoriaRepository.save(categoriaBancoDados);

        // Engenharia de Produção

        Categoria categoriaEngenhariaProducao = categoriaRepository.findById(3L).get();

        Contato contatoRodrigoLuiz = contatoRepository.findById(8L).get();
        contatoRodrigoLuiz.setCategoria(categoriaEngenhariaProducao);

        List<Contato> contatoEngenhariaProducaoList = new ArrayList<>();
        contatoEngenhariaProducaoList.add(contatoRodrigoLuiz);

        categoriaEngenhariaProducao.setContato(contatoEngenhariaProducaoList);

        categoriaRepository.save(categoriaEngenhariaProducao);
        contatoRepository.save(contatoRodrigoLuiz);

        // Engenharia Química

        Categoria engenhariaQuimica = categoriaRepository.findById(4L).get();

        Contato contatoJoao = contatoRepository.findById(9L).get();
        contatoJoao.setCategoria(engenhariaQuimica);

        List<Contato> contatoEngenhariaQuimicaList = new ArrayList<>();
        contatoEngenhariaQuimicaList.add(contatoJoao);

        engenhariaQuimica.setContato(contatoEngenhariaQuimicaList);

        categoriaRepository.save(engenhariaQuimica);
        contatoRepository.save(contatoJoao);

        // Engenharia Computação

        Categoria engenhariaComputacao = categoriaRepository.findById(5L).get();

        Contato contatoAndrea = contatoRepository.findById(9L).get();
        contatoAndrea.setCategoria(engenhariaComputacao);

        List<Contato> contatoEngenhariaComputacaoList = new ArrayList<>();
        contatoEngenhariaComputacaoList.add(contatoAndrea);

        engenhariaComputacao.setContato(contatoEngenhariaComputacaoList);

        categoriaRepository.save(engenhariaComputacao);
        contatoRepository.save(contatoAndrea);

        // Engenharia Civil

        Categoria engenhariaCivil = categoriaRepository.findById(6L).get();

        Contato contatoRodrigo = contatoRepository.findById(7L).get();
        contatoRodrigo.setCategoria(engenhariaCivil);

        List<Contato> contatoEngenhariaCivilList = new ArrayList<>();
        contatoEngenhariaCivilList.add(contatoRodrigo);

        engenhariaCivil.setContato(contatoEngenhariaCivilList);

        categoriaRepository.save(engenhariaCivil);
        contatoRepository.save(contatoRodrigo);

        // Engenharia Mecanica

        Categoria engenhariaMecanica = categoriaRepository.findById(7L).get();

        Contato contatoMarcelo = contatoRepository.findById(3L).get();
        contatoMarcelo.setCategoria(engenhariaMecanica);

        List<Contato> contatoEngenhariaMecanicaList = new ArrayList<>();
        contatoEngenhariaMecanicaList.add(contatoMarcelo);

        engenhariaMecanica.setContato(contatoEngenhariaMecanicaList);

        categoriaRepository.save(engenhariaMecanica);
        contatoRepository.save(contatoMarcelo);

        // Engenharia Eletrica

        Categoria engenhariaEletrica = categoriaRepository.findById(8L).get();

        Contato contatoHeverton = contatoRepository.findById(13L).get();
        contatoHeverton.setCategoria(engenhariaEletrica);

        List<Contato> contatoEngenhariaEletricaList = new ArrayList<>();
        contatoEngenhariaEletricaList.add(contatoHeverton);

        engenhariaEletrica.setContato(contatoEngenhariaEletricaList);

        categoriaRepository.save(engenhariaEletrica);
        contatoRepository.save(contatoHeverton);

        // Engenharia mecatronica

        Categoria engenhariaMecatronica = categoriaRepository.findById(9L).get();

        List<Contato> contatoEngenhariaMecatronica = new ArrayList<>();
        contatoEngenhariaMecatronica.add(contatoAndrea);

        engenhariaMecatronica.setContato(contatoEngenhariaMecatronica);

        categoriaRepository.save(engenhariaMecatronica);

        // Engenharia alimentos

        Categoria engenhariaAlimentos = categoriaRepository.findById(10L).get();

        Contato contatoLaura = contatoRepository.findById(6L).get();
        contatoLaura.setCategoria(engenhariaAlimentos);

        List<Contato> contatoEngenhariaAlimentoList = new ArrayList<>();
        contatoEngenhariaAlimentoList.add(contatoLaura);

        engenhariaAlimentos.setContato(contatoEngenhariaEletricaList);

        categoriaRepository.save(engenhariaAlimentos);
        contatoRepository.save(contatoLaura);

        // Tecnologia em Jogos Digitais

        Categoria jogosDigitais = categoriaRepository.findById(11L).get();

        jogosDigitais.setContato(contatoTecnologiaList);

        categoriaRepository.save(jogosDigitais);

        // Engenharia Agronomica

        Categoria engenhariaAgronomica = categoriaRepository.findById(12L).get();

        Contato contatoCarla = contatoRepository.findById(5L).get();
        contatoCarla.setCategoria(engenhariaAgronomica);

        List<Contato> contatoEngenhariaAgronomicaList = new ArrayList<>();
        contatoEngenhariaAgronomicaList.add(contatoCarla);

        engenhariaAgronomica.setContato(contatoEngenhariaAgronomicaList);

        categoriaRepository.save(engenhariaAgronomica);
        contatoRepository.save(contatoCarla);

        // Arquitetura e Urbanismo

        Categoria arquiteturaUrbanismo = categoriaRepository.findById(13L).get();

        Contato contatoGiovana = contatoRepository.findById(4L).get();
        contatoGiovana.setCategoria(arquiteturaUrbanismo);

        List<Contato> contatoArquiteturaUrbanismoList = new ArrayList<>();
        contatoArquiteturaUrbanismoList.add(contatoGiovana);

        arquiteturaUrbanismo.setContato(contatoArquiteturaUrbanismoList);

        categoriaRepository.save(arquiteturaUrbanismo);
        contatoRepository.save(contatoGiovana);

        // Psicologia

        Categoria psicologia = categoriaRepository.findById(14L).get();

        Contato contatoCarolina = contatoRepository.findById(11L).get();
        contatoCarolina.setCategoria(psicologia);

        List<Contato> contatoPsicologiaList = new ArrayList<>();
        contatoPsicologiaList.add(contatoCarolina);

        psicologia.setContato(contatoPsicologiaList);

        categoriaRepository.save(psicologia);
        contatoRepository.save(contatoCarolina);

        // Biomedicina

        Categoria biomedicina = categoriaRepository.findById(15L).get();

        Contato contatoMarceloAndreetta = contatoRepository.findById(12L).get();
        contatoMarceloAndreetta.setCategoria(biomedicina);

        List<Contato> contatoBiomedicinaList = new ArrayList<>();
        contatoBiomedicinaList.add(contatoMarceloAndreetta);

        biomedicina.setContato(contatoBiomedicinaList);

        categoriaRepository.save(biomedicina);
        contatoRepository.save(contatoMarceloAndreetta);

        // Odontologia

        Categoria odontologia = categoriaRepository.findById(16L).get();

        Contato contatoDiego = contatoRepository.findById(10L).get();
        contatoDiego.setCategoria(odontologia);

        List<Contato> contatoOdontologiaList = new ArrayList<>();
        contatoOdontologiaList.add(contatoDiego);

        odontologia.setContato(contatoOdontologiaList);

        categoriaRepository.save(odontologia);
        contatoRepository.save(contatoDiego);
    }
}
