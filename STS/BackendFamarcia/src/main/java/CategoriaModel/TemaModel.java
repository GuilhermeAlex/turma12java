package CategoriaModel;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import com.sun.istack.NotNull;

public class TemaModel {
	@Entity
	@Table(name = "tb_tema")

	public class Tema {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private long id;

		@NotNull
		@Size(min = 5, max = 100)
		private String medicamentos;

		@NotNull
		@Size(min = 5, max = 100)
		private String produtos;

		@NotNull
		private double preco;

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getMedicamentos() {
			return medicamentos;
		}

		public void setMedicamentos(String medicamentos) {
			this.medicamentos = medicamentos;
		}

		public String getProdutos() {
			return produtos;
		}

		public void setProdutos(String produtos) {
			this.produtos = produtos;
		}

		public double getPreco() {
			return preco;
		}

		public void setPreco(double preco) {
			this.preco = preco;
		}

	}
}